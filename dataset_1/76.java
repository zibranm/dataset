
import javax.swing.JOptionPane;


class check_odd_even {

int remainder=0,num=0;

String message;

 void check_values(int values)
 {

  remainder = (values % 2);


 if (remainder == 0) {
	 message = "Even Number.";
 }
 else
 {
	 message = "Odd Number.";
 }

}

 void display()
 {
	 JOptionPane.showMessageDialog(null,
	 "The value " + num + " is a " +message );

}


}

class odd {

	public static void main(String args[])
	{


       check_odd_even number = new check_odd_even();

      number.num =  Integer.parseInt(JOptionPane.showInputDialog(null,
	              "Please enter a Number: "));

     number.check_values(number.num);
     number.display();

   }

}




