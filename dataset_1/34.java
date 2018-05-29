 
import java.util.*;


/**
 * @author Okoye Chuka Daniel
 * Program Name: Hoffman Code Generator
 * Instructor: Per Kjeldass
 */
public class Huffman {
	
//	private static String value;
	private static char charArray[]; //the string coverted to characters.
	private static int table[] = new int[0x7f]; //holds the frequency of the item
        private static Node myNode[]; //the main Priority Queue, the Final Tree generated is stored in spot 0.
	private static int lengthOfTable = 0;//The true length of the table that holds the characters.
        private static Tree myTree; //A variable that holds the Tree
        private static int lengthOfNode = 0;//all increments or decrements are made to this value
        public static HuffmanTransversor hC; //The Class Responsible for Decoding the Huffman Tree
        
        
        public Huffman(String value)
        {
            frequencyTable(value);
            nodeArrange();
            Node x = createTree();
            hC = new HuffmanTransversor(x,charArray);
        }
        public static void frequencyTable(String value)
	{
		int i;
                charArray = value.toCharArray();
		for(i = 0; i < charArray.length; i++)
			table[getAscii(charArray[i])] += 1; 
	}
	
	public static int getAscii(char substringValue)
	{
		return substringValue&0x7f;
	}
	
        public static void nodeArrange()    
        {
            int counter = 0;
            int j = 0;
            for(int i = 0; i < table.length; i++)
            {
                if(table[i]>0)
                    counter++;
            }
            
            lengthOfTable =  counter;
            counter = 0;    
            myNode = new Node[lengthOfTable];
            
            for(int i = 0; i < 127; i++)
            {
                if(table[i] != 0)
                {
                    myNode[counter]= new Node(table[i], (char)i, null, null);
                    counter++;
                }
            }
            lengthOfNode = myNode.length;
            sort();
            
        }
        
        public static Node createTree()
        {
           for(int i = 1; i < lengthOfNode; i++)
           {
               try
               {
                   if(myNode[1].frequency >= myNode[0].frequency)
                   {
                       myTree = new Tree(myNode[0],myNode[i]);
                       myNode[0] = myTree;
                       moveItems(i, lengthOfNode);
                       lengthOfNode -= 1; 
                       i -= 1;
                       sort();
                   }
                   else
                   {
                       if(i+1 < lengthOfNode)
                       {
                            myTree = new Tree(myNode[i], myNode[i+1]);
                            myNode[1] = myTree;
                            moveItems(i+1, lengthOfNode);
                            sort();
                            lengthOfNode -= 1;
                            i -= 1;
                       }
                       else
                       {
                           myNode[1] = myNode[i];
                           myNode[0] = new Tree(myNode[0], myNode[1]);
                       }
                   }
               }
               catch(Exception e)
               {
                 //I dare this program to crash...hahaha
               }
           }
            return myNode[0];
        }
        
        private static void moveItems(int index, int length)
        {   try
            {
                for(int i = index; i < length; i++)
                    myNode[i] = myNode[i+1];
                
            }
            catch(Exception e)
            {
                //See...this program is uncrashable...lol
            }
        }
        private static void sort()
        {
            Node temp;
            for(int i = lengthOfNode-1; i > 1; i--)
            {
                for(int j = 0; j < i; j++)
                {
                    if(myNode[j].frequency > myNode[j+1].frequency)
                    {
                        temp = myNode[j+1];
                        myNode[j+1] = myNode[j];
                        myNode[j] = temp;
                    }
                    
                    if(myNode[j].frequency == myNode[j+1].frequency && myNode[j].left != null)
                    {
                        temp = myNode[j+1];
                        myNode[j+1] = myNode[j];
                        myNode[j] = temp;
                    }
                }
            }
        }
}


 class HuffmanExe
{
    static Huffman huffman;
    private static Scanner input = new Scanner(System.in);
    private static String value;
    public static void main(String args[])
	{
		System.out.print("Enter String: ");
                value = input.nextLine();
                System.out.println("This is the value you entered: "+value);
                huffman = new Huffman(value);
                System.out.println("The bit representation of the String you entered is: "+huffman.hC.finalBitPattern);  
	}
}


class HuffmanTransversor
{
    private Node rootNode;
    private char c;
    private char charArray[];
    private int i=0;
    public String finalBitPattern = "";
    public HuffmanTransversor(Node myNode, char [] charArray)
    {
        String temp;
        int i;
        rootNode = myNode;
        this.charArray = charArray;
        for(i = 0; i < charArray.length; i++)
        {
            temp = search(rootNode, "", charArray[i]);
            finalBitPattern += temp+" ";
            System.out.println("My values: "+charArray[i]+" "+temp);
        }
      //  System.out.println("My final Bit Pattern: "+finalBitPattern);
    }
    
    public String search(Node rootNode, String value,char myChar)
    {
        String valueL ="";
        if(rootNode != null)
        {
            if(rootNode.left != null)
                valueL = search(rootNode.left, value+"0", myChar);
            if(rootNode.c == myChar)
                return value;

            else
            {
                if(valueL == "")
                {
                    return search(rootNode.right, value+"1",myChar);
                }
                else
                {
                    return valueL;
                }
            }
        }
        else
        {
            return "";
        }
    }
        
}

class Node
{
    public int frequency;
    public char c;
    public Node left;
    public Node right;
    
    public Node(int frequency, char c, Node left, Node right)
    {
        this.frequency = frequency;
        this.c = c;
        this.left = left;
        this.right = right;
    }
    
    public Node()
    {
        //does Nothing
    }
    
    public Node addNode(Node node1, Node node2)
    {
        if(node1.frequency < node2.frequency)
        {
            left = node1;
            right = node2;
        }
        else
        {
            right = node1;
            left = node2;
        }
        frequency = node1.frequency + node2.frequency;
        
        return this;
    }
    
}

class Tree extends Node
{
    private Node root;
    
    public Tree()
    {
        root = null;
    }
    
    public Tree(Node node1, Node node2)
    {
        root = super.addNode(node1, node2);
    }
    
    public void insertNode(int freq, char c)
    {
        root.frequency =  freq;
        root.c = c;
        root.left = null;
        root.right = null;
    }
    
    public void insertNode(int freq, char c, Node left, Node right)
    {
        root.frequency =  freq;
        root.c = c;
        this.root.left = left;
        this.root.right = right;
    }
    
    public void insertNode(Node node)
    {
        this.root.frequency = node.frequency;
        this.root.c = node.c;
        this.root.left = node.left;
        this.root.right = node.right;
    }
    
    public void insertNode(Node node1, Node node2)
    {
        root = super.addNode(node1, node2);   
    }
}
