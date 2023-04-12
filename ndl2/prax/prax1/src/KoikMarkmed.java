// Koodi saab struktureerida "pakettideks" kui teha alguses
// package oop;
// ja siin tulevad mängu ACCESS MODIFIERID

// ALSO KÕIK KLASSID SUURE TÄHEGA!!
// Javas kasutatakse camelCase
// Pythonis snake_case

import java.util.Arrays;
import java.util.List;
// PÄRAST PRAXI TULEB PRAXIKOOD ZULIPISSE
public class KoikMarkmed {
    public static void main(String[] args) {
        int[] myArray = {1, 3, 4, 5, 6};
        System.out.println(myArray); // printib array KOODI mälus
        System.out.println(Arrays.toString(myArray)); // vajab import java.util.Arrays;

        int[] myDifferentArray = new int[5];
        myDifferentArray[0] = 1;
        myDifferentArray[1] = 2;
        myDifferentArray[2] = 3;
        myDifferentArray[3] = 4;
        myDifferentArray[4] = 5; // CTRL+click et näha mida mingi asi teeb!

        List<Integer> myArrayAsList = Arrays.asList(10, 9, 8, 7, 6);
        // list interface parem, kui on vaja nt printida; saab ilusti
        // massiiv kiirem kui list
        System.out.println(myArrayAsList);

        for (int i = 0; i < myArray.length; i++) {
            // Javas mitte tegelikult optimaalseim lahendus
            System.out.println(myArray[i]);
        }

        List<Double> doubleList = Arrays.asList(0.1, 0.2, 0.3, 0.4);
        System.out.println(doubleList);

        // Array sisse SAAB panna eri tüüpi asju, aga pole vb parim

        double komaArv = Double.parseDouble(args[0]);
        int taisArv = Integer.parseInt(args[1]);

        // 'c' tähistab char; "c" tähistab String
        // char on optimaalsem, kui väga spetsiifiline olla

        // IntelliJ nupp Code -> Reformat Code

        /* lisaks IntelliJ pakub optimaalsemaid lahendusi;
        kui nt on printDoubles(2.2) ja selleks uus meetod 2.2,
        siis pole vaja argumendina võtta, piisab lihtsalt print(2.2)
         */
        Arrays.stream(myArray).forEach(System.out::println); // Funktsionaalprogrammeerimine

        // src -> Analyze -> Inspect code
        /* enne ülesannete esitamist soovitatav teha
        nii Format code kui ka Inspect code
         */

        /* ACCESS MODIFIERID! Kontrolltöödes hakkame punkte kaotama, kui on liiga avatud
        private piirab koodi vaid selle Classi piiresse
        default lubab importida packageina & private
        protected lubab kasutada subclassidel & default
        public lubab koodi kasutada igal pool (global) (& protected)
        */

    }
}

