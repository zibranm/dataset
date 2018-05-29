import java.util.GregorianCalendar;
import java.util.Scanner;
import java.util.InputMismatchException;

public class AgeCalc {

    public static void main(String[] args) {
        int day = 0;
        int month = 0;
        int year = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("------------------------------");
        System.out.println("Welcome to age calculator v1.0");
        System.out.println("------------------------------");
		try{
        	System.out.print("Day: ");
        	day = scan.nextInt();
        	System.out.print("Month: ");
        	month = scan.nextInt();
        	System.out.print("Year: ");
        	year = scan.nextInt();
		}
		catch(InputMismatchException e){
			System.out.println("Error: You entered an invalid number");
			System.exit(1);
		}
        System.out.println("\nYou are " + getAge(day,month,year) + " years old");
    }

    public static int getAge(int day, int month, int year){
		final int ERROR = -1;
        //initialize GregorianCalendar with current date
        GregorianCalendar cal = new GregorianCalendar();
        //constant holds current day
        final int CDAY = cal.get(GregorianCalendar.DAY_OF_MONTH);
        //constant hold current month
        final int CMONTH = cal.get(GregorianCalendar.MONTH) + 1;
        //constant to hold current year
        final int CYEAR = cal.get(GregorianCalendar.YEAR);
        //check if current day of the month is greater then birth day
        if (month == CMONTH){
            if(CDAY >= day)
                return CYEAR - year;
			if(CDAY < day)
				return CYEAR - year - 1;
        }
        //check if birth month is less then current month
        else if(month < CMONTH)
            return CYEAR - year;
        //subtract 1 from the age because  the current day in the month is less then birth date
		else
        	return CYEAR - year - 1;
		return ERROR;
    }

}