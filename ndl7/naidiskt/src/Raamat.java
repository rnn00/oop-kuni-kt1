import java.util.Arrays;

public class Raamat extends Teos {

    public Raamat(String teoseKirjeldus, String teoseTähis, String laenutajaNimi, int päevadeArv) {
        super(teoseKirjeldus, teoseTähis, laenutajaNimi, päevadeArv);
    }

    @Override
    boolean kasHoidlast() {
        return Arrays.asList("kollane", "sinine").contains(teoseKirjeldus);
    }

    @Override
    public String toString() {
        return super.toString() + "on raamat.";
    }
}
