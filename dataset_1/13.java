import java.io.*;

public class Rainbow

//
// ************************************************
//
//      Philip J. Porvaznik
//
//      Java programming I
//
//      Finds the height of a rainbow
//
//      problem #2 page 228
//
// ************************************************
//

{

  public static void main (String[] args)

  {

    // Distance is the input distance to the rainbow
    // Height is the calculated height of the rainbow
    // Rads is the radians of the magic angle

    float Distance = 0f;
    float Height;
    float Rads;

    // PI is constant 3.14159265
    // MAGIC is the magic angle

    final float PI = 3.14159265f;
    final float MAGIC = 42.3333333f;

    // InputStr and buffer is used for the input string

    String inputStr = "";
    byte buffer[] = new byte[255];

    // display intro message

    System.out.println("This program calculates the height of a rainbow from the distance input");

    // get distance from user input

	System.out.println("Enter the distance to the rainbow in feet and press enter:");

	try
	{
	   System.in.read(buffer, 0, 255);
	   inputStr = new String( buffer );
	   Distance = Float.valueOf(inputStr.trim()).floatValue();
	}

	catch (IOException e)
	{
	   System.out.println("Not a valid number");
	}

	// calculate height of the rainbow

	Rads = MAGIC * (PI / 180f);

    Height = Distance * (float)Math.tan(Rads);

    // round off all values to 4 digits

    Distance = (float)((int)(Distance * 10000f + .5f)) / 10000f;

    Height = (float)((int)(Height * 10000f + .5f)) / 10000f;

    // display the result

    System.out.println("The distance you entered = " + Distance + " feet");
    System.out.println("The calculated height of rainbow = " + Height + " feet");

    // display end message

    System.out.println("End of program");

  }

}