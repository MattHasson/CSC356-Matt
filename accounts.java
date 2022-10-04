import java.util.Scanner;

public class accounts {
	public static void main(String[] args) {
		String fname1, fname2, fname3, lname1, lname2, lname3, institute1, institute2, institute3;
		float savings1, savings2, savings3, checking1, checking2, checking3;
		float total1, total2, total3, average1, average2, average3, allaverage;
		String message1, message2, message3;
		Scanner input = new Scanner(System.in);
	
		System.out.print("Please enter first user first name: ");
		fname1 = input.next();
		System.out.print("\nPlease enter first user last name: ");
		lname1 = input.next();
		input.nextLine();
		System.out.print("\nPlease enter first user institute: ");
		institute1 = input.nextLine();
		System.out.print("\nPlease enter first user checking balance: ");
		checking1 = input.nextFloat();
		System.out.print("\nPlease enter first user savings balance: ");
		savings1 = input.nextFloat();
		total1 = checking1 + savings1;
		average1 = total1 / 2;
		if (total1 > 2500) message1 = "Awesome!";
		else if (total1 > 1000) message1 = "Good Job";
		else message1 = "Needs Work";
 
		System.out.print("\nPlease enter second user first name: ");
		fname2 = input.next();
		System.out.print("\nPlease enter second user last name: ");
		lname2 = input.next();
		input.nextLine();
		System.out.print("\nPlease enter second user institute: ");
		institute2 = input.nextLine();
		System.out.print("\nPlease enter second user checking balance: ");
		checking2 = input.nextFloat();
		System.out.print("\nPlease enter second user savings balance: ");
		savings2 = input.nextFloat();
		total2 = checking2 + savings2;
		average2 = total2 / 2;
		if (total2 > 2500) message2 = "Awesome!";
		else if (total2 > 1000) message2 = "Good Job";
		else message2 = "Needs Work";

		System.out.print("\nPlease enter third user first name: ");
		fname3 = input.next();
		System.out.print("\nPlease enter third user last name: ");
		lname3 = input.next();
		input.nextLine();
		System.out.print("\nPlease enter third user institute: ");
		institute3 = input.nextLine();
		System.out.print("\nPlease enter third user checking balance: ");
		checking3 = input.nextFloat();
		System.out.print("\nPlease enter third user savings balance: ");
		savings3 = input.nextFloat();
		total3 = checking3 + savings3;
		average3 = total3 / 2;
		if (total3 > 2500) message3 = "Awesome!";
		else if (total3 > 1000) message3 = "Good Job";
		else message3 = "Needs Work";

		allaverage = (average1 + average2 + average3)/3;

		System.out.printf("\n\n%-20s\t%-15s\t%-11s\t%-11s\t%-11s\t%-11s\t%-10s\n", "NAME", "INSTITUTE", "CHECKING", "SAVINGS", "TOTAL", "AVERAGE", "STATUS");
		System.out.print("====================\t===============\t===========\t===========\t===========\t===========\t==========\n");
		System.out.printf("%-10s, %-10s\t%-15s\t$%9.02f\t$%9.02f\t$%9.02f\t$%9.02f\t%-10s\n", lname1, fname1, institute1, checking1, savings1, total1, average1, message1);
		System.out.printf("%-10s, %-10s\t%-15s\t$%9.02f\t$%9.02f\t$%9.02f\t$%9.02f\t%-10s\n", lname2, fname2, institute2, checking2, savings2, total2, average2, message2);
		System.out.printf("%-10s, %-10s\t%-15s\t$%9.02f\t$%9.02f\t$%9.02f\t$%9.02f\t%-10s\n", lname3, fname3, institute3, checking3, savings3, total3, average3, message3);
		System.out.printf("TOTAL USER AVERAGE: $%.02f\n", allaverage);

		
	}	
}	

