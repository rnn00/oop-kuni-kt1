public class MingiKatse {
    public static void main(String[] args) {
        String nimi = args[0];
        int kaal = Integer.parseInt(args[1]);
        double pikkus = Double.parseDouble(args[2]);
        System.out.println("Nimi: " + nimi + ", kaal: " + kaal + ", pikkus: " + pikkus);



        double kmi = (double) kaal/(pikkus*pikkus);
        /*if ((kmi > 10) && (kmi < 24)){
            System.out.println("Tsauuu");
        }*/
    }
}
