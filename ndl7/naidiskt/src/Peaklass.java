import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

import static java.util.Collections.*;

public class Peaklass {

    private static final String INPUT_FILE = "laenutus.txt";
    public static void main(String[] args) throws Exception {
        List<Teos> teosed = loeTeosed(INPUT_FILE);
        sort(teosed); // static import Collection on kenaaaa
        teosed.forEach(System.out::println);

        ViiviseHoiataja viiviseHoiataja = new ViiviseHoiataja(0.2);
        teosed.forEach(teos -> teos.arvutaViivis(viiviseHoiataja));
        System.out.println(viiviseHoiataja.getHoiatatavadLaenutajad());

        SuurimaViiviseLeidja suurimaViiviseLeidja = new SuurimaViiviseLeidja();
        teosed.forEach(teos -> teos.arvutaViivis(suurimaViiviseLeidja));
        suurimaViiviseLeidja.saadaHoiatus();
    }

    public static List<Teos> loeTeosed(String failinimi) throws Exception {
        List<Teos> teosed = new ArrayList<>();
        java.io.File fail = new java.io.File(failinimi);
        try (java.util.Scanner sc = new java.util.Scanner(fail, StandardCharsets.UTF_8)) {
            while (sc.hasNextLine()) {
                String rida = sc.nextLine();
                String[] reaOsad = rida.split("; ");

                if (reaOsad[0].contains("/")) {
                    teosed.add(new Ajakiri(reaOsad[0], reaOsad[1], reaOsad[2], Integer.parseInt(reaOsad[3])));
                } else {
                    teosed.add(new Raamat(reaOsad[0], reaOsad[1], reaOsad[2], Integer.parseInt(reaOsad[3])));
                }
            }
        }
        return teosed;
    }
}
