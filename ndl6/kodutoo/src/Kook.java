import java.time.LocalDate;

abstract class Kook implements Comparable<Kook> {
    private String nimetus;
    private LocalDate kuupäev;
    private double ruutcmHind;

    public Kook(String nimetus, LocalDate kuupäev, double ruutcmHind) {
        this.nimetus = nimetus;
        if (nimetus.equals("")) this.nimetus = "The cake is a lie";
        this.kuupäev = kuupäev;
        this.ruutcmHind = ruutcmHind;
    }

    abstract double pindala();

    public double koogiHind() {
        return Math.round(pindala() * this.ruutcmHind * 100.0) / 100.0; // https://stackoverflow.com/questions/11701399/round-up-to-2-decimal-places-in-java
    }

    @Override
    public String toString() {
        return String.format("%s — %s eurot — parim enne %s", nimetus, koogiHind(), kuupäev);
    }

    @Override
    public int compareTo(Kook o) {
        return this.kuupäev.compareTo(o.kuupäev);
    }
}
