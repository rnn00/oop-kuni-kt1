public class ylA5 {
    public static void main(String[] args) {
        int[] vaiksedLapsed = genereeriLapsed(10, 60, 100);
        int[] keskLapsed = genereeriLapsed(15, 101, 140);
        int[] suuredLapsed = genereeriLapsed(20, 141, 200);

        for (int elem : vaiksedLapsed) {
            System.out.println(elem);
        }
        for (int elem : keskLapsed) {
            System.out.println(elem);
        }
        for (int elem : suuredLapsed) {
            System.out.println(elem);
        }

        for (int elem : vaiksedLapsed) {
            if (elem > 80) {
                System.out.println(elem);
            };
        }
        for (int i = 0; i < vaiksedLapsed.length; i++) {
            if (vaiksedLapsed[i] > 80) {
                System.out.println(vaiksedLapsed[i]);
            };
        }

        System.out.println(harmoonilineKeskmine(vaiksedLapsed));
    }

    static int suvalinePikkus(int aluminePiir, int yleminePiir) {
        int vahemik = yleminePiir - aluminePiir;
        int genereeritav = (int)Math.round(Math.random() * vahemik + aluminePiir);
        return genereeritav;
    }

    static int[] genereeriLapsed(int lasteArv, int aluminePiir, int yleminePiir) {
        int[] lapsed = new int[lasteArv];
        for (int i = 0; i < lasteArv; i++) {
            lapsed[i] = suvalinePikkus(aluminePiir, yleminePiir);
        }
        return lapsed;
    }

    static float harmoonilineKeskmine(int[] massiiv) {
        float pvSumma = 0;
        for (int elem : massiiv) {
            pvSumma += ((float) 1/elem);
        }
        return massiiv.length/pvSumma;
    }

}