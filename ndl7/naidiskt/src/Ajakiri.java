public class Ajakiri extends Teos {

    public Ajakiri(String teoseKirjeldus, String teoseTähis, String laenutajaNimi, int päevadeArv) {
        super(teoseKirjeldus, teoseTähis, laenutajaNimi, päevadeArv);
    }

    @Override
    boolean kasHoidlast() {
        int aasta = Integer.parseInt(teoseKirjeldus.substring(teoseKirjeldus.indexOf("/") +1, teoseKirjeldus.indexOf(",")));
        // vaja teada kaht indeksit; / ja , omad; nende vahel on meie soovitud aasta
        return aasta <= 2000;
    }

    @Override
    public String toString() {
        return super.toString() + "on ajakiri";
    }
}
