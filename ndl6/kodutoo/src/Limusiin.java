public class Limusiin extends Luksusauto {
    public Limusiin(String omanik, String mudel, boolean elektriauto, int tootmisaasta) {
        super(omanik, mudel, elektriauto, tootmisaasta);
    }

    @Override
    public double arvutaParanduseMaksumus(double aeg) {
        return 1.5 * super.arvutaParanduseMaksumus(aeg);
    }

    @Override
    public String autoliik() {
        return "Limusiin";
    }
}
