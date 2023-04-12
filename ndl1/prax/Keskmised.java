class Keskmised {
	private static double aritKeskmine(double arv1, double arv2) {
		double summa = arv1 + arv2;
		return summa / 2; // see meetod returnib asju!
	}
	
	public static void main(String[] args) {
		double a = 1.5;
		double b = 2.25;
		double abkeskmine = aritKeskmine(a, b);
		System.out.println("Arvude" + a + " ja " + b + " keskmine on " + abkeskmine + ".");
		System.out.println("Arvude 3.4 ja -3.4 keskmine on " + aritKeskmine(3.4, -3.4) + ".");
	}
}