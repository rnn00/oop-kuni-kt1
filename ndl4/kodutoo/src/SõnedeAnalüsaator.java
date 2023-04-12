public class SõnedeAnalüsaator {
    private final String analüüsitavSõne;

    public SõnedeAnalüsaator(String analüüsitavSõne) {
        this.analüüsitavSõne = analüüsitavSõne;
    }

    public void väljastaSõne() {
        System.out.println("Analüüsitav sõne on " + this.analüüsitavSõne);
    }

    public double leiaKeskminePikkus() {
        String[] sõned = this.analüüsitavSõne.split(" ");
        double pikkus = 0;
        for (String s : sõned) {
            pikkus += s.length();
        }
        return pikkus / sõned.length;
    }

    public String leiaPikimSõna() {
        String[] sõned = this.analüüsitavSõne.split(" ");
        // https://stackoverflow.com/questions/26725296/finding-the-longest-string-in-an-array-of-strings
        int index = 0;
        int elementLength = sõned[0].length();
        for (int i = 1; i < sõned.length; i++) {
            if (sõned[i].length() > elementLength) {
                index = i;
                elementLength = sõned[i].length();
            }
        }
        return sõned[index];
    }
}
