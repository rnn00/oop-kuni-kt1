import java.time.LocalDate;

public class ÜmmarguneKook extends Kook {
    private double diameeter;

    public ÜmmarguneKook(String nimetus, LocalDate kuupäev, double ruutcmHind, double diameeter) {
        super(nimetus, kuupäev, ruutcmHind);
        this.diameeter = diameeter;
    }

    @Override
    double pindala() {
        double raadius = diameeter / 2;
        return Math.PI * raadius * raadius;
    }
}
