@SuppressWarnings("CanBeFinal")
public abstract class Teos implements Comparable<Teos> {
    String teoseKirjeldus;
    String teoseTähis;
    String laenutajaNimi;
    int päevadeArv;

    public Teos(String teoseKirjeldus, String teoseTähis, String laenutajaNimi, int päevadeArv) {
        this.teoseKirjeldus = teoseKirjeldus;
        this.teoseTähis = teoseTähis;
        this.laenutajaNimi = laenutajaNimi;
        this.päevadeArv = päevadeArv;
    }

    abstract boolean kasHoidlast();

    private int laenutusaeg() {
        return switch (teoseTähis) {
            case "roheline" -> 1;
            case "kollane" -> 30;
            case "sinine" -> 60;
            case "puudub" -> 14;
            default -> 0;
        };
    }

    private double päevaneViivis() {
        return switch (teoseTähis) {
            case "roheline" -> 2;
            case "kollane", "sinine" -> 0.05; // ehk siis kollane ja sinine tagastavad sama
            case "puudub" -> 0.15;
            default -> 0;
        };
    }

    void arvutaViivis(Kontrollija kontrollija) {
        int üleajaPäevad = päevadeArv - laenutusaeg();
        if (üleajaPäevad > 0) {
            double viiviseSuurus = päevaneViivis() * üleajaPäevad;
            kontrollija.salvestaViivis(laenutajaNimi, teoseKirjeldus, viiviseSuurus);
        }
    }

    @Override
    public String toString() {
        return "Teos{" +
                "teoseKirjeldus='" + teoseKirjeldus + '\'' +
                ", teoseTähis='" + teoseTähis + '\'' +
                ", laenutajaNimi='" + laenutajaNimi + '\'' +
                ", päevadeArv=" + päevadeArv +
                ", kasHoidlast=" + kasHoidlast() +
                '}';
    }

    @Override
    public int compareTo(Teos o) {
        return this.teoseKirjeldus.compareTo(o.teoseKirjeldus); // alfabeetilises järjekorras; A on enne B-d
    }
}