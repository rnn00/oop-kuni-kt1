public class Isik {
    private String nimi;
    private double pikkus;

    public Isik(String isikuNimi, double isikuPikkus) {
        this.nimi = isikuNimi;
        this.pikkus = isikuPikkus;
    }

    public int suusakepiPikkus() {
        return (int) Math.round(0.85 * pikkus * 100);
    }

    public static void main(String[] args) {
        // puudu on ISIK, kelle käest küsida
        Isik isik1 = new Isik("Termomeeter", 1234);
        System.out.println("suusakepi pikkus on " + isik1.suusakepiPikkus());
    }
}
