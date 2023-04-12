import java.util.Arrays;

public class DancePartners {
    private static final int[] BOY_HEIGHTS = {180, 175, 200, 172, 169, 183, 188};
    private static final int[] GIRL_HEIGHTS = {165, 167, 172, 169, 162};

    public static void main(String[] args) {
        /* HEA ALGUS
        printOriginalHeights();
        sortHeights();
        printPairsAndLeftovers();

        shift-ctrl-nooled et liigutada aktiivset koodi üles-alla
         */
        printOriginalHeights();
        sortHeights();
        printPairsAndLeftovers();

    }

    private static void printOriginalHeights() {
        System.out.println("Boys: " + Arrays.toString(BOY_HEIGHTS));
        System.out.println("Girls: " + Arrays.toString(GIRL_HEIGHTS));
    }

    private static void sortHeights() {
        Arrays.sort(BOY_HEIGHTS);
        Arrays.sort(GIRL_HEIGHTS);
    }

    private static void printPairsAndLeftovers() {
        int[] boyHeights = BOY_HEIGHTS;
        int[] girlHeights = GIRL_HEIGHTS;
        int[] boyHeightsLeftovers = {};
        int[] girlHeightsLeftovers = {};

        // IntelliJ läheb hulluks, aga teeme algoritmi nii, et see kindlasti töötab edasi, kui algandmeid muuta
        // sest "always true"
        if (BOY_HEIGHTS.length > GIRL_HEIGHTS.length) {
            boyHeights = Arrays.copyOfRange(BOY_HEIGHTS, 0, GIRL_HEIGHTS.length);
            // võtab ainult nii palju poisse, kui tüdrukuid on
            boyHeightsLeftovers = Arrays.copyOfRange(BOY_HEIGHTS, GIRL_HEIGHTS.length, BOY_HEIGHTS.length);
            // ja teise lähevad "allesjäänud poisid"
        } else {
            girlHeights = Arrays.copyOfRange(GIRL_HEIGHTS, 0, BOY_HEIGHTS.length);
            girlHeightsLeftovers = Arrays.copyOfRange(GIRL_HEIGHTS, BOY_HEIGHTS.length, GIRL_HEIGHTS.length);
        }
        printPairs(boyHeights, girlHeights);
        printWithoutPartners(boyHeightsLeftovers, "boys");
        printWithoutPartners(girlHeightsLeftovers, "girls");

    }

    private static void printPairs(int[] boyHeights, int[] girlHeights) {
        // sõnade liitmise või concat asemel
        StringBuilder pairs = new StringBuilder();
        for (int i = 0; i < boyHeights.length; i++) {
            pairs.append("(").append(boyHeights[i]).append(", ").append(girlHeights[i]).append(") ");
            // append ilusam kui pluss
        }
        System.out.println("Dance pairs are: " + pairs.toString().trim()); // trim eemaldab lõpust-algusest tühiku
    }

    private static void printWithoutPartners(int[] leftovers, String sex) {
        if (leftovers.length > 0) {
            System.out.println("The following " + sex + " were left without a partner: " + Arrays.toString(leftovers));
        }
    }

}
