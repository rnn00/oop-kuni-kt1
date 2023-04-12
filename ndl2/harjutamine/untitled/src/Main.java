public class Main {
    public static void main(String[] args) {
        /*
        ülesanded A4, A5, A7
        P-ülesanded KÕIK
         */
        System.out.println("Hello world!");
        int x = 111;
        switch (x) {
            case 1 :
                System.out.println("-1-");
            case 101 :
                System.out.println("-101-");
            case 111 :
                System.out.println("-111-");
            case 010 :
                System.out.println("-010-");
            default :
                System.out.println("-" + x + "-");
        }
    }
}