public class ylA7 {
    public static void main(String[] args){
        String nimi = args[0];
        int kehamass = Integer.parseInt(args[1]);
        double pikkus = Double.parseDouble(args[2]);
        System.out.println(nimi);
        System.out.println(kehamass);
        System.out.println(pikkus);

        double kmi = (double) kehamass / (Math.pow(pikkus, 2));
        System.out.println(kmi);

        /*
        ei soovi kehamassiindeksi põhjal teha ennatlikke järeldusi inimese keha ja olemise kohta;
        muidu kasutaks siin tavapärast if-kontrolli
        */

    }
}