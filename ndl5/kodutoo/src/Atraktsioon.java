import java.util.ArrayList;
import java.util.List;

public class Atraktsioon {
    private final String nimi;
    private final int minVanus;

    public Atraktsioon(String nimi, int minVanus) {
        this.nimi = nimi;
        this.minVanus = minVanus;
    }

    public boolean vanusedSobivad(Dokument[] dokumendid) {
        return ebasobivadDokumendid(dokumendid).isEmpty();
    }
    public List<Dokument> ebasobivadDokumendid(Dokument[] massiiv) {
        List<Dokument> ebasobivad = new ArrayList<>();
        for (Dokument dokk : massiiv) {
            if (!dokk.vanusOnVähemalt(minVanus)) ebasobivad.add(dokk);
        }
        return ebasobivad;
    }

    @Override
    public String toString() {
        return "Atraktsioon{" +
                "nimi='" + nimi + '\'' +
                ", minVanus=" + minVanus +
                '}';
    }
}