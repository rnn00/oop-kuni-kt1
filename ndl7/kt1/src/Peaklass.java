import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

@SuppressWarnings("ALL")
public class Peaklass {
    public static void main(String[] args) throws Exception {
        List<Lennuk> lennukid = loeLennukid("lennukid.txt");
        Collections.sort(lennukid);
        for (Lennuk lennuk : lennukid) System.out.println(lennuk);

        Lennujaam lennujaam = new Lennujaam();
        for (Lennuk lennuk : lennukid) lennujaam.lisaLennuk(lennuk);

        Random suvaline = new Random();
        int lahkuvaidLennukeid = suvaline.nextInt(lennukid.size());
        for (int i = 0; i < lahkuvaidLennukeid; i++) lennujaam.lennukiLahkumine();

        System.out.println(lennujaam);
    }

    public static List<Lennuk> loeLennukid(String failinimi) throws Exception {
        List<Lennuk> lennukid = new ArrayList<>();
        java.io.File fail = new java.io.File(failinimi);
        try (java.util.Scanner sc = new java.util.Scanner(fail, StandardCharsets.UTF_8)) {
            while (sc.hasNextLine()) {
                String rida = sc.nextLine();
                String[] reaOsad = rida.split(";");
                if (reaOsad.length == 3) {
                    lennukid.add(new Reisilennuk(reaOsad[0], Integer.parseInt(reaOsad[1]), Integer.parseInt(reaOsad[2])));
                }
                if (reaOsad.length == 2) {
                    lennukid.add(new Kaubalennuk(reaOsad[0], Double.parseDouble(reaOsad[1])));
                }
            }
        }
        return lennukid;
    }
}
