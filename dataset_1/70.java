/**************************************************************
 * File: LinkedList.java
 *
 * Methods:
 *    -  public LinkedList()
 *    -  public LinkedList(int n, LinkedList ln)
 *    -  public void add( int num )
 *    -  void addLast( int num)
 *    -  public void addFirst( int num )
 *    -  public void DisplayLL()
 *    -  void Remove(int num)
 *    -  public boolean isEmpty()
 *    -  public boolean contains( int num )
 *    -  public void toArray(int a[])
 *    -  public int getLast()
 *    -  public int size()
 *    -  public static void main(String args[])
 *
 *
 * Copyright (c) 2002-2003 Advanced Applications Total Applications Works.
 * (AATAW)  All Rights Reserved.
 *
 * AATAW grants you ("Licensee") a non-exclusive, royalty free, license to use,
 * modify and redistribute this software in source and binary code form,
 * provided that i) this copyright notice and license appear on all copies of
 * the software; and ii) Licensee does not utilize the software in a manner
 * which is disparaging to AATAW.
 *
 * This software is provided "AS IS," without a warranty of any kind. ALL
 * EXPRESS OR IMPLIED CONDITIONS, REPRESENTATIONS AND WARRANTIES, INCLUDING ANY
 * IMPLIED WARRANTY OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE OR
 * NON-INFRINGEMENT, ARE HEREBY EXCLUDED. AATAW AND ITS LICENSORS SHALL NOT BE
 * LIABLE FOR ANY DAMAGES SUFFERED BY LICENSEE AS A RESULT OF USING, MODIFYING
 * OR DISTRIBUTING THE SOFTWARE OR ITS DERIVATIVES. IN NO EVENT WILL AATAW OR ITS
 * LICENSORS BE LIABLE FOR ANY LOST REVENUE, PROFIT OR DATA, OR FOR DIRECT,
 * INDIRECT, SPECIAL, CONSEQUENTIAL, INCIDENTAL OR PUNITIVE DAMAGES, HOWEVER
 * CAUSED AND REGARDLESS OF THE THEORY OF LIABILITY, ARISING OUT OF THE USE OF
 * OR INABILITY TO USE SOFTWARE, EVEN IF SUN HAS BEEN ADVISED OF THE
 * POSSIBILITY OF SUCH DAMAGES.
 *
 * This software is not designed or intended for use in on-line control of
 * aircraft, air traffic, aircraft navigation or aircraft communications; or in
 * the design, construction, operation or maintenance of any nuclear
 * facility. Licensee represents and warrants that it will not use or
 * redistribute the Software for such purposes.
 ***********************************************************************/

import javax.swing.*;
import java.awt.*;
import javax.swing.JOptionPane;

public class LinkedList {
   public int value;              // value of element
   public LinkedList next;        // reference to next
   private LinkedList head = null , last ;
   private boolean myDebug = true ;

   /** **********************************************
    *  constructor
    *
    ************************************************ */
   public LinkedList() {
      // initialize list head
     /* if ( head == null ) {
         head = new LinkedList( 0 , head ) ;
      } */
      head = null ;
   }

   /** **********************************************
    *  constructor: LinkedList( LinkedList ln )
    *
    ************************************************ */
   public LinkedList( int num, LinkedList ln ) {
      this.value = num ;
      //this.next = ln.next;
   }

   /** *************************************************
    *  sysPrint() - is used for debugging
    *               - set myDebug = true to turn on debugging
    *
    ************************************************ */
   public void sysPrint( String str  )   {
      if ( myDebug ) {
         System.out.println( str );
      }
   }


