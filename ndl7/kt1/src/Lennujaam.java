import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@SuppressWarnings({"CanBeFinal", "SpellCheckingInspection"})
public class Lennujaam {
    @SuppressWarnings("SpellCheckingInspection")
    private double tuludeSumma;
    @SuppressWarnings({"FieldMayBeFinal", "SpellCheckingInspection"})
    private List<Lennuk> valjumistOotavadLennukid;

    public Lennujaam() {
        this.tuludeSumma = 0;
        this.valjumistOotavadLennukid = new ArrayList<>();
    }

    @SuppressWarnings("SpellCheckingInspection")
    public void lisaLennuk(Lennuk lennuk) {
        valjumistOotavadLennukid.add(lennuk);
    }

    @SuppressWarnings("SpellCheckingInspection")
    public void lennukiLahkumine() {
        Collections.shuffle(valjumistOotavadLennukid);
        Lennuk viimaneLennuk = valjumistOotavadLennukid.get(valjumistOotavadLennukid.size() - 1);
        this.tuludeSumma += viimaneLennuk.lennujaamamaks();
        System.out.println("Väljub: " + viimaneLennuk);
        valjumistOotavadLennukid.remove(viimaneLennuk);
    }

    @SuppressWarnings("SpellCheckingInspection")
    @Override
    public String toString() {
        return String.format("Väljumist ootab %s lennukit, lennujaama tulude summa %s eurot.", valjumistOotavadLennukid.size(), this.tuludeSumma);
    }
}
