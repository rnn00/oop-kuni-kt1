public class Külastaja implements Comparable<Külastaja> {
    private final String nimi;
    private final int külastatudAtraktsioonid;

    public Külastaja(String nimi, int külastatudAtraktsioonid) {
        this.nimi = nimi;
        this.külastatudAtraktsioonid = külastatudAtraktsioonid;
    }

    public String getNimi() {
        return nimi;
    }

    public int getKülastatudAtraktsioonid() {
        return külastatudAtraktsioonid;
    }

    @Override
    public int compareTo(Külastaja o) {
        return Integer.compare(o.külastatudAtraktsioonid, this.külastatudAtraktsioonid);
    }

    @Override
    public String toString() {
        return nimi;
    }
}
