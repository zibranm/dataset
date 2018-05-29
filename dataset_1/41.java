//**************************************
// Name: Counter Loop
// Description:Give all the values that will be printed on the screen using the formula c = i-b and two loops Hint: use for loops. Give a max of 4 for each loop, let 'i' and 'b' both have an initial value of 1. Without running the program, determine the 8th value that will be printed?
// By: Anthony Hope
//
//
// Inputs:None
//
// Returns:None
//
//Assumes:Steps to running this program:
//1. Copy this code and paste it in notepad
//2. Save the program 
//3. Compile the program using a java compiler
//
//Side Effects:None
//This code is copyrighted and has limited warranties.
//Please see http://www.Planet-Source-Code.com/xq/ASP/txtCodeId.2915/lngWId.2/qx/vb/scripts/ShowCode.htm
//for details.
//**************************************

/*
* Author: Anthony
* Created: 05/23/2002 21:26:02
* Modified: 05/23/2002 21:26:02
*/
public class values


    {
    	
    	public static void main(String[] argv)


        	{
        		
        		
        	int i=0;
        	int b=0;
        	int c=0;
        	
        	
        	//First loop, i = 1; i is less than 4
        //So add 1 to i until i = 3


            	for (i =1; i < 4; i++) {
            		
            		
            			
            	
            	//Second loop b = 1; b is less than 4
            //So add 1 to b until b = 3


                	for (b =1; b < 4; b++) {
                			 
                						
                			
                			
                	//Subtract 1st loop from second loop until i and b are less than 4, i.e = 3	
                	
                		 c = i-b;
                					 
                				
                	//Print the value of c
                			
                		System.out.println(c);
                		 
                		
                	}
                	}
            }			
        }
		
