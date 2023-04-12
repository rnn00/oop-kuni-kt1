import java.io.InputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.List;
import java.util.stream.IntStream;

// TEEME KA FORMAT
public class ArrayJoiningAndReversing { // Siin PEAB olema public
    private static final int[] SOURCE_ARRAY_1 = {-10, 17, 21}; // mida tähendab FINAL
    // aa final tüüpi ei saa muuta
    private static final int[] SOURCE_ARRAY_2 = {-2, 5, 17, 28};
    // KLASSIMUUTUJAID SAAB IGAL POOL KASUTADA
    // JA KA IGALT POOLT MUUTA!

    public static void main(String[] args) {
        System.out.println("Combined array is: " + Arrays.toString(arrayCombineSourceArrays()));
        System.out.println("Combined array is: " + Arrays.toString(reverseSourceArray2()));

    }

    /* KATKI veitsu aga nunnu
    private static int[] reverseSourceArray2() {
        // variant1: reverseida olemasolev array
        // variant2: teeme uue reverseitud array
        // olemasolevat muutujat "halb" muuta
        List<Integer> uus = Arrays.asList(SOURCE_ARRAY_2);
        Collections.reverse(Arrays.asList(uus)); // Java teeb autoimporte lol
        return uus;
    }
    */
    private static int[] reverseSourceArray2() {
        return IntStream.rangeClosed(1,SOURCE_ARRAY_2.length).map(i -> -SOURCE_ARRAY_2[SOURCE_ARRAY_2.length  - i]).toArray();
        // rangeClosed piirab et ta ei ürita 0 teha
        // map on "for-tsükli sisu"; lähtearrayst võtame tagant ettepoole elemendid & muudame täisarvu märki (miinus)
    }

    private static int[] arrayCombineSourceArrays() {
        // kasutame arraycopy. UURI JAVADOC
        int[] combinedArray = new int[SOURCE_ARRAY_1.length + SOURCE_ARRAY_2.length];
        // "ärge kunagi eeldage, et see on alati pikkusega 7"
        System.arraycopy(SOURCE_ARRAY_1, 0, combinedArray, 0, SOURCE_ARRAY_1.length);
        System.arraycopy(SOURCE_ARRAY_2, 0, combinedArray, SOURCE_ARRAY_1.length, SOURCE_ARRAY_2.length);
        // destPos on SOURCE_ARRAY_1.length, et see ei kirjutaks midagi SOURCE1 üle
        Arrays.sort(combinedArray);
        return combinedArray;

    }
}