//**************************************
// Name: Prime Number Generator
// Description:A simple, but quite efficient (if I do say so myself! I hope you agree...) prime number generator that displays all the prime numbers up to 5000(this number can be increased within the program). This code demonstrates an algorithm for finding the prime numbers. This program can be used for a nice logical workout!
// By: Rayan D.
//
//
// Inputs:None
//
// Returns:None
//
//Assumes:None
//
//Side Effects:None
//This code is copyrighted and has limited warranties.
//Please see http://www.Planet-Source-Code.com/xq/ASP/txtCodeId.6214/lngWId.2/qx/vb/scripts/ShowCode.htm
//for details.
//**************************************

public class primedemo1 


    {


        public static void main(String args[]) {
        int i = 4;
        // prime = i /2;
        int c;


            {
            System.out.println("2\n3");
            while( i < 100000)


                {
                for(c = 2; c < i ; c++)


                    {
                    if( i % c == 0)


                        {
                        break;
                    }
                    if(c == i/2)


                        {
                        System.out.println(i);
                    }
                }
                i++;
            }
        }
    }
}
		
