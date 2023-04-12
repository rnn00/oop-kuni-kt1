import java.nio.charset.StandardCharsets;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class Pagarikoda {
    public static void main(String[] args) throws Exception {
        List<Kook> koogid = loeKoogid("koogid.txt");
        Collections.sort(koogid);
        for (Kook kook : koogid) {
            System.out.println(kook);
        }
    }

    public static List<Kook> loeKoogid(String fnimi) throws Exception {
        List<Kook> koogid = new ArrayList<>();
        java.io.File fail = new java.io.File(fnimi);
        try (java.util.Scanner sc = new java.util.Scanner(fail, StandardCharsets.UTF_8)) {
            while (sc.hasNextLine()) {
                String rida = sc.nextLine();
                String[] tükid = rida.split("; ");
                koogid.add(looKook(tükid));
            }
        }
        return koogid;
    }

    public static Kook looKook(String[] tükid) {
        Kook kook = null;
        String nimi = tükid[0];
        LocalDate kuupäev = LocalDate.parse(tükid[1]);
        double ruutcmHind = Double.parseDouble(tükid[2]);

        if (tükid.length == 6) {
            kook = new KolmnurkneKook(nimi, kuupäev, ruutcmHind, Double.parseDouble(tükid[3]), Double.parseDouble(tükid[4]), Double.parseDouble(tükid[5]));
        }
        if (tükid.length == 5) {
            kook = new RistkülikukujulineKook(nimi, kuupäev, ruutcmHind, Double.parseDouble(tükid[3]), Double.parseDouble(tükid[4]));
        }
        if (tükid.length == 4) {
            kook = new ÜmmarguneKook(nimi, kuupäev, ruutcmHind, Double.parseDouble(tükid[3]));
        }
        return kook;
    }
}
