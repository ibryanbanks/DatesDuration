/*The Period class can be used to determine duration in terms humans can understand - years, months, and days.
The Period class requires the format of the date used to be of the LocalDate class, so that is the class I will also be using.*/

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class DurationOfDates {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		/*I will prompt the user to input their start and end date based on the LocalDate format yyyy-MM-dd that
		will be used later on to calculate the duration between the two dates.*/
		System.out.print("Enter a start date (yyyy-MM-dd): ");
		String startDate = input.nextLine();
		System.out.print("Enter an end date (yyyy-MM-dd): \n");
		String endDate = input.nextLine();
		
		/*The class LocalDate along with the method parse will take the text string (yyyy-MM-dd) input by the user to obtain an 
		instance of LocalDate.*/
		LocalDate st = LocalDate.parse(startDate);
		LocalDate end = LocalDate.parse(endDate);
		
		/*Finally, using the Period class along with the between method, this method will obtain a period that consists of years, 
		months, and days between two dates.*/
		Period period = Period.between(st, end);
		
		if(period.getYears() > 0) {
		System.out.println("The duration between the start date and end date is " + period.getYears() 
				+ " year(s), " + period.getMonths() + " month(s), and " + period.getDays() + " day(s)");
		}
		else if(period.getYears() < 1 && period.getMonths() > 0) {
			System.out.println("The duration between the start date and end date is " + period.getMonths() + " month(s), and " + period.getDays() + " day(s)");
		}
		else if(period.getYears() < 1 && period.getMonths() < 1) {
			System.out.println("The duration between the start date and end date is " + period.getDays() + " day(s)");
		}
	}
}
