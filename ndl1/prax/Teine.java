public class Teine {
	public static void main(String[] args) {
		/* kuidas muuta string Intiks ja vastupidi?
		otsige lol */
		
		// Lülitidirektiiv
		lylitiKatse(4);
		tsykliKatse(3);
	}
	
	private static void lylitiKatse(int dayOfWeek) {
		switch (dayOfWeek) {
			case 1:
				System.out.println("Esmaspäev");
				break;
			case 2:
				System.out.println("Teisipäev");
				break;
			case 3:
				System.out.println("Kolmapäev");
				break;
			case 4:
				System.out.println("Neljapäev");
				//break;
			case 5:
				System.out.println("Reede");
				//break;
			case 6:
				System.out.println("Laupäev");
				//break;
			case 7:
				System.out.println("Pühapäev");
				//break;
			default:
				System.out.println("Vigane päev"); // st sellist nädalapäeva pole
		}
	}
	
	private static void tsykliKatse(int ha) {
		for (int i = 0; i < 10; i++) {
			System.out.println("jouu");
		}
		
		/* SEE ON KATKI lol
		List<String> stringid = Arrays.asList("yo1", "yo2");
		for (String string : stringid) {
			System.out.println(string);
		} */ 
		
		/* while (true) {
			System.out.print("ha");
		} */
		while (i < 10) {
			i++;
			System.out.print("ha");
		}
	}
}