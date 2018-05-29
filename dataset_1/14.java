import java.io.*;

public class WordCount

//
// ************************************************
//
//      Philip J. Porvaznik
//
//      Java programming I
//
//      Finds the number of words in a text file
//
//      problem #4A 4B page 449
//
// ************************************************
//

{

  public static void main (String[] args) throws IOException

  {

    // int vars for char index and Number of Words found

    int i, NumOfWords = 0;

    // string vars for Scanned Line, file name, and stream buffers

    String ScanLine, inputStr = "";
    BufferedReader inputFile, br;

    // char var for the next character in the Scanned Line

    char NextChar;

    // bool vars for whether Start of Line or Looking for Next Word
    // both initialized to true at beginning of each scanned line

    boolean StartOfLine, LookingForNextWord;

    // display intro message and prompt for file name

    System.out.println("This program counts the number of words in a text file");

    System.out.println("Enter File Name:");

    // get the string file name from user

    br = new BufferedReader(new InputStreamReader (System.in));
    inputStr = br.readLine();

    // attempt to read the file

    System.out.println("Reading file named " + inputStr);

    inputFile = new BufferedReader(new FileReader (inputStr));

    // get first line of file to start

    ScanLine = inputFile.readLine();

    // if we do not have a NULL, we can continue reading

    while(ScanLine != null)

    {

	  // initialize bools to true
	  // we ARE looking for next word, and we ARE at start of line

	  LookingForNextWord = true;
	  StartOfLine = true;

	  // evaluate each character in the line looking for spaces

	  for (i=0; i <= (ScanLine.length() - 1); i++)
	  {

	    NextChar = ScanLine.charAt(i);

	    // if we found something other than space
	    // and we are looking for the next word
	    // then we found a new word
	    //
	    // increment counter for number of words
	    // set looking for next word and start of line to false

	    if (NextChar != ' ' && LookingForNextWord)
	    {
	      NumOfWords++;
	      LookingForNextWord = false;
	      StartOfLine = false;
	    }

	    // if we found a space and we are not at start of line
	    // then set looking for next word to true again

	    if (NextChar == ' ' && !StartOfLine)
	    {
	      LookingForNextWord = true;
	    }

	  } // END OF FOR LOOP

	  ScanLine = inputFile.readLine();

	} // END OF WHILE LOOP

	inputFile.close();

	System.out.println("Done reading file named " + inputStr);

	System.out.println("Number of Words found = " + NumOfWords);

  } // END OF MAIN

} // END OF CLASS AND PROGRAM
