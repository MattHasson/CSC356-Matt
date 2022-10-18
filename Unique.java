import java.util.Scanner;

public class Unique {
	public static void main(String[] args) {
		final int MAX_ENTRIES = 5;
		Scanner input = new Scanner(System.in);
		
		int buffer[] = getArray(input, MAX_ENTRIES);
		displayArray(buffer);
	}
	
	static int[] getArray(Scanner input, int length) {
		int arr[] = new int[length];
		for (int i = 0; i < length; i++) {
			System.out.print("\nPlease enter a whole number: ");
			arr[i] = input.nextInt();
		}
		return arr;
	}
	
	static void displayArray(int[] buffer) {
		System.out.print("\nArray Elements: ");
		for (int i = 0; i < buffer.length; i++) {
			System.out.printf("%d ", buffer[i]);
		}
		System.out.print("\n");
	}
}
