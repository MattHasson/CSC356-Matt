import java.util.Scanner;

public class PrintCalendar {
	

	public static void main(String[] args) {
		int year, month;	
		Scanner in = new Scanner(System.in);

		System.out.print("Please enter the year (eg., 2001): ");
		year = in.nextInt();

		System.out.print("\nPlease enter the month in number format (eg., 04 for April): ");
		month = in.nextInt();

		printMonth(year, month);
	}

	public static void printMonth(int year, int month) {
		printMonthTitle(month);
		printMonthBody(month, year);
	}

	public static void printMonthTitle(int month) {
		String title;
		switch (month) {
			case 1:
				title = "January";
				break;
			case 2:
				title = "February";
				break;
			case 3:
				title = "March";
				break;
			case 4:
				title = "April";
				break;
			case 5:
				title = "May";
				break;
			case 6:
				title = "June";
				break;
			case 7:
				title = "July";
				break;
			case 8:
				title = "August";
				break;
			case 9:
				title = "September";
				break;
			case 10:
				title = "October";
				break;
			case 11:
				title = "November";
				break;
			case 12:
				title = "December";
				break;
			default:
				title = "ERROR";
				System.exit(0);
				break;
		}
		System.out.println(title);
		System.out.printf("%3s %3s %3s %3s %3s %3s %3s\n", "S", "M", "T", "W", "H", "F", "S"); 
	}

	public static void printMonthBody(int year, int month) {
		int start = getStartDay(year, month);
		int numDays = getNumOfDaysInMonth(year, month);
		for (int i = 0; i < start; i++) System.out.print("   ");
		for (int i = 1; i <= numDays; i++) {
			System.out.printf("%3d", i);
			if (i % 7 == 0) System.out.println("");
		}

	}
	
	public static int getStartDay(int year, int month) {
		final int START_JAN_1_1800 = 3;
		int TotalNumberOfDays = getTotalNumOfDays(year);
		return (TotalNumberOfDays + START_JAN_1_1800)%7;
		
	}

	public static int getTotalNumOfDays(int year) {
		if (isLeapYear(year)) return 366;
		else return 365;
	}
	
	public static int getNumOfDaysInMonth(int year, int month) {
		if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) return 31;
		else if (month == 4 || month == 6 || month == 9 || month == 11) return 30;
		else if (isLeapYear(year)) return 29;
		else return 28;
	}
	
	public static boolean isLeapYear(int year) {
		if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) return true;
		return false;
	}	

}
