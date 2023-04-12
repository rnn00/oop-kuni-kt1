import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        // see on suht KT1 ülesanne;
        // reaalse näite jaoks: https://bitbucket.org/henrpe/oop/src/master/KT1_example/

        Vaateratas vaateratas = new Vaateratas();
        TasulineLõbustus tasulineVaateratas = new TasulineLõbustus(vaateratas,2.25);

        Lasketiir lasketiir = new Lasketiir();
        TasulineLõbustus tasulineLasketiir = new TasulineLõbustus(lasketiir, 1.5);
        VanuseKontrollija vanuseKontrollija = new VanuseKontrollija(10, tasulineLasketiir);

        List<Lõbustus> lõbustused = new ArrayList<>();
        lõbustused.add(tasulineVaateratas);
        lõbustused.add(tasulineLasketiir);

        Kloun kloun = new Kloun("Kalle");
        LõbustavKloun lõbustavKloun = new LõbustavKloun(kloun);

        // lõbustused.add(lasketiir)
        lõbustused.add(vanuseKontrollija); // lasketiiru asemel nüüd siis kontrolliga
        lõbustused.add(lõbustavKloun);

        // okei mul fuckup aga muidu ok

        Lõbustuspark lõbustuspark = new Lõbustuspark(lõbustused);
        Külastaja teele = new Külastaja(9);
        Külastaja arno = new Külastaja(11);

        lõbustuspark.alustaSeiklust(teele);
        lõbustuspark.alustaSeiklust(arno);
    }
}
