/********************************************
*	AUTHORS:	Jackson Addy
*	LAST MODIFIED:	10/13/2024
********************************************/

/********************************************
Item Percentage Caculator 
*	PROGRAM DESCRIPTION:
*The purpose of my program is to provide a convenient way to easily calcualte the percentage discount on any item that may be purchased.
*Often, I come across deals, like 15% off, and I have no idea what the final cost would be.
*I realized that through computer science, I could address this weakness by having a computer quickly cacluate the total for me. 
/********************************************

*********************************************
*	ALGORITHM:
*	Get the users input for the discount percentage and the items price. 
*Caculate the amount saved based on the discount entered. 
*Caculate then display the final price with the discount.
*********************************************

/********************************************
*	STATIC METHODS:
* I worked alone
*********************************************/


public class Main 
{
  /***** CONSTANT SECTION *****/
  
  public static void main(String[] args)
  {
    /***** DECLARATION SECTION *****/
    double discount, itemPrice;
    String member, casual;
    
    /***** INITIALIZATION SECTION *****/
    discount = UtilityBelt.readDouble("Discount %: ", 1, 9999);  // Read discount percentage
    itemPrice = UtilityBelt.readDouble("Item's Price: ", 1, 9999);  // Read item price
    member = char UtilityBelt.readChar("Are you a member? (Y/N) ", "y", "n", "N", "Y");
    
    
    /***** PROCESSING SECTION *****/
    double result = discountPrice(discount, itemPrice);  // Calculate the discount amount
  
    /***** OUTPUT SECTION *****/
    System.out.printf("If your item costs $%5.2f and you have a discount of %.2f%%, you will be saving $%5.2f, making your overall price $%5.2f.\n",  itemPrice, discount, result, (itemPrice - result));
  }

  /***** STATIC METHODS *****/
  public static double discountPrice(double discount, double price)
  {
    double discountRate = discount / 100;
    double priceOff = price * discountRate;
    return priceOff;
  }

}
