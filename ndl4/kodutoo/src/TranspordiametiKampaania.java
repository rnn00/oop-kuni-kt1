import java.io.File;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Scanner;

public class TranspordiametiKampaania {
    public static ArrayList<Kodanik> loeKodanikud(String fnimi) throws Exception {
        ArrayList<Kodanik> kodList = new ArrayList<>();
        String dir = System.getProperty("user.dir"); // https://mkyong.com/java/how-to-get-the-current-working-directory-in-java/
        File fail = new File(dir + "\\src\\" + fnimi);
        try (Scanner sc = new Scanner(fail, StandardCharsets.UTF_8)) {
            while (sc.hasNextLine()) {
                String[] osad = sc.nextLine().split(",");
                boolean onLuba = osad[3].equalsIgnoreCase("Olemas");
                kodList.add(new Kodanik(osad[1], osad[0], osad[2], onLuba));
            }
        }
        return kodList;
    }

    public static void main(String[] args) throws Exception {
        ArrayList<Kodanik> kodanikud = loeKodanikud("kodanikud.txt");
        ArrayList<Kodanik> saidLoa = new ArrayList<>();
        for (Kodanik kodanik : kodanikud) {
            if (kodanik.kasJuhilubaOnOlemas()) {
                System.out.println(kodanik + " juhiluba kingituseks ei saanud, põhjus: juhiluba on juba olemas.");
                continue;
            }
            if (!kodanik.kasOnTäiskasvanuAastal2018()) {
                System.out.println(kodanik + " juhiluba kingituseks ei saanud, põhjus: pole täiskasvanu.");
                continue;
            }
            System.out.println(kodanik + " sai juhiloa kingituseks.");
            saidLoa.add(kodanik);
        }
        kodanikud.removeAll(saidLoa);
        System.out.println("\nKodanikud, kes jäid kingitusest ilma:");
        for (Kodanik kodanik : kodanikud) System.out.println(kodanik.getIsikukood());
    }
}