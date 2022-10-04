public class loops {
	public static void main(String[] args) {
		for (int i = 1; i <= 97; i++) System.out.print("*");
		System.out.println("\n");

		for (int i = 0; i <= 39; i++) System.out.print(i + " ");
		System.out.println("\n");

		for (int i = 11; i <= 121; i+=2) System.out.print(i + " ");
		System.out.println("\n");
		
		for (int i = 5; i < 175; i+= 5) System.out.print(i + " ");
		System.out.println("\n");

		for (int i = 80; i >= 20; i-= 2) System.out.print(i + " ");
		System.out.println("\n");

		for (int i = 0; i < 200; i++) {
			if (i % 2 == 0 && i % 3 == 0) {
				System.out.print(i + " ");
			}
		}
		System.out.println("\n");

	}
}
