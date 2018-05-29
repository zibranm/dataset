/**
*@title The Positive-Negative Program
*
*@author Angelito "Jojo" Sardez Jr. 
*@date written July 5, 2003
*@date compiled July 5, 2003
*
*/
import java.lang.String;
import java.io.*;
class Posneg {
	public static void main(String args[]) throws IOException {
	System.out.println("\n\nThe Positive - Negative Program\n\n");
	System.out.print("Enter a number: ");
	DataInputStream keyboardInput = new DataInputStream(System.in);
	String nums=keyboardInput.readLine();
	int num = Integer.parseInt(nums);
	if (num < 0) {
		System.out.println("\nThe number is Negative");}
	else {
		System.out.println("\nThe number is Positive");}
	} 
}