package grocery_system;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by joselitowilliamraymundo on 12/20/17.
 */


public class GrocerySystem {                         /**********************************************************************/
    public static void main(String[] args) {        /*  For now, this System is designed to accept double data type only  */
        Scanner scan = new Scanner(System.in);     /*  as an input. Further enhancement is being done by the Developer   */
        double itemPrice = 0;                     /**********************************************************************/
        double budget = 100;
        double balance = budget;
        int counter = 0;
        List<Double> priceArray = new ArrayList<Double>();
        while (balance > 0) {                                /* This loop checks the balance of the budget*/
            System.out.println("Enter Price of Item:");
            itemPrice = scan.nextDouble();
            if (itemPrice > 0) {                             /* This Condition test if the price is Valid*/
                if (balance >= itemPrice) {                  /* This Condition test if the Balance can still cover the new selected item */
                    balance = balance - itemPrice;
                    priceArray.add(itemPrice);               /* Stores in array the price of the item selected*/
                    counter++;                               /* Keeps track the total of valid items selected*/
                    if (balance == 0) {                      /* This will trigger the exit from the 'While' loop when balance is already zero*/
                        System.out.println("You just purchased your last item cost $" + itemPrice + ". You have reached your limit.");
                        break;
                    } else {
                        System.out.println("You just purchased an item cost $" + itemPrice + ".");
                        System.out.println("Your remaining budget is $" + balance + ".");
                        System.out.println("You are still allowed to buy another item.");
                    }
                } else {
                    System.out.println("Your item of choice  exceeds your remaining budget by $ " + (itemPrice - balance) + ".");
                    System.out.println("Your remaining budget is $" + balance + ".");
                    System.out.println("Please look for a cheaper item. ");
                }
            } else {
                System.out.println("You have entered an invalid price. Please enter again.");
                System.out.println("Your remaining budget is $" + balance + ".");
            }
        }
        System.out.println("Congratulations! You just purchased " + counter + " item(s) with a total of $" + budget + ".");
        counter = 1;
        for (Double price : priceArray) {
            System.out.println("Item " + counter + "      $" + price);
            counter = counter + 1;
        }
        System.out.println("------------" +
                "----");
        System.out.println("TOTAL      $" + budget);
    }
}
/**
 * Build a grocery budget system using while loop
 * User can purchase as many item he wishes within the budget limit of $100.00
 * IF the purchased amount exceeds the budget amount, notify the user with appropriate message
 * you must spend all of budget amount
 * Make sure to test your code and avoid possible bugs.
 */