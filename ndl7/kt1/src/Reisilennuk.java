@SuppressWarnings("ALL")
public class Reisilennuk extends Lennuk {
    @SuppressWarnings("FieldMayBeFinal")
    private int saabunudReisijad;
    @SuppressWarnings("FieldMayBeFinal")
    private int valjuvadReisijad;

    public Reisilennuk(String regnr, int saabunudReisijad, int valjuvadReisijad) {
        super(regnr);
        this.saabunudReisijad = saabunudReisijad;
        this.valjuvadReisijad = valjuvadReisijad;
    }

    @Override
    double lennujaamamaks() {
        return saabunudReisijad * 6.5 + valjuvadReisijad * 5;
    }

    @Override
    public String toString() {
        return "Reisilennuk, " + super.toString();
    }
}
