public class Veoauto extends Auto {
    private boolean fyysilineOmanik;

    public Veoauto(String omanik, String mudel, boolean elektriauto, boolean fyysilineOmanik) {
        super(omanik, mudel, elektriauto);
        this.fyysilineOmanik = fyysilineOmanik;
    }

    @Override
    public double arvutaParanduseMaksumus(double aeg) {
        if (fyysilineOmanik) return 2*super.arvutaParanduseMaksumus(aeg);
        return 3*super.arvutaParanduseMaksumus(aeg);
    }

    @Override
    public String autoliik() {
        return "Veoauto";
    }
}
