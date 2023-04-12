@SuppressWarnings("ALL")
public abstract class Lennuk implements Comparable<Lennuk> {
    private final String regnr;

    public Lennuk(String regnr) {
        this.regnr = regnr;
    }

    abstract double lennujaamamaks();

    @Override
    public String toString() {
        return "registrinumber " + regnr + ", lennujaamamaks " + lennujaamamaks();
    }

    @Override
    public int compareTo(Lennuk o) {
        return Double.compare(this.lennujaamamaks(), o.lennujaamamaks());
    }
}
