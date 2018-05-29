public class PairOfDice{
	final private int MAX = 6;
	private int dice1, dice2;
	
	PairOfDice()
	{
		dice1 = 6;
		dice2 = 6;
	}

	PairOfDice(int sDice1, int sDice2)
	{
		dice1 = sDice1;
		dice2 = sDice2;
	}

	final public int getDice1()
	{
		return dice1;
	}
	
	final public int getDice2()
	{
		return dice2;
	}
	
	public void setDice1(int dice)
	{
		dice1 = dice;
	}

	public void setDice2(int dice)
	{
		dice2 = dice;
	}
	
	public void setPair(int sDice1,int sDice2)
	{
		dice1 = sDice1;
		dice2 = sDice2;
	}
	
	public void setDice1Random()
	{
		dice1 = (int)(Math.random() * MAX) + 1;
	}
	
	public void setDice2Random()
	{
		dice2 = (int)(Math.random() * MAX) + 1;
	}
	
	
	final public int getPairValue()
	{
		return dice1 + dice2;
	}

	public void rollDice()
	{
		dice1 = (int)(Math.random() * MAX) + 1;
		dice2 = (int)(Math.random() * MAX) + 1;
	}
	
	public String toString()
	{
		return "dice1 = " + dice1 + " dice2 = " + dice2;
	}		
}	
