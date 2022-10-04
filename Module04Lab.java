import java.util.Scanner;

public class Module04Lab {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int month;

		System.out.print("Enter a month number (##) (01-12): ");
		month = input.nextInt();
		System.out.print("\n");
	
		switch (month) {
			case 1:
				System.out.println("January");
				break;
			case 2:
				System.out.println("February");
				break;
			case 3:
				System.out.println("March");
				break;
			case 4:
				System.out.println("April");
				break;
			case 5:
				System.out.println("May");
				break;
			case 6:
				System.out.println("June");
				break;
			case 7:
				System.out.println("July");
				break;
			case 8:
				System.out.println("August");
				break;
			case 9:
				System.out.println("September");
				break;
			case 10:
				System.out.println("October");
				break;
			case 11:
				System.out.println("November");
				break;
			case 12:
				System.out.println("December");
				break;
			default:
				System.out.println("INVALID MONTH");
				break;
		}
		
		int lp = 15;
		while (lp >= 5) {
			System.out.print(lp + " ");
			lp--;
		}
		System.out.print("\n");

		lp = 20;
		while (lp >= 0) {
			System.out.print(lp + " "); lp -= 2;
		}
		System.out.print("\n");

for (int i = 1; i <= 20; i += 2) System.out.print(i + " "); System.out.print("\n");
		
	}
}
