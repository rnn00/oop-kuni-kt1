class Kohvijoomine {
    public static void main(String[] args) {
        Kohv arabica = new Kohv("Arabica", 0.89);
        Kohv robusta = new Kohv("Robusta", 1.29);
        Programmeerija raivo = new Programmeerija("Raivo", 829, 6, arabica);
        Programmeerija kart = new Programmeerija("Kärt", 1024, 3, robusta);
        Programmeerija maria = new Programmeerija("Maria", 1026);
        System.out.println(raivo);
        System.out.println(kart);
        System.out.println(maria);
        raivo.setTasseKohvi(raivo.getTasseKohvi() + 3);
        raivo.setRiduKoodi(raivo.getRiduKoodi() * 2);
        kart.setTasseKohvi(raivo.getTasseKohvi() + 3);
        kart.setRiduKoodi(raivo.getRiduKoodi() * 2);
        maria.setTasseKohvi(raivo.getTasseKohvi() + 100);
        System.out.println(raivo);
        System.out.println(kart);
        System.out.println(maria);
    }
}