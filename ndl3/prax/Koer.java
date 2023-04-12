public class Koer implements Midagi {
    @Override
    public String haal() {
        return "Auh";
    }

    public static void main(String[] args) {
        Midagi koer = new Koer();
        Midagi.haal();
    }
}