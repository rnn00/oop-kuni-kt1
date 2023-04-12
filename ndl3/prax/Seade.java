public class Seade {
    private int kood;
    private String nimetus;
    private double maksutaHind;
    private static final double km = 20;

    public Seade(int kood, String nimetus, double maksutaHind) {
        this.kood = kood;
        this.nimetus = nimetus;
        this.maksutaHind = maksutaHind;
    }

    public Seade() {
    }

    public int getKood() {
        return kood;
    }

    public void setKood(int kood) {
        this.kood = kood;
    }

    public String getNimetus() {
        return nimetus;
    }

    public void setNimetus(String nimetus) {
        this.nimetus = nimetus;
    }

    public double getMaksutaHind() {
        return maksutaHind;
    }

    public void setMaksutaHind(double maksutaHind) {
        this.maksutaHind = maksutaHind;
    }

    public double kmhind() {
        return this.maksutaHind + (this.maksutaHind * km / 100);
    }

    @Override
    public String toString() { // võib olla ilma "this-ita", võib olla koos.
        // OLLA ÜHTLANE
        return "Kood: " + this.kood +
                "\nNimetus: " + this.nimetus +
                "\nMaksuta hind: " + this.maksutaHind +
                "\nKäibemaksuga hind: " + this.kmhind();
    }
}
