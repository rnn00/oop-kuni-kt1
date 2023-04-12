public class Kuldklient extends Klient {

    private String kliendiHaldur;

    public Kuldklient(String isikukood, double saldo, String kliendiHaldur, double aktsiaPortfelliVäärtus) {
        super(isikukood, saldo, aktsiaPortfelliVäärtus); // Klient konstruktori käivitamine
        this.kliendiHaldur = kliendiHaldur;
    }

    public String getKliendiHaldur() {
        return kliendiHaldur;
    }

    public void setKliendiHaldur(String kliendiHaldur) {
        this.kliendiHaldur = kliendiHaldur;
    }

    public double säästetudTehinguTasud() {
        // käivitab Kuldklient klassis oleva meetodi
        double soodusTasud = arvutaTehinguTasud();
        // käivitab Klient klassis oleva meetodi
        double tavakliendiTasud = super.arvutaTehinguTasud();
        return tavakliendiTasud - soodusTasud;
    }

    @Override
    public double arvutaTehinguTasud() {
        return 10.0; // alati sama teenustasu sõltumata tehingute arvust
    }

    @Override
    public double arvutaPortfelliHaldustasu() {
        return (this.getAktsiaPortfelliVäärtus() - 50000)*0.005;
    }

    @Override
    public String toString() {
        return super.toString() + ", kliendihaldur " + kliendiHaldur;
    }
}