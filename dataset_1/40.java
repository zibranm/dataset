import javax.swing.*;


public class AddingOdd{
	public static void main(String []args){
	
	JOptionPane frame = new JOptionPane();
	
	int res=0; 
	for(int i=1;i<=15;i=i+2)
	{
		res= res+i;
	}
	
	frame.showMessageDialog(null,Integer.toString(res));
  }
}