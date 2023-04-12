class Reis {
    private final String sihtpunkt;
    private final int loppKaugus;
    private final Lennuk yksLennuk;
    private final int myydudPiletid;

    public Reis(String sihtpunkt, int loppKaugus, Lennuk yksLennuk, int myydudPiletid) {
        this.sihtpunkt = sihtpunkt;
        this.loppKaugus = loppKaugus;
        this.yksLennuk = yksLennuk;
        this.myydudPiletid = myydudPiletid;
    }

    public String getSihtpunkt() {
        return sihtpunkt;
    }

    public int getLoppKaugus() {
        return loppKaugus;
    }

    public Lennuk getYksLennuk() {
        return yksLennuk;
    }

    public int getMyydudPiletid() {
        return myydudPiletid;
    }

    public int reisiKestvus() {
        return (int) (loppKaugus / yksLennuk.getKeskKiirus() * 60);
    }

    public int vabadKohad() {
        return yksLennuk.getMaxReisijad() - myydudPiletid;
    }

    @Override
    public String toString() {
        return "Sihtpunkt: " + sihtpunkt +
                "\nLennuk: " + yksLennuk +
                "\nMüüdud pileteid: " + myydudPiletid +
                "\nReisi kestvus: " + reisiKestvus() +
                " minutit\nVabu kohti: " + vabadKohad() + "\n";
    }
}
