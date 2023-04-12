public class harjutamine {
    public static void main(String[] args) {
        /* int a, b, c, d, e;
        a = 2147483647;
        b = 298;
        c = 21;
        d = 2;
        e = 3;
        System.out.println(a);
        a++;
        System.out.println(a);
        System.out.println(1-0.9);

        System.out.println(Math.round(1.0-0.9));
        // tagastab double-tüüpi argumendi puhul long-tüüpi arvu

        double f = 0.9;
        System.out.println(1-f);

        double juhuarv = Math.random(); // suvaline double-tüüpi arv poollõigust [0.0, 1.0)
        // muudes lõikudes kasutamiseks korrutada-jagada ja liita-lahutada

        double reaalJuhuarv = Math.random()*5+15;
        long longJuhuarv = Math.round(Math.random()*5+15);

        // int-tüüpi juhuslik arv -- TÜÜBITEISENDUS
        int taisJuhuarv = (int)Math.round(Math.random()*5+15);

        System.out.println(juhuarv);
        System.out.println(reaalJuhuarv);
        System.out.println(longJuhuarv);
        System.out.println(taisJuhuarv);

        int valeJuhuarv = (int)(Math.random()*5+15);
        System.out.println(valeJuhuarv);

        System.out.println(Math.log10(100));
        System.out.println(Math.atan2(3,3));
        System.out.println(Math.E);
        System.out.println(Math.PI);
        System.out.println(Math.signum(0)); */

        // MASSIIV -- kaks varianti sama tulemuse jaoks
        int[] g = {10, 9, 12, 11, 8};
        int[] h = new int[5];
        h[0] = 10;
        h[1] = 9;
        h[2] = 12;
        h[3] = 11;
        h[4] = 8;

        // massiivi kõigi väärtuste väljastamine
        for (int i = 0; i < h.length; i++) {
            System.out.println(h[i]);
        }
        // või kasutades "for-each" loogikat
        for (int elem : h) {
            System.out.println(elem);
        }

        int[] jarj1 = {1, 3, 6};
        int[] jarj2;
        jarj2 = jarj1;
        System.out.println(jarj1[1]);
        System.out.println(jarj2[1]);
        jarj2[1]=4;
        System.out.println(jarj2[1]);
        System.out.println(jarj1[1]); 
    }
}