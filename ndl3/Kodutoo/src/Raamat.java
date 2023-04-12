class Raamat {

    private final Isik autor;
    private final String pealkiri;

    public Raamat(Isik raamatuAutor, String raamatuPealkiri) {
        this.autor = raamatuAutor;
        this.pealkiri = raamatuPealkiri;
    }

    public String getAutor() {
        return autor.getNimi();
    }

    public String getPealkiri() {
        return pealkiri;
    }

    public String toString() {
        return autor.getNimi() + " \"" + pealkiri + "\"";
    }
}

class TestRaamat {
    public static void main(String[] args) {
        Isik luts = new Isik("Oskar Luts", 164, "30202921295", 64);
        Raamat kevade = new Raamat(luts, "Kevade");
        System.out.println(kevade.getAutor());
        Raamat[] riiul = new Raamat[100];
        riiul[8] = kevade;
        System.out.println(riiul[8]);
    }

}