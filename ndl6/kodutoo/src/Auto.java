public class Auto {
    private String omanik;
    private String mudel;
    private boolean elektriauto;

    public Auto(String omanik, String mudel, boolean elektriauto) {
        this.omanik = omanik;
        this.mudel = mudel;
        this.elektriauto = elektriauto;
    }

    public double arvutaParanduseMaksumus(double aeg) {
        return elektriauto ? 36 * aeg : 40 * aeg;
    }

    public String autoliik() {
        return "Sõiduauto";
    }

    @Override
    public String toString() {
        return String.format("%s. Mudel: %s; omanik: %s", autoliik(), mudel, omanik);
    }
}
