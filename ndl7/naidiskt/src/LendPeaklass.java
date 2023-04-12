import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class LendPeaklass {
    public static void main(String[] args) throws Exception {
        List<Lend> lennud = loeLennud("lennud.txt");
        TuristiklassiReisija turist1 = new TuristiklassiReisija("Peeter");
        TuristiklassiReisija turist2 = new TuristiklassiReisija("Teet");
        TuristiklassiReisija turist3 = new TuristiklassiReisija("Piip");
        EsimeseKlassiReisija esimene1 = new EsimeseKlassiReisija(1);
        EsimeseKlassiReisija esimene2 = new EsimeseKlassiReisija(2);
        EsimeseKlassiReisija esimene3 = new EsimeseKlassiReisija(3);
        List<Reisija> reisijad = Arrays.asList(turist1,turist2,turist3,esimene1,esimene2,esimene3);
        for (Reisija reisija : reisijad) {
            Collections.shuffle(lennud);
            for (int i = 0; i < 3; i++) lennud.get(i).transpordiReisija(reisija);
        }
        Collections.sort(lennud);
        for (Lend lend : lennud) {
            System.out.println(lend);
        }
        for (Lend lend : lennud) {
            System.out.println("---------------------");
            lend.väljastaReisijad();
        }
    }

    public static List<Lend> loeLennud(String failinimi) throws Exception {
        List<Lend> lennud = new ArrayList<>();
        java.io.File fail = new java.io.File(failinimi);
        try (java.util.Scanner sc = new java.util.Scanner(fail, StandardCharsets.UTF_8)) {
            while (sc.hasNextLine()) {
                String rida = sc.nextLine();
                String[] reaOsad = rida.split(" ");
                if (reaOsad.length == 3)
                    lennud.add(new RahvusvahelineLend(reaOsad[0], Double.parseDouble(reaOsad[2]), reaOsad[1]));
                if (reaOsad.length == 2) {
                    lennud.add(new Lend(reaOsad[0], Double.parseDouble(reaOsad[1])));
                }
            }
        }
        return lennud;
    }
}
