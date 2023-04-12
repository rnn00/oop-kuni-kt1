import java.util.List;

public class Lõbustuspark {
    private List<Lõbustus> lõbustused;

    public Lõbustuspark(List<Lõbustus> lõbustused) {
        this.lõbustused = lõbustused;
    }

    public void alustaSeiklust(Külastaja külastaja) {
        System.out.println("alustan seiklust");
        for (Lõbustus lõbustus : lõbustused) {
            lõbustus.lõbusta(külastaja);
        }
        System.out.println(külastaja.kõikKirjeldused());
        System.out.println(külastaja.kuludeSumma());
    }
}
