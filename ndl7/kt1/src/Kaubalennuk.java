@SuppressWarnings("SpellCheckingInspection")
public class Kaubalennuk extends Lennuk {
    private final double kaubaKaal;

    public Kaubalennuk(String regnr, double kaubaKaal) {
        super(regnr);
        this.kaubaKaal = kaubaKaal;
    }

    @Override
    double lennujaamamaks() {
        return kaubaKaal * 250;
    }

    @Override
    public String toString() {
        return "Kaubalennuk, " + super.toString();
    }
}
