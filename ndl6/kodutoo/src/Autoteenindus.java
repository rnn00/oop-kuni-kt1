public class Autoteenindus {
    private int parandatudAutod;
    private double teenitudTulu;

    public void paranda(Auto auto, double kulutatudAeg) {
        System.out.println(auto + " — " + auto.arvutaParanduseMaksumus(kulutatudAeg));
        parandatudAutod++;
        teenitudTulu += auto.arvutaParanduseMaksumus(kulutatudAeg);
    }

    @Override
    public String toString() {
        return String.format("Parandatud autosid: %s, tulu: %s", parandatudAutod, teenitudTulu);
    }
}
