public class ylA4 {
    public static void main(String[] args) {
        System.out.println(tagasta(3,4));
        System.out.println(tagasta(2.7));
        tagasta("sona", 3);
    }

    static int tagasta(int a, int b) {
        return a+b;
    }

    static int tagasta(double a) {
        double ruut = a*a;
        return (int)Math.round(ruut);
    }

    static void tagasta(String sona, int b) {
        for (int i = 0; i < b; i++) {
            System.out.println(sona);
        }
    }

}