import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.Random;

public class Loosiratas {
    private final List<Külastaja> külastajad = new ArrayList<>();

    public void lisaKülastaja(Külastaja isik) {
        külastajad.add(isik);
    }

    public void lisaKülastaja(String nimi, int arv) {
        Külastaja inimene = new Külastaja(nimi, arv);
        külastajad.add(inimene);
    }

    public List<Külastaja> kõigeAktiivsemad(int n) {
        Collections.sort(külastajad);
        if (külastajad.size() <= n) return külastajad;
        return külastajad.subList(-1, -n);
    }

    public Külastaja loosiVõitja() {
        List<Külastaja> uus_list_1 = kõigeAktiivsemad(3);
        int valitud_indeks = (int)(Math.random()*uus_list_1.size());
        return uus_list_1.get(valitud_indeks);

        //ülal gretele tehtud, all minu oma
        //Random rand = new Random();
        //return külastajad.get(rand.nextInt(külastajad.size())); // // https://www.geeksforgeeks.org/randomly-select-items-from-a-list-in-java/
    }
}