/********************************************
*	AUTHORS:	<your names>
* COLLABORATORS: <name of peer, tutor, instructor, anyone else who helped>
*	LAST MODIFIED:	<date of last change>
********************************************/

/********************************************
*	<TITLE OF PROGRAM>
*********************************************
*	PROGRAM DESCRIPTION:
*	<1-2 sentences describing overall program>
*********************************************
*	ALGORITHM:
*	<Pseudocode here>
*********************************************
*	STATIC METHODS:
* <list of static methods and which teammate made each>
*********************************************/


public class Main 
{
  /***** CONSTANT SECTION *****/

  public static void main(String[] args)
  {
    /***** DECLARATION SECTION *****/
   double discount = 47;
   double itemPrice = 50;
   double result = discountPrice(discount,itemPrice);
  
    /***** INITIALIZATION SECTION *****/

    /***** INTRO SECTION *****/

    /***** PROCESSING SECTION *****/

    /***** OUTPUT SECTION *****/
    System.out.println("if your item cost $" + itemPrice + " and you have a discount of %" + discount + " you will be saving $" + result + "making your overall price $" + (itemPrice - result));
  }
  /***** STATIC METHODS *****/
  public static double discountPrice(double num1, double num2)
  {
    double numDisc = num1 / 100;
    double priceOff = num2 * numDisc;
    return priceOff;
  }
}
