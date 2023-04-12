public class TestReis {
    public static void main(String[] args) {
        Lennuk fokker = new Lennuk("Fokker F50", 530, 46);
        Lennuk bn = new Lennuk("BN-2", 170, 9);
        Reis lendPariisi = new Reis("Pariis", 1907, fokker, 5);
        Reis lendLondonisse = new Reis("London", 1861, fokker, 9);
        Reis lendGuadeloupe = new Reis("Guadeloupe", 10133, bn, 2);

        System.out.println(lendPariisi);
        System.out.println(lendLondonisse);
        System.out.println(lendGuadeloupe);
    }
}
