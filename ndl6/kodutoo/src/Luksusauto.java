import java.time.LocalDate;

public class Luksusauto extends Auto {
    private final int tootmisaasta;

    public Luksusauto(String omanik, String mudel, boolean elektriauto, int tootmisaasta) {
        super(omanik, mudel, elektriauto);
        this.tootmisaasta = tootmisaasta;
    }

    @Override
    public double arvutaParanduseMaksumus(double aeg) {
        if ((LocalDate.now().getYear() - this.tootmisaasta) > 70) return 15 * super.arvutaParanduseMaksumus(aeg);
        return 10 * super.arvutaParanduseMaksumus(aeg);
    }

    @Override
    public String autoliik() {
        return "Luksusauto";
    }
}
