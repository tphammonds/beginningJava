/**
*
*  Project:     Module 5 Project: Repetition Structures
*
*  Description: The program simulates a person driving in a city for one hour at 60mph with broken GPS. At each intersection (every 5 mins) the person turns at random: N, S, E or W (0-3).
*                 This is calculated a total of 12 times (one hour) and the program returns the direct distance between
*                 the person's end location and the starting location.
*
*  Algorithm:                  
START

int x, y, userDir, numberofTurns
x = 0
y = 0
numberofTurns = 1

Random dirRand = new Random();
int upperbound = 4;

while numberofTurns <= 12 {
	userDir = dirRand.nextInt(upperbound);
switch (userDir)
case 0:
y = y+5;
			break;
case 1:
x = x+5;
break;
case 2:
y = y-5;
break;
case 3:
x = x-5;
break;
numberofTurns++
}
X = absolute value of x
Y = absolute value of y
Double distance = sqrt(x*x+y*y)

Print: You are distance miles from your starting location.

STOP

*  Input:        The computer picks a direction (a number 0-3) at random, 12 times.
*
*  Output:       The program returns the distance between the person's end location and starting location.
*
*  @author  Talina Hammonds
*
*  @since   May 19, 2020
*
*/

import java.util.Random;
import java.lang.Math;

public class Mod1Problem3 {

     /**
   *	main method is the entry point to the application.
   *  
   *	@param  args is the parameter of an array of strings
   */

   public static void main(String[] args) {
      
      int x, y, userDir, numberofTurns;
      numberofTurns = 1;
      x = 0;
      y = 0;
      String direction = "origin";
      
      System.out.println("You are driving in the city at 60 mph with a broken GPS.");
      System.out.println("The streets are in a grid pattern, and you turn at random at every intersection, which is every 5 minutes.");
      System.out.println("Your movements:");
      Random dirRand = new Random();
                  
      while (numberofTurns <= 12) {
         userDir = dirRand.nextInt(4);
         switch (userDir) {
           case 0:
              y = y+5;
              break;
           case 1:
              x = x+5;
              break;
           case 2:
              y = y-5;
              break;
           case 3:
              x = x-5;
              break;
         }
         if (userDir == 0) {
            direction = "North";
         }
         if (userDir == 1) {
            direction = "East";
         }
         if (userDir == 2) {
            direction = "South";
         }
         if (userDir == 3) {
            direction = "West";
         }
         System.out.println("5 miles " + direction);
         numberofTurns++;
      }
      x = Math.abs(x);
      y = Math.abs(y);
      Double distance = Math.sqrt(x*x+y*y);
      
      System.out.println("After driving for one hour, you are " + String.format("%.2f", distance) + " miles from your starting location.");

   } 
}