   /** **********************************************
    *  Method: add( int num )
    *
    *  Purpose:  Adds a value to the list in sorted
    *  order.
    *
    ************************************************ */
   public void add( int num ) {
      LinkedList NewNode, NodeRef = head , PreviousNode = null ;

      /** ***********************************************
       *  Allocate a new node & store Num
       ************************************************** */
      NewNode = new LinkedList();
      NewNode.value = num;

      PreviousNode = head ;

      /** ***********************************************
       * If there are no nodes in the list
       * make NewNode the first node
       ************************************************** */

      if ( head == null )  {
         head         = new LinkedList() ;
         head.next    = NewNode ;
         NewNode.next = null ;
      }
      else if ( NodeRef.value > num ) {
         NewNode.next = head.next ;
         head.next = NewNode ;
      }
      else	{  /** Otherwise, insert NewNode at end */
         /** *********************************************
          * Initialize NodeRef to head of list
          ************************************************ */

         NodeRef = head;

           // Skip all nodes whose Value member is less
           // than Num.
         while (NodeRef != null && NodeRef.value < num)  {
            PreviousNode = NodeRef ;
            NodeRef = NodeRef.next;
         }

 	 /** **********************************************
          * Insert the node after the one pointed to
	  * by PreviousNode and before the one pointed to
	  * by NodePtr.
          **********************************************  */

         PreviousNode.next = NewNode;
         NewNode.next = NodeRef ;
      }
   }

   /** **********************************************
    *  Method: addLast( int num )
    *
    *  Purpose:  Adds a node containing the value passed
    *  in num, to the end of the list.
    *
    ************************************************ */
   void addLast( int num) {
      LinkedList NodeRef, NewNode ;
      NodeRef = head.next ;

      /** **********************************************
       * Allocate a new node & store Num
       *
       ************************************************ */
      NewNode = new LinkedList();
      NewNode.value = num;
      NewNode.next = null ;

      /** *************************************************
       * If there are no nodes in the list
       * make NewNode the first node
       ************************************************* */
      if ( head == null )
         head = NewNode;
      else	{  // Otherwise, insert NewNode at end
           // Initialize NodePtr to head of list
         NodeRef = head;

           // Find the last node in the list
         while ( NodeRef.next != null )
            NodeRef = NodeRef.next;

              // Insert NewNode as the last node
         NodeRef.next = NewNode;
      }
   }

   /** **********************************************
    *  Method: addFirst( int num )
    *
    *  Purpose:  Adds a value to the beginning of the
    *  list.
    *  1- Create a new node
    *  2- Point the new node to the entry pointed to by the head
    *  3- Add the new value to the Newnode
    *  4- Point the head to the new node
    *
    ************************************************ */
   public void addFirst( int num ) {
      LinkedList NodeRef, NewNode ;

      NewNode        = new LinkedList() ;
      NewNode.next   = head.next ;
      NewNode.value  =  num ;
      head.next      = NewNode ;
   }

   /** **********************************************
    * Method: DisplayLL()
    *
    * Purpose: Iterate through a non-empty linked list
    *          until all of the entries are displayed on
    *          the screen.
    *
    ************************************************ */
   public void DisplayLL() {
      LinkedList NodeRef ;
      NodeRef = head.next;
      String result = "" ;

      // list all entries
      while (NodeRef != null) {
         result = result + NodeRef.value + " " ;
         NodeRef = NodeRef.next;
      }

      JOptionPane.showMessageDialog( null ,
                   result ,
                   "Linked List Entires " ,
                   JOptionPane.PLAIN_MESSAGE ) ;
   }

