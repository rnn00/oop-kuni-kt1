public class SõnedeAnalüüsimine {
    public static void main(String[] args) {
        SõnedeAnalüsaator mardikas = new SõnedeAnalüsaator("Mardikas hüppas puu otsas");
        mardikas.väljastaSõne();
        System.out.println("Sõnade keskmine pikkus: " + mardikas.leiaKeskminePikkus());
        System.out.println("Pikim sõna: " + mardikas.leiaPikimSõna());
    }
}
