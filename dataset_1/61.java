/*
 * This program tells a user the price of a table
 */

import java.util.Scanner;
import java.text.NumberFormat;

public class Furniture{
	public static void main(String[] args){

		//cost of tables
		final float PINE_PRICE = 100f;
		final float OAK_PRICE = 225f;
		final float MAHOGANY_PRICE = 310f;

		//holds the value of choice
		int choice = 0;

		//holds price value for tables
		double price = 0;

		//initialize scanner class
		Scanner scan = new Scanner(System.in);

		//Number Format for currency
		NumberFormat nf = NumberFormat.getCurrencyInstance();

		//Display menu and get input from user
		System.out.println("---------------------------");
		System.out.println("|Welcome to Furniture R US|");
		System.out.println("---------------------------");
		System.out.println("1. PINE");
		System.out.println("2. OAK");
		System.out.println("3. MAHOGANY");
		System.out.print("Enter the number for your table of choice: ");
		choice = scan.nextInt();
		
		//Display price for choice
		switch(choice){
		
			case 1: 
				price = PINE_PRICE;
				System.out.println("The pine wood table cost: " + nf.format(price));
				break;
			case 2:
				price = OAK_PRICE;
				System.out.println("The oak wood table cost: " + nf.format(price));
				break;
			case 3: 
				price = MAHOGANY_PRICE;
				System.out.println("The mahogany table cost: " + nf.format(price));
				break;
		default:
				price = 0;
				System.out.println("There was a error in your selection. Price is " + nf.format(price));
		}
	}
}

/*
 * This program tells a user the price of a table
 */


class Furniture2{
	public static void main(String[] args){
	
		//beginning table to and last table
		final int MIN = 1;
		final int MAX = 3;

		//extra price for large table
		final double EXTRA = 35;

		//cost of tables
		final float PINE_PRICE = 100f;
		final float OAK_PRICE = 225f;
		final float MAHOGANY_PRICE = 310f;

		//table sizes
		final int SMALL_TABLE = 1;
		final int LARGE_TABLE = 2;

		//holds the value of choice
		int choice = 0;
		int tableSize = 0;

		//hold values of the price of table
		double price = 0;

		//initialize scanner class
		Scanner scan = new Scanner(System.in);

		//Number Format for currency
		NumberFormat nf = NumberFormat.getCurrencyInstance();

		while( (choice < MIN) || (choice > MAX) ){
			//Display menu and get input from user
			System.out.println("---------------------------");
			System.out.println("|Welcome to Furniture R US|");
			System.out.println("---------------------------");
			System.out.println("1. PINE");
			System.out.println("2. OAK");
			System.out.println("3. MAHOGANY");
			System.out.print("Enter the number for your table of choice: ");
			choice = scan.nextInt();
		}
			
		//loop until a correct selection is made
		while(tableSize != SMALL_TABLE || tableSize != LARGE_TABLE){
			System.out.println("Enter the number for your table of choice: ");
			System.out.println("1. Small Table");
			System.out.println("2. Large Table");
			tableSize = scan.nextInt();
			//if a large table is selected add 35 to price
			if(tableSize == SMALL_TABLE){
				price = 0;
				break;
			}
			else if(tableSize == LARGE_TABLE){
				price = EXTRA;
				break;
			}
			else{
				System.out.println("Error invalid selection\n");
			}
		}
		
		//Display price for choice
		switch(choice){
		
			case 1: 
				price += PINE_PRICE;
				System.out.println("The pine wood table cost: " + nf.format(price));
				break;
			case 2:
				price += OAK_PRICE;
				System.out.println("The oak wood table cost: " + nf.format(price));
				break;
			case 3: 
			price += MAHOGANY_PRICE;
				System.out.println("The mahogany table cost: " + nf.format(price));
				break;
			default:
				System.out.println("There was a error in your selection");
		}
	}
}
