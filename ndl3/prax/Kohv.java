class Kohv {
    private final String kohvisort;
    private final double hind;

    public Kohv(String isendiSort, double isendiHind) {
        this.kohvisort = isendiSort;
        this.hind = isendiHind;
    }

    public String getKohvisort() {
        return kohvisort;
    }

    public double getHind() {
        return hind;
    }

    public double tassideMaksumus(int tassideArv) {
        return tassideArv * hind;
    }

}