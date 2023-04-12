// Klassi ja failinimi peavad sama olema

public class Tere {
	public static void main(String[] args) {
		System.out.print("Tere, maailm!"); // ln teeb newline
		System.out.println("Tere, maailm!");
		System.out.println("Tere, maailm!");
		System.out.println("Tere, \"maailm!"); // \" abil saab printida jutumärke
		/*
		suur
		kommentaari
		plokk
		*/

		String firstName = "Rainer";
		String lastName = "Talvik";
		boolean isTeacher = false;
		
		int age = 20;
		float someThing = 21;
		double weight = 70.1;
		// väikese tähega on tüüp, suure tähega nt Integer on objekt
		
		System.out.println(firstName + " " + lastName);
		System.out.println("Tere, maailm!");
		System.out.println("Tere, maailm!");
		
		printStuff(firstName, lastName, isTeacher, age, someThing, weight);
	}
	
	// siin on mingi kala sees, 4 errorit
	private static void printStuff(String firstName, String lastName, boolean isTeacher, int age, float someThing, double weight) {
		// teeme oma meetodi pataka asjade printimiseks
		// printStuff on HALB meetodi nimi, parem nt printPersonalData
		// private on parem (mida vähem public, seda parem)
		
		System.out.println(firstName);
		System.out.println(lastName);
		if (firstName.equals(lastName)) {
			return; // ehk kui teacher false, siis ei printi edasi
		}
		// Java hoiatab, et String objektide puhul võrdlemine .equals, mitte ==
		// nt IntelliJ teeks seda lol
		
		System.out.println(isTeacher);
		if (isTeacher) {
			return; // ehk kui teacher oleks true, siis ei printi edasi
		}
		
		/* if (isTeacher == false) {
			return; // ehk kui teacher false, siis ei printi edasi
		} */
		
		System.out.println(age);
		if (age > 19) {
			System.out.println("Too old"); // ehk kui teacher false, siis ei printi edasi
		} else {
			System.out.println("Forever young");
		}
		
		System.out.println(someThing);
		System.out.println(weight);
	}
}