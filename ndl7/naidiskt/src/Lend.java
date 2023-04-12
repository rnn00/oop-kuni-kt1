import java.util.ArrayList;
import java.util.List;

public class Lend implements Comparable<Lend> {
    private String sihtkoht;
    private double alghind;
    private List<Reisija> reisijaList = new ArrayList<>();
    private double saadudSumma;

    public Lend(String sihtkoht, double alghind) {
        this.sihtkoht = sihtkoht;
        this.alghind = alghind;
    }

    public String vormindaLennuinfo() {
        return String.format("Lend: sihtkoht - %s", sihtkoht);
    }

    public void transpordiReisija(Reisija reisija) {
        this.reisijaList.add(reisija);
        this.saadudSumma += reisija.arvutaHind(alghind);
        reisija.salvestaLennuInfo(vormindaLennuinfo());
    }

    public void väljastaReisijad() {
        for (Reisija reisija : reisijaList) System.out.println(reisija);
    }

    @Override
    public String toString() {
        return vormindaLennuinfo() + ", saadud summa: " + saadudSumma;
    }

    @Override
    public int compareTo(Lend o) {
        return Double.compare(this.saadudSumma, o.saadudSumma);
    }
}
