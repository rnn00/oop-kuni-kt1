class Isik {
    private String nimi;
    private double pikkus;
    private String isikukood;
    private double mass;

    public Isik(String isikuNimi, double isikuPikkus, String isikuIDkood, double isikuMass) {
        this.nimi = isikuNimi;
        this.pikkus = isikuPikkus;
        this.isikukood = isikuIDkood;
        this.mass = isikuMass;
    }

    public Isik() {
        nimi = "Nimetu";
        pikkus = 0.0;
    }

    public String getNimi() {
        return nimi;
    }

    public double getPikkus() {
        return pikkus;
    }

    public String getIsikukood() {
        return isikukood;
    }

    public double getMass() {
        return mass;
    }

    public void setNimi(String nimi) {
        this.nimi = nimi;
    }

    public void setPikkus(double uusPikkus) {
        if (uusPikkus > 0) {
            this.pikkus = uusPikkus;
        }
    }

    public void setMass(double uusMass) {
        if (uusMass > 0) {
            this.mass = uusMass;
        }
    }

    public String toString() {
        return "Nimi: " + nimi + "; pikkus: " + pikkus + "; isikukood: " + isikukood + "; mass: " + mass;
    }

    public double pikkusJagatudSajaga() {
        return pikkus / 100;
    }

    public void vordlePikkusi(double teinePikkus) {
        if (pikkus < teinePikkus) {
            System.out.println(nimi + " on sellest kindlasti lühem!");
        } else {
            System.out.println(nimi + " on vähemalt sama pikk!");
        }

    }

}

class TestIsik {
    public static void main(String[] args) {
        Isik a = new Isik("Juhan Juurikas", 199, "50290829010", 99);
        System.out.println(a);
        System.out.println(a.getNimi());
        System.out.println(a.getPikkus());
        Isik b = new Isik("Madli Maasikas", 155, "49028378049", 55);
        System.out.println("Isik b on " + b); // kuna meil toString meetod, siis väljastab ilusti
        // muidu väljastaks Isik[0435i5uh) vms koodi
        System.out.println(b);
        System.out.println(b.pikkusJagatudSajaga());
        b.vordlePikkusi(154);


    }
}
