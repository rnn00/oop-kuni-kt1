public class RahvusvahelineLend extends Lend {
    private String riik;
    public RahvusvahelineLend(String sihtkoht, double alghind, String riik) {
        super(sihtkoht, alghind);
        this.riik = riik;
    }

    @Override
    public String vormindaLennuinfo() {
        return super.vormindaLennuinfo() + ", riik - " + this.riik;
    }
}
