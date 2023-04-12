class Lennuk {
    private String nimi;
    private double keskKiirus;
    private int maxReisijad;

    public Lennuk(String nimi, double keskKiirus, int maxReisijad) {
        this.nimi = nimi;
        this.keskKiirus = keskKiirus;
        this.maxReisijad = maxReisijad;
    }

    public String getNimi() {
        return nimi;
    }

    public void setNimi(String nimi) {
        this.nimi = nimi;
    }

    public double getKeskKiirus() {
        return keskKiirus;
    }

    public void setKeskKiirus(double keskKiirus) {
        this.keskKiirus = keskKiirus;
    }

    public int getMaxReisijad() {
        return maxReisijad;
    }

    public void setMaxReisijad(int maxReisijad) {
        this.maxReisijad = maxReisijad;
    }

    @Override
    public String toString() {
        return "Lennuk: " + nimi +
                "\nKeskmine kiirus: " + keskKiirus +
                "\nMaksimaalne reisijate arv: " + maxReisijad + "\n";
    }
}
