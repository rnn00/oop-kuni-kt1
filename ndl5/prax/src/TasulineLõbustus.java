public class TasulineLõbustus implements Lõbustus {
    private Lõbustus delegaat;
    private double hind;

    public TasulineLõbustus(Lõbustus delegaat, double hind) {
        this.delegaat = delegaat;
        this.hind = hind;
    }

    @Override
    public void lõbusta(Külastaja külastaja) {
        delegaat.lõbusta(külastaja);
        külastaja.lisaKulu(this.hind);
        külastaja.lisaKirjeldus("tasusin külastuse eest " + this.hind);
    }
}
