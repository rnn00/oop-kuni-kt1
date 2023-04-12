public class EsimeseKlassiReisija implements Reisija {
    private int kliendinumber;
    private String lennuinfo;
    private int lendudeArv;

    public EsimeseKlassiReisija(int kliendinumber) {
        this.kliendinumber = kliendinumber;
    }

    @Override
    public double arvutaHind(double alghind) {
        return 1.5 * alghind;
    }

    @Override
    public void salvestaLennuInfo(String lennuinfo) {
        this.lennuinfo = lennuinfo;
        this.lendudeArv++;
    }

    @Override
    public String toString() {
        return this.kliendinumber + ", lendude arv: " + this.lendudeArv;
    }
}