   /** **********************************************
    * Method: Remove(int num)
    *
    * The Remove function searches for a node
    * with Num as its value. The node, if found, is
    * deleted from the list and from memory.
    * 1. Check to see if the Linked list has entries.
    *    - If the Linked list is empty, then there is no
    *      further processing required.
    * 2. Check if the value we are seeking is in the first
    *    node in the Linked list.
    *    - Delete that node by making the value of next the
    *      new head.
    * 3. Start iterating through the Linked list until the
    *    value we are seeking is found.
    *    - Delete that node by removing its reference from
    *      the link.
    *
    ************************************************ */
   public boolean Remove(int num) {
      LinkedList NodeRef, PreviousNode = null;
      boolean found = false ;

      /** If the list is empty, do nothing.  */
      if ( !(head == null) ) {
         NodeRef = head ;

	 /** Determine if the first node is the one. */
         if (NodeRef.value == num) {
            head = NodeRef.next;
            found = true ;
         }
         else {
            /** Initialize NodeRef to head of list */
            NodeRef = head;

            /** *************************************
             * Skip all nodes whose value member is
             * not equal to num.
             * *************************************** */

            while (NodeRef != null  ) {
               if ( NodeRef.value != num ) {
                  PreviousNode = NodeRef;
                  NodeRef = NodeRef.next;
               }
               else {

                  /** *********************************************
                   * Link the previous node to the node after
                   * NodeRef, then delete NodeRef.
                   *********************************************** */

                  PreviousNode.next = NodeRef.next;
                  found = true ;

                     /** quit while loop - node found   */
                  break ;

               } /** End of inner if-then-else   */
            }  /** End of while loop   */
         }  /** End of outer if-then-else   */
      }  /** End of outer if   */

      return found ;
   }

   /** **********************************************
    * Method: isEmpty()
    *
    * Purpose: Determine if the linked list is empty.
    *          Return:
    *              - true if linked list is not empty
    *              - false if linked list is empty
    *
    ************************************************ */
   public boolean isEmpty() {
      boolean ret ;

      if ( head == null ) {
         ret = false ;
      }
      else {
         ret = true ;
      }

      return ret ;
   }

   /** **********************************************
    * Method: contains( int num )
    *
    * Purpose: Determine if the linked list contains
    *          the passed parameter.
    *          Return:
    *              - true if linked list is not empty
    *              - false if linked list is empty
    *
    ************************************************ */
   public boolean contains( int num ) {
      LinkedList NodeRef, PreviousNode = null;
      boolean ret = false ;
      int a ;

      /** If the list is empty, do nothing.  */
      if ( !(head == null) ) {
         NodeRef = head ;

	 /** *************************************
          * Skip all nodes whose value member is
          * not equal to num.
          * *************************************** */

          while (NodeRef != null  ) {
             if ( NodeRef.value != num ) {
                PreviousNode = NodeRef;
                NodeRef = NodeRef.next;
             }
             else {

                /** *********************************************
                 * Link the previous node to the node after
                 * NodeRef, then delete NodeRef.
                 *********************************************** */

                ret = true ;
                System.out.println("\nThe number " + num +
                            " sought has been found.\n") ;

                /** quit while loop - node found   */
                break ;

            } /** End of inner if-then-else   */
         }  /** End of while loop   */
      }  /** End of outer if   */

      return ret ;
   }

   /** **********************************************
    * Method: toArray(int a[])
    *
    * Purpose: Returns an array containing all of the
    *          elements in this list in the correct
    *          order.
    *
    ************************************************ */
   public void toArray( int a[]  ) {
      LinkedList NodeRef, PreviousNode = null;
      int ii = 0 ;

      /** If the list is empty, do nothing.  */
      if ( !(head == null) ) {
         NodeRef = head.next ;

	 /** *************************************
          * Skip all nodes whose value member is
          * not equal to num.
          * *************************************** */

          while (NodeRef != null  ) {

             a[ ii ] =  NodeRef.value  ;


             ii++;
             NodeRef = NodeRef.next;

         }  /** End of while loop   */
      }  /** End of outer if   */

   }

   /** **********************************************
    * Method: getLast()
    *
    * Purpose: Return the last logical number in the linked
    *          list
    *
    ************************************************ */
   public int getLast() {
      LinkedList NodeRef = null , PreviousNode = NodeRef ;
      int ret ;

      /** If the list is empty, do nothing.  */
      if ( !(head == null) ) {
         NodeRef = head ;

	 /** *************************************
          * Skip all nodes whose value member is
          * not equal to num.
          * *************************************** */

         while (NodeRef != null  ) {
            PreviousNode = NodeRef;
            NodeRef = NodeRef.next;
         }

         ret = PreviousNode.value ;
      }
      else {
         ret = -99999 ;
      }

      return  ret ;
   }

