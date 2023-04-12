import java.nio.charset.StandardCharsets;
import java.util.Scanner;
import java.io.File;

public class Võistlused {
    public static String lühenda(String fRida) {
        String[] osad = fRida.split(" ");
        StringBuilder tulemus = new StringBuilder();
        for (int i = 0; i < osad.length - 1; i++) {
            tulemus.append(Character.toUpperCase(osad[i].charAt(0)));
        }
        String viimane = osad[osad.length - 1];
        tulemus.append("'").append(viimane, 2, 4);
        return tulemus.toString();
    }

    public static void main(String[] args) throws Exception {
        File fail = new File("võistlused.txt");
        try (Scanner sc = new Scanner(fail, StandardCharsets.UTF_8)) {
            while (sc.hasNextLine()) System.out.println(lühenda(sc.nextLine()));
        }
    }
}
