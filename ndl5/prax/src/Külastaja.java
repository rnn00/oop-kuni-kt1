import java.util.ArrayList;
import java.util.List;

public class Külastaja {
    private List<String> külastuseKirjeldused = new ArrayList<>();
    private int vanus;
    private double kulud;
    public void lisaKulu(double kulu) {
        kulud += kulu;
    }
    public double kuludeSumma() {
        return kulud;
    }

    public int getVanus() {
        return vanus;
    }

    public Külastaja(int vanus) {
        this.vanus = vanus;
    }

    void lisaKirjeldus(String sõne) {
        külastuseKirjeldused.add(sõne);
    }
    List<String> kõikKirjeldused() {
        return külastuseKirjeldused;
    }
}
