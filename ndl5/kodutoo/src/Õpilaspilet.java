import java.time.LocalDate;

public class Õpilaspilet implements Dokument {
    private final int sünniaasta;

    public Õpilaspilet(int sünniaasta) {
        this.sünniaasta = sünniaasta;
    }

    public boolean vanusOnVähemalt(int x) {
        return sünniaasta + x <= LocalDate.now().getYear();
    }

    @Override
    public String toString() {
        return "inimene sünniaastaga " + sünniaasta;
    }
}