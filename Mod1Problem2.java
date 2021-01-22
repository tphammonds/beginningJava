/**
*
*  Project:     Module 1 Programming Problems
*
*  Description: A program to simulate a vending machine
*
*
*  Algorithm:             
*
*  START
*Welcome user, ask for money: $5, $1, .25, .10, .05, .01 denominations; enter in cents (i.e., 500, 100,
* 	25, etc.), type 0 when finished
*While in pay != 0:	
*pay = input
*	money = money + pay;
*Give user items available, ask for item selection: 1-5; 0 to cancel
*Boolean buy = true;
*For loop, I < 5;
*	While buy == true, loop through switch statement 
*      If not enough money, tell user to pick again (loop will continue up to 4 times)
*      If enough money, deliver item & end loop
*   	Money = money – price
*Double change = money/100 (formatted)
*Return change, if any: 
*	“Your change: $“ + change
*	Quarters = money / 25; 
*	Money = Money % 25;
*	Dimes = money / 10;
*	Money = money % 10;
*	Nickels = money / 5;
*	Money = money % 5;
*	Pennies = money;
*	Print: Quarters “quarters, “ dimes “ dimes, “ nickels “ nickels,” pennies “ pennies
*
*  END
*
*  Input:        User provides their money
*
*
*  Output:       Program takes money from the user, distributes selection and gives change.
*
*
*  @author  Talina Hammonds
*
*  @since   May 19, 2020
*
*/
import java.util.Scanner;

public class Mod1Problem2 {

   public static void main (String[] args) {
   
      System.out.println("Thank you for shopping TPH Vending! We accept $5 bills, $1 bills, and coins.");
      System.out.println("Enter your payment one bill or coin at a time. Enter the denomination in cents, i.e. $1.00 = 100:");
      int pay = 1;
      int money = 0;
      Scanner keyboard = new Scanner(System.in);
      while (pay != 0) {
         pay = keyboard.nextInt();
         money = money + pay;
         System.out.println("Continue entering your payment or enter 0 to begin item selection.");

      }
            
      System.out.println("Your options for purchase: ");
      System.out.println("1 - Original Potato Chips: $.55");
      System.out.println("2 - Chocolate Chip Cookie: $.65");
      System.out.println("3 - Honey Roasted Peanuts: $.50");
      System.out.println("4 - Apple: $.35");
      System.out.println("5 - Spearmint Gum: $.25");
      System.out.println("To begin item selection, enter the number of the item you wish to purchase. Enter 0 to cancel your purchase.");
      boolean buy = true;
      
      for (int i = 0; i < 5; i++) {
         while (buy && i<5) { 
            int item = keyboard.nextInt();
            switch (item) {
               case 0:  System.out.println("Thank you for shopping TPH Vending.");
                        System.exit(0);
               
               case 1:  System.out.println("You have selected Original Potato Chips.");
                        if (money >= 55) {
                           System.out.println("That will be $.55.");
                           money = money - 55;
                           buy = false;
                        }      
                        
                        else {
                           System.out.println("Sorry, you do not have enough money for that item. Try selecting something else, or enter 0 to end purchase.");
                           buy = true;
                           i++;
                        }
                        break;
                        
               case 2:  System.out.println("You have selected Chocolate Chip Cookie.");
                        if (money >= 65) {
                           System.out.println("That will be $.65.");
                           money = money - 65;
                           buy = false;
                        }      
                        
                        else {
                           System.out.println("Sorry, you do not have enough money for that item. Try selecting something else, or enter 0 to end purchase.");
                           buy = true;
                           i++;
                        }
                        break;
               
               case 3:  System.out.println("You have selected Honey Roasted Peanuts.");
                        if (money >= 50) {
                           System.out.println("That will be $.50.");
                           money = money - 50;
                           buy = false;
                        }      
                        
                        else {
                           System.out.println("Sorry, you do not have enough money for that item. Try selecting something else, or enter 0 to end purchase.");
                           buy = true;
                           i++;
                        }
                        break;
                        
               case 4:  System.out.println("You have selected Apple: $.35.");
                        if (money >= 35) {
                           System.out.println("That will be $.35.");
                           money = money - 35;
                           buy = false;
                        }      
                        else {
                           System.out.println("Sorry, you do not have enough money for that item. Try selecting something else, or enter 0 to end purchase.");
                           buy = true;
                           i++;
                        }
                        break;
                        
               case 5:  System.out.println("You have selected Spearmint Gum: $.25.");
                        if (money >= 25) {
                           System.out.println("That will be $.25.");
                           money = money - 25;
                           buy = false;
                        }      
                        else {
                           System.out.println("Sorry, you do not have enough money for that item. Try selecting something else, or enter 0 to end purchase.");
                           buy = true;
                           i++;
                        }
                        break;
                        
               default: System.out.println("Invalid entry.");
                        System.exit(0);
            }
         }
      }
      
      double change = (double)money/100;
      System.out.println("Your change: $" + String.format("%.2f", change));
      
      int quarters = money/25;
      money = money %25;
      int dimes = money/10;
      money = money %10;
      int nickels = money/5;
      money = money %5;
      int pennies = money;
      
      System.out.println(quarters + " quarters, " + dimes + " dimes, " + nickels + " nickels, and " + pennies + " pennies.");

   }
}
