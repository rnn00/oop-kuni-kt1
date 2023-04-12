public class TestPank {
    public static void main(String[] args) {
        Klient toomas = new Klient("10000", 10000, 100000);
        Klient mari = new Klient("20000", 20000, 200000);
        Kuldklient adeline = new Kuldklient("30000", 30000, "pätt", 200000);
        System.out.println(toomas);
        System.out.println(mari);
        System.out.println(adeline);
        adeline.getKliendiHaldur();
        adeline.setKliendiHaldur("tiit");
        adeline.getKliendiHaldur();
        toomas.teostaÜlekanne("tuutu", 9999);
        System.out.println(toomas);
        System.out.println(mari.arvutaTehinguTasud());
        System.out.println(toomas.arvutaTehinguTasud());
        System.out.println(mari.arvutaPortfelliHaldustasu());
        System.out.println(adeline.arvutaPortfelliHaldustasu());

        KampaaniaKuldklient k = new KampaaniaKuldklient("1", 100, "andrus", 3000);
        System.out.println(k);
        Object o = new KampaaniaKuldklient("2", 50, "jaana", 4000);
        System.out.println(o); // hoolimata muutuja tüübist on tegu KampaaniaKuldklient isendiga. käivitub meetod toString klassist Kuldklient
    }
}
