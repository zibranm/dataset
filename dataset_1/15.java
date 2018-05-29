public class CtoF

//
// ************************************************
//
//      Philip J. Porvaznik
//
//      Java programming I
//
//      Converts Celsius to Fahrenheit Temp
//
//      problem #3 page 172
//
// ************************************************
//

{

  public static void main (String[] args)

  {

    // Celsius temp is a constant
    // Fahrenheit temp

    final double CELS = 37;
    double FAHR;

    // calculate Fahrenheit temp using formula

    FAHR = ((9.0 / 5.0) * CELS) + 32.0;

    // display intro message

    System.out.println("This program converts Celsius to Fahrenheit");

    // display the result

    System.out.println("Celsius Temp = " + CELS);
    System.out.println("Fahrenheit Temp = " + FAHR);

    // display end message

    System.out.println("End of program");

  }

}
