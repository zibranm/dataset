import javax.swing.JOptionPane;


class payroll {

String name,output;
int no_days =0;
double rate=0.00;
double solve=0.00;


 void solve_payroll(int days, double rates)
 {

solve = ( no_days * rate);

}

 void display()
 {

	 output = "Employee's Name   : " + name + "\n" +
	    "Number of Days Worked   : " + no_days + "\n" +
	    "Rate Per Day : " + String.format("%.2f",rate) + "\n" +
	    "Salary   : $ " + String.format("%.2f",solve );

	 JOptionPane.showMessageDialog(null,output,
	      "Payroll Report",JOptionPane.INFORMATION_MESSAGE);
	 System.exit(0);

}


}

class pay {

	public static void main(String args[])
	{


       payroll employee = new payroll();

      employee.name =  JOptionPane.showInputDialog(
	              "Enter Employee's Name ");
      employee.no_days = Integer.parseInt(
		                JOptionPane.showInputDialog(
	              "Enter Number of Days Worked  "));
	  employee.rate = Double.parseDouble(
		                JOptionPane.showInputDialog(
	              "Enter Rate Per Day  "));

	  employee.solve_payroll(employee.no_days,employee.rate);
  	  employee.display();


   }

}
