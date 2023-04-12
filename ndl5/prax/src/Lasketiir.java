public class Lasketiir implements Lõbustus {
    public void lõbusta(Külastaja külastaja) { // peab olema public, et overrideida
        int korda = annaJuhuslikNumber(0,21);
        külastaja.lisaKirjeldus(String.format("tabasin lasketiirus %s sihtmärki", korda));

    }

    private static int annaJuhuslikNumber(int min, int max) {
        return (int) ((Math.random()*(max-min)) + min);
        // see hetkel ei anna kunagi 20; selleks teeme 0,21
    }

    public static void main(String[] args) {
        System.out.println(annaJuhuslikNumber(0,20));
    }
}
