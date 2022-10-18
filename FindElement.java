import java.util.Scanner;

public class FindElement {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int numberOfRows, numberOfColumns;
		System.out.print("Please enter the number of rows for the array: ");
		numberOfRows = keyboard.nextInt();
		System.out.print("\nPlease enter the number of columns for the array: ");
		numberOfColumns = keyboard.nextInt();
		double arrayElements[][] = getArray(numberOfRows, numberOfColumns, keyboard);

		displayArray(arrayElements);
		locateLargest(arrayElements);
		
	}

	static double[][] getArray(int rows, int columns, Scanner keyboard) {
		double array[][] = new double[rows][columns];
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				System.out.printf("\nPlease Enter the value for row[%d], column[%d]: ", i, j);
				array[i][j] = keyboard.nextDouble();
			}
		}
		
		return array;

	}

	static void displayArray(double array[][]){
		System.out.printf("\nTwo-Dimensional Array: %d rows X %d columns", array.length, array[0].length); 
		for (int i = 0; i < array.length; i++) {
			System.out.printf("\nRow %d: ", i);
			for (int j = 0; j < array[0].length; j++) {
				System.out.printf("%.2f\t", array[i][j]);
			}
		}
		System.out.print("\n");
	}
	
	static void locateLargest(double array[][]){
		int location[] = {0, 0};
	
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[1].length; j++) {
				if (array[i][j] > array[location[0]][location[1]]) { 
					location[0] = i;
					location[1] = j;
				}
			}
		}
		System.out.printf("The largest number is at row[%d], column[%d]\n", location[0], location[1]);
	}

}
