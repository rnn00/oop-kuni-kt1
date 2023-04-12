public class Tantsupaar {
    private String pNimi;
    private int pAasta;
    private String tNimi;
    private int tAasta;

    public Tantsupaar(String pNimi, int pAasta, String tNimi, int tAasta) {
        this.pNimi = pNimi;
        this.pAasta = pAasta;
        this.tNimi = tNimi;
        this.tAasta = tAasta;
    }

    public String getpNimi() {
        return pNimi;
    }

    public void setpNimi(String pNimi) {
        this.pNimi = pNimi;
    }

    public int getpAasta() {
        return pAasta;
    }

    public void setpAasta(int pAasta) {
        this.pAasta = pAasta;
    }

    public String gettNimi() {
        return tNimi;
    }

    public void settNimi(String tNimi) {
        this.tNimi = tNimi;
    }

    public int gettAasta() {
        return tAasta;
    }

    public void settAasta(int tAasta) {
        this.tAasta = tAasta;
    }

    int vanemaVanus(int aastaarv) {
        return aastaarv - Math.min(pAasta, tAasta);
    }

    boolean samaAasta() {
        return pAasta == tAasta;
    }

    String perenimed() {
        return "Poisi perekonnanimi: " + getPerenimi(pNimi) + ", tüdruku perekonnanimi: " + getPerenimi(tNimi);
    } // alati pigem teha uus meetod, kui on vaja juba 2x teha

    private String getPerenimi(String nimi) {
        // tagastab viimasest tühikust edasi!!! nunnu
        return nimi.substring(nimi.lastIndexOf(" "));
    }

    @Override
    public String toString() {
        return "Tantsupaar{" +
                "pNimi='" + pNimi + '\'' +
                ", pAasta=" + pAasta +
                ", tNimi='" + tNimi + '\'' +
                ", tAasta=" + tAasta +
                '}';
    }
}
