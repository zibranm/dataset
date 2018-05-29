import java.util.Scanner;

class process_math {

	int x=0, y=0;

	int sum=0,product=0,quotient=0,difference=0;


  void compute(int x, int y)
  {

	  sum        = (x + y);
	  product    = (x * y);
	  quotient   = (x / y);
	  difference = (x - y);


	  System.out.print("\n The Sum of " + x + " and "
	                  + y + " is "+ sum + ".");
 	  System.out.print("\n The Product of " + x + " and "
	                  + y + " is "+ product + ".");
	  System.out.print("\n The Quotient  of " + x + " and "
	  	                  + y + " is "+ quotient + ".");
	  System.out.print("\n The Difference of " + x + " and "
	  	                  + y + " is "+ difference + ".");
	  System.out.println();
	  System.out.println();


}

}



class math {

	public static void main(String args[])
	{
		Scanner scanner = new Scanner(System.in);

		process_math values = new process_math();

        System.out.print("\t Basic Math Operations");
        System.out.println();
        System.out.println();
        System.out.print("Enter Value For X   :=> ");
		values.x = scanner.nextInt();
		System.out.print("Enter Value For Y   :=> ");
		values.y = scanner.nextInt();

		values.compute(values.x,values.y);
   }
}
