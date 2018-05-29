//**************************************
// Name: Average Grade Determiner
// Description:This code will compute the average grade of the student. It also contains error handling routine to insure that the given input from the user is correctly before it will compute and return the result to the user.
// By: Jake Rodriguez Pomperada
//
//
// Inputs:The program will ask the user how many grades to be computer and then the program will process all the given grades by the user.
//
// Returns:The program will generate a report the will display the name of the student. The final grade the remarks whether the student pass the subject or not. And lastly it will ask the user if the user will continue with the program.
//
//Assumes:I intended to publish the java code to help the beginner's in Java Programming and to let the people now that the Filipino's are good in computer programming. I hope you vote this code thank you in advance and God Bless.
// Jake :-D
//
//Side Effects:There is not side effects of the code.
//This code is copyrighted and has limited warranties.
//Please see http://www.Planet-Source-Code.com/xq/ASP/txtCodeId.5579/lngWId.2/qx/vb/scripts/ShowCode.htm
//for details.
//**************************************

// grade1.java
// A grding system that will solve the average grade
// of the student. With build it error detection and remarks
// comments.
// Written By: Jake Rodriguez Pomperada
// Date: February 21, 200710:35 PMWednesday
// Total No. of Lines of Code : 368
import java.io.*;
import java.text.*;
public class grade1


    {
    public static final int grade_cut_off = 75;
    public static final int first = 9;
    public static void boxline(int length)


        {
        int i=0;
        System.out.print("+");
        for (i=0; i < length; i+=1)
        System.out.print("-");
        System.out.println("+");
    }
    public static void boxtext(String words)


        {
        int size=0;
        System.out.println();
        size = words.length();
        boxline(size);
        System.out.println("|" + words + "|");
        boxline(size);
    }
    public static void main (String[] args) throws IOException


        { 
        String line,line1, line2, message;
        String line3,line4;
        int first=0,second=0,first1=0, second1=0;
        int a=0,c=0,d=0;
        int a1 = 0,c1= 0,d1= 0;
        double solve=0.00,b=0.00;
        double solve1=0.00,b1=0.00;
        char aa;
        boolean ok;
        int test[] = new int[15];
        int test1[] = new int[15];
        BufferedReader stdin =
        new BufferedReader ( new InputStreamReader( System.in ) );
        DecimalFormat twoDigitsPastPoint = new DecimalFormat("0.00");
        DecimalFormat threeDigitsPastPoint =
        new DecimalFormat("00.000");
        System.out.print("\n\n");
        boxtext("\02 Grading System Version 1.0 \02");
        
        System.out.print("\n\n");
        System.out.print("Enter Student Name : ");
        message = stdin.readLine();
        do


            {
            try


                {
                System.out.print("Enter Number of Grades : ");
                line1= stdin.readLine();
                first= Integer.parseInt( line1 );
                ok = true;
            }
            catch (Exception e)


                {
                System.out.print("\n\n");
                System.out.println("You Must Enter a Number !!!");
                System.out.println("Not a String or Character.");
                System.out.print("\n\n");
                ok = false;
            }
        } while (!ok);
        System.out.print("\n\n");


            if (first >= 11) {
            System.out.print("\n\n");
            System.out.println("The maximum no. of grades ");
            System.out.println("it not greater than 10 items.");
            System.out.print("\n");
            boxtext("Try again and Re-run the program.");
            System.exit(0);
        }


            for (a=1; a<= first; a++) {
            do


                {
                try


                    {
                    System.out.print("Enter Grade No. " +a + ": " );
                    line2= stdin.readLine();
                    second= Integer.parseInt( line2 );
                    ok = true;
                }
                catch (Exception e)


                    {
                    System.out.print("\n\n");
                    System.out.println("You Must Enter a Number !!!");
                    System.out.println("Not a String or Character.");
                    System.out.print("\n\n");
                    ok = false;
                }
            } while (!ok);
            b = b + second;
            // Get the Average Grade
            solve = 0;
            solve = (b / a);
            test[a] = second;
        }
        System.out.print("\n");
        System.out.println("STUDENTS NAME : " + message ) ;
        System.out.print("\n");
        boxtext("== SUMMARY OF GRADES ==");
        System.out.print("\n\n");


            for (a=1; a<= first; a++) {


                {
                System.out.println("Grade no. " +a + ": " + test[a]);
            }
        }
        System.out.print("\n");
        System.out.print("The average grade is " +
        twoDigitsPastPoint.format(solve) + ".");
        System.out.print("\n\n");
        if (solve >= grade_cut_off)


            {
            System.out.print("\nREMARKS:");
            System.out.print("\n\n");
            boxtext("You Pass the Subject. Congratulation !!!");
        }
        else if (solve < grade_cut_off)


            {
            System.out.print("\nREMARKS:");
            System.out.print("\n\n");
            boxtext("Sorry your not able to pass the subject.");
        }
        //
        // Repeat the process
        //


            do {
            System.out.print("\n\n\n");
            System.out.print("Do you want to continue Y/N : ");
            line = stdin.readLine();
            aa = line.charAt(0);
            
            if (aa=='n' || aa=='N')


                {
                System.out.print("\n\n");
                boxtext("Good Bye For Now Thank you" + " "+
                "for using this Program. \01");
                System.exit(0); 
            }
            else if (aa=='Y' || aa=='y')


                {
                first1=0;
                second1=0;
                a1 = 0;
                b1=0;
                c1= 0;
                d1= 0;
                solve1= 0;
                System.out.print("\n\n");
                boxtext("\02 Grading System Version 1.0 \02"); 
                System.out.print("\n\n");
                System.out.print("Enter Student Name : ");
                message = stdin.readLine();
                do


                    {
                    try


                        {
                        System.out.print("Enter Number of Grades : ");
                        line1= stdin.readLine();
                        first1= Integer.parseInt( line1 );
                        ok = true;
                    }
                    catch (Exception e)


                        {
                        System.out.print("\n\n");
                        System.out.println("You Must Enter a Number !!!");
                        System.out.println("Not a String or Character.");
                        System.out.print("\n\n");
                        ok = false;
                    }
                } while (!ok);


                    if (first1 >= 11) {
                    System.out.println("The maximum no. of grades ");
                    System.out.println("it not greater than 10 items.");
                    System.out.print("\n");
                    boxtext("Try again and Re-run the program.");
                    System.exit(0);
                }
                System.out.print("\n\n");


                    for (c1=1; c1<= first1; c1++) {
                    do


                        {
                        try


                            {
                            System.out.print("Enter Grade No. " + c1 + ": " );
                            line3= stdin.readLine();
                            second1= Integer.parseInt( line3 );
                            ok = true;
                        }
                        catch (Exception e)


                            {
                            System.out.print("\n\n");
                            System.out.println("You Must Enter a Number !!!");
                            System.out.println("Not a String or Character.");
                            System.out.print("\n\n");
                            ok = false;
                        }
                    } while (!ok);
                    b1 = b1 + second1;
                    solve1 = (b1 / c1);
                    test1[c1] = second1;
                }
                // Get the Average Grade
                System.out.print("\n");
                System.out.println("STUDENTS NAME : " + message ) ;
                System.out.print("\n");
                boxtext("== SUMMARY OF GRADES ==");
                System.out.print("\n\n");


                    for (c1=1; c1<= first1; c1++) {


                        {
                        System.out.println("Grade no. " + c1 + ": " + test1[c1]);
                    }
                }
                System.out.print("\n");
                System.out.print("The average grade is " +
                twoDigitsPastPoint.format(solve1) + ".");
                System.out.print("\n\n");
                if (solve1 >= grade_cut_off)


                    {
                    System.out.print("\n\n");
                    System.out.print("\nREMARKS:");
                    System.out.print("\n\n");
                    boxtext("You Pass the Subject. Congratulation !!!");
                }
                else if (solve1 < grade_cut_off)


                    {
                    System.out.print("\n\n");
                    System.out.print("\nREMARKS:");
                    System.out.print("\n\n");
                    boxtext("Sorry your not able to pass the subject.");
                }
            }
        } while (aa=='Y' || aa=='y');
    }
}
// End of the Source Code


		