   /** **********************************************
    * Method: size()
    *
    * Purpose: Returns the size of the linked list.
    *          Return:
    *              - number in linked list if not empty
    *              - 0 if linked list is empty
    *
    ************************************************ */
   public int size() {
      LinkedList NodeRef, PreviousNode = null;
      int ret = 0  ;

      /** If the list is empty, do nothing.  */
      if ( (head != null) ) {
         NodeRef = head ;

         ret = 0 ;

         while (NodeRef.next != null  ) {
            NodeRef = NodeRef.next;

            ret++;

         }  /** End of while loop   */
      }  /** End of outer if   */

      return ret ;
   }

   public String showIn( String mess , String title ) {
      String ret  ;

      ret = JOptionPane.showInputDialog( null ,
                   mess ,
                   title ,
                   JOptionPane.PLAIN_MESSAGE ) ;

      return ret ;
   }

   /** **********************************************
    * Method: menu()
    *
    * Purpose: displays the user options
    *   1 - Add an integer
    *   2 - Add an integer to head of list
    *   3 - Add an integer to end of list
    *   4 - Does the list contain an integer
    *   5 - Is the list empty?
    *   6 - Delete an integer from the of list
    *   7 - Get the integer from end of list
    *   8 - What is the size of the list?
    *   9 - Use the list to create an array
    *  10 - Display the list
    *  11 - Exit
    *
    ************************************************ */
   public void menu() {
      boolean cont = true ;
      String result, result2 ;

      String number ;   // first string entered by user

      int number1 ;       // number to process in the list
      int a , b , arr[] = new int[ 250 ] ;

      /** **************************************
       *  Add some entries to list.
       *****************************************/
      add(10);
      add(99);
      add(21);
      add(73);
      add(110);
      add(11);
      add(150);
      add(215);
      add(33);
      add(81);
      add(44);
      add(55);
      add(67);

      result  =          "                                         \n" ;
      result  = result + "    Linked List Options                  \n" ;
      result  = result + "                                         \n" ;
      result  = result + "  1 - Add an integer                      \n" ;
      result  = result + "  2 - Add an integer to head of list      \n" ;
      result  = result + "  3 - Add an integer to end of list       \n" ;
      result  = result + "  4 - Does the list contain an integer    \n" ;
      result  = result + "  5 - Is the list empty?                  \n" ;
      result  = result + "  6 - Delete an integer from the of list  \n" ;
      result  = result + "  7 - Get the integer from end of list    \n" ;
      result  = result + "  8 - What is the size of the list?       \n" ;
      result  = result + "  9 - Use the list to create an array     \n" ;
      result  = result + " 10 - Display the list                   \n" ;
      result  = result + "                                         \n" ;
      result  = result + " 11 - Exit                               \n" ;
      result  = result + "                                         \n" ;
      result  = result + " Select one of the options from above     \n" ;

      while ( cont ) {

         // read in first number from user
         number =  showIn( result ,  "Linked List Options " ) ;

         if ( number == null )  {
            break ;  // The user selected the cancel button
         }
         if ( number.equals( "" ) ) {
            number = "99" ;
         }

         number1 =  Integer.parseInt( number ) ;

         switch ( number1 ) {
            case 1 : // Add an integer
               // read in the number from user
               number  =  showIn(
                   "Please enter the number you want to add to the list." ,
                   "Add a number " ) ;

               if ( !(number == null) )  {
                  add( Integer.parseInt( number ) ) ;
               }

            break ;
            case 2 : // Add an integer to head of list
               number  =  showIn (
                   "Please enter the number you want to add to beginning the list." ,
                   "Add a number "  ) ;

               if ( !(number == null) )  {
                  addFirst( Integer.parseInt( number ) ) ;
               }
            break ;
            case 3 : // Add an integer to end of list
               number =  showIn (
                   "Please enter the number you want to add to beginning the list." ,
                   "Add a number " ) ;

               if ( !(number == null) )  {
                  addLast( Integer.parseInt( number ) ) ;
               }
            break ;
            case 4 : // Does the list contain an integer
               number =  showIn (
                   "Please enter the number you want to find in the list." ,
                   "Contain number?"  ) ;

               if ( number != null  )  {
                  if ( contains( Integer.parseInt( number ) ) ) {
                     JOptionPane.showMessageDialog(  null, "The number " +
                           number + " was found in the list" ,
                           "Number found" ,
                           JOptionPane.PLAIN_MESSAGE ) ;
                  }
                  else {
                     JOptionPane.showMessageDialog(  null, "The number " +
                        number + " was not found in the list" ,
                           "Number not found" ,
                           JOptionPane.PLAIN_MESSAGE ) ;

                  }
               }
            break ;
            case 5 : // Is the list empty?

               if ( number != null  )  {
                  if ( isEmpty() ) {
                     JOptionPane.showMessageDialog(  null,
                          "The Linked list is not empty." ,
                           "Numbers in list" ,
                           JOptionPane.PLAIN_MESSAGE ) ;
                  }
                  else {
                     JOptionPane.showMessageDialog(  null,
                          "The Linked list is empty."  ,
                           "Numbers in list" ,
                           JOptionPane.PLAIN_MESSAGE ) ;

                  }
               }
            break ;
            case 6 : // Delete an integer from the of list
               number =  showIn (
                   "Please enter the number you want to from the list." ,
                   "Delete number" ) ;

               if ( !(number == null) )  {
                  if (Remove( Integer.parseInt( number ) ) ) {
                     JOptionPane.showMessageDialog(  null, "The number " +
                           number + " was found and deleted from the list" ,
                           "Number found" ,
                           JOptionPane.PLAIN_MESSAGE ) ;
                  }
                  else {
                     JOptionPane.showMessageDialog(  null, "The number " +
                        number + " was not found in the list" ,
                           "Number not found" ,
                           JOptionPane.PLAIN_MESSAGE ) ;
                  }
               }
            break ;
            case 7 : // Get the integer from end of list
               number1 = getLast() ;
               JOptionPane.showMessageDialog(  null, "The number " +
                        number1 + " was found at the end of the list." ,
                           "Last number" ,
                           JOptionPane.PLAIN_MESSAGE ) ;
            break ;
            case 8 : // What is the size of the list?
               number1 = size() ;
               JOptionPane.showMessageDialog(  null,
               "The size of the list is  " + number1  + "." ,
                           "Size of List" ,
                           JOptionPane.PLAIN_MESSAGE ) ;
            break ;
            case 9 : // Use the list to create an array
               toArray( arr )  ;

               /** *******************************************
                *  Print to screen the elements in the array.
                **********************************************/
               b = size() ;
               result2 = "" ;
               for( a = 0 ; a < b ; a++ ) {
                  result2 = result2 + " " + arr[ a ]   ;
               }

               JOptionPane.showMessageDialog(  null , result2 ,
                           "Elements in array" ,
                           JOptionPane.PLAIN_MESSAGE ) ;
            break ;
            case 10 : // Display
               DisplayLL() ;
            break ;
            case 11 : // Exit
               cont = false ;
            break ;
            default:
               JOptionPane.showMessageDialog( null,
                  "The option you selected is invalid.\n" +
                  "Please enter a valid option from above." ,
               "Invalis Option selected ",
                     JOptionPane.INFORMATION_MESSAGE);
            break ;
         }
      }

   }

   public static void main(String args[]) {
      boolean ret = false  , cont = true ;
      int a , b = 0 , arr[] = new int[ 100 ]  , toCont ;

      LinkedList pp = new LinkedList() ;

      /** **************************************
       *  Determine if the linked list is empty.
       *****************************************/
      pp.menu() ;

      System.exit( 0 ) ;
   }
}
