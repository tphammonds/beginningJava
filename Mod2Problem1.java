/**
*
*  Project:     Module 2 Programming Problems - Problem 1
*
*  Description: A program that takes girl scout sales information and prints the info in table form.
*
*
*  Algorithm:             
*
*START

Initialize one-dimensional array: int arguments, 5 elements
New Scanner object
Prompt user to input values for each girl scout, entering -1 when finished
If input > 0:
	If input > 0 && <= 10, array[0]++
	If input > 10 && <= 20, array[1]++
	If input > 20 && <= 30, array[2]++
	If input > 30 && <=40, array[3]++
	If input > 40, array[4]++

Print array: 
Total Boxes \t Number of Girl Scouts
0 to 10 \t + array[0]
11 to 20 \t + array[1]
21 to 30 \t + array[2]
31 to 40 \t + array[3]
41 or more \t + array[4]

END	

*
*  Input:        User provides the box count for each girl scout.
*
*
*  Output:       Program takes takes sales input from user and prints the box sales ranges in table form.
*
*
*  @author  Talina Hammonds
*
*  @since   May 31, 2020
*
*/
import java.util.Scanner;

public class Mod2Problem1 {

   public static void main (String[] args) {
      int[] boxes = new int[5];
      Scanner keyboard = new Scanner(System.in);
      System.out.println("You are entering the cookie sales for your local girl scout chapter.\nEnter the number of boxes sold by each girl scout.\nWhen you are finished entering sales, enter a negative number.");
      int input = 0;
      int zerotoTen = 0;
      int eleventoTwenty = 0;
      int twentyonetoThirty = 0;
      int thirtyonetoForty = 0;
      int fortyPlus = 0;
      input = keyboard.nextInt();
      
      while (input > 0) {
          if ((input > 0) && (input <= 10)) {
            boxes[0]++;
         }
         else if ((input > 10) && (input <= 20)) {
            boxes[1]++;
         }
         else if ((input > 20) && (input <= 30)) {
            boxes[2]++;
         }
         else if ((input > 30) && (input <= 40)) {
            boxes[3]++;
         }
         else if (input >40) {
            boxes[4]++;
         }
         input = keyboard.nextInt();
      }
      
      System.out.println("Results of your data collection:");
      System.out.println("Total Boxes \t Number of Girl Scouts");
      System.out.println("0 to 10 \t\t\t " + boxes[0]);
      System.out.println("11 to 20 \t\t " + boxes[1]);
      System.out.println("21 to 30 \t\t " + boxes[2]);
      System.out.println("31 to 40 \t\t " + boxes[3]);
      System.out.println("41 or more \t\t "+ boxes [4]);
   }
}   