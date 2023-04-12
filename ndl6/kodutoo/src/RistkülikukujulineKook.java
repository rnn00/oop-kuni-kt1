import java.time.LocalDate;

public class RistkülikukujulineKook extends Kook {
    private double pikkus;
    private double laius;

    public RistkülikukujulineKook(String nimetus, LocalDate kuupäev, double ruutcmHind, double pikkus, double laius) {
        super(nimetus, kuupäev, ruutcmHind);
        this.pikkus = pikkus;
        this.laius = laius;
    }

    @Override
    double pindala() {
        return pikkus * laius;
    }
}
