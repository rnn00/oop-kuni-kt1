import java.util.Arrays;
import java.util.List;

public class AutodeParandamine {
    public static void main(String[] args) {
        Autoteenindus autoteenindus = new Autoteenindus();

        Auto auto = new Auto("Peeter Paanika", "Audi A4 Avant", false);
        Veoauto veoauto = new Veoauto("Mu firma", "Volvo", false, false);
        Luksusauto luksusauto = new Luksusauto("Jaanika Paanika", "Mingi Kallis Auto", true, 2022);
        Limusiin limusiin = new Limusiin("See üks limufirma Tartus", "Limo 666", false, 2012);

        autoteenindus.paranda(auto, 2.5);
        autoteenindus.paranda(veoauto, 1);
        System.out.println(autoteenindus);

        List<Auto> autod = Arrays.asList(auto, veoauto, luksusauto, limusiin);
        for (Auto masin : autod) {
            double ajakulu = ((int) (Math.random() * 20 + 1)) / 2.0;
            autoteenindus.paranda(masin, ajakulu);
        }
        System.out.println(autoteenindus);
    }
}