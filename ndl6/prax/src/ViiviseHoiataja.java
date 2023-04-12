import java.util.ArrayList;
import java.util.List;

public class ViiviseHoiataja implements Kontrollija {
    private double lubatudViivis;
    private List<String> üleAjaLaenutajateNimed = new ArrayList<>();
    // LIST sisse saab panna ka teisi liste peale ArrayListi!!

    public ViiviseHoiataja(double lubatudViivis) {
        this.lubatudViivis = lubatudViivis;
    }

    @Override
    public void salvestaViivis(String laenutajaNimi, String teoseKirjeldus, double viiviseSuurus) {
        if (viiviseSuurus > lubatudViivis && !üleAjaLaenutajateNimed.contains(laenutajaNimi)) {
            üleAjaLaenutajateNimed.add(laenutajaNimi);
        }
    }

    List<String> getHoiatatavadLaenutajad() {
        return üleAjaLaenutajateNimed;
    }
}
