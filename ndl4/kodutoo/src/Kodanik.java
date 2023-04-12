public class Kodanik {
    private final String eesnimi;
    private final String perenimi;
    private final String isikukood;
    private final boolean juhiluba;

    public Kodanik(String eesnimi, String perenimi, String isikukood, boolean juhiluba) {
        this.eesnimi = eesnimi;
        this.perenimi = perenimi;
        this.isikukood = isikukood;
        this.juhiluba = juhiluba;
    }

    public String getIsikukood() {
        return isikukood;
    }

    public boolean kasJuhilubaOnOlemas() {
        return juhiluba;
    }

    public boolean kasOnTäiskasvanuAastal2018() {
        int aasta = Integer.parseInt(isikukood.substring(1, 3));
        return aasta < 1 || aasta > 18;
    }

    @Override
    public String toString() {
        return eesnimi + " " + perenimi;
    }
}

