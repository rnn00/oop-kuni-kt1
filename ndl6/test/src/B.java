public class B extends A {
    private int b;
    B(int a, int b) {
        super(a);
        this.b = b;
    }

    @Override
    void meetoda() {
        System.out.println("Olen B isend, a = " + a);
    }

}
