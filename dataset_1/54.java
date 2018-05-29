import java.util.Scanner;

public class CountLetters2{
	public static void main(String[] args){
	
		//initialize scan to retrieve user input
		Scanner scan = new Scanner(System.in);

		//String to hold user input
		String str;
		
		//get string from user	
		System.out.println("Enter in a string");
		str = scan.nextLine();

		//print out the string and display the number of characters

		System.out.println("String: " + str + " has " + str.length() + " characters");
	}
}
