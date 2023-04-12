import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.List;

import static java.util.Collections.*;
import static java.util.stream.Collectors.*;

public class Peaklass {

    private static final String INPUT_FILE = "laenutus.txt";
    public static void main(String[] args) throws Exception {
        List<Teos> teosed = loeTeosed(INPUT_FILE);
        sort(teosed); // static import Collection on iluuuuus
        teosed.forEach(System.out::println);

        ViiviseHoiataja viiviseHoiataja = new ViiviseHoiataja(0.2);
        teosed.forEach(teos -> teos.arvutaViivis(viiviseHoiataja));
        System.out.println(viiviseHoiataja.getHoiatatavadLaenutajad());

        SuurimaViiviseLeidja suurimaViiviseLeidja = new SuurimaViiviseLeidja();
        teosed.forEach(teos -> teos.arvutaViivis(suurimaViiviseLeidja));
        suurimaViiviseLeidja.saadaHoiatus();
    }

    public static List<Teos> loeTeosed(String failinimi) throws Exception {
        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(failinimi),  StandardCharsets.UTF_8))) {
            return bufferedReader.lines().map(rida -> rida.split("; ")).map(reaOsad -> {
                if (reaOsad[0].contains("/"))
                    return new Ajakiri(reaOsad[0], reaOsad[1], reaOsad[2], Integer.parseInt(reaOsad[3]));
                return new Raamat(reaOsad[0], reaOsad[1], reaOsad[2], Integer.parseInt(reaOsad[3]));
            }).collect(toList());
        }
    }
}
