//**************************************
// Name: Recursion Demo
// Description:This program provides an example of recursion in Java. The program counts down from 10 to 1.
// By: Ritesh Kachhwaha
//
//
// Inputs:None for the user. The value of x can be changed to effect the number of recursions that occur.
//
// Returns:Outputs the number of recursions that have occurred.
//
//Assumes:Understanding of how to compile the code in JDK 1.4
//using the javac and java command.
//
//Side Effects:None.
//This code is copyrighted and has limited warranties.
//Please see http://www.Planet-Source-Code.com/xq/ASP/txtCodeId.5892/lngWId.2/qx/vb/scripts/ShowCode.htm
//for details.
//**************************************

//Written by Ritesh Kachhwaha on 13 January 2008.
//Code demonstrates recursion in Java. The program counts down 10 to 1 (x-1).
//Recursion can be used as a looping statement such as the while loop and for loop
public class RecursionDemo


    {
    	
    	RecursionDemo RecursiveMethod(int x)


        	{
        		if (x < 1)
        		 return this; //exit the program when x is less then 1
        		else


            		{
            		System.out.println(x);
            			RecursiveMethod(x-1); //call itself
            		 return this;
            	}
            	}
            	public static void main(String args[])


                	{
                	 new RecursionDemo(). RecursiveMethod(10);//initialise the method with the value of 10
            }
            	 
        }

		
