/**
*
*  Project:     Module 1 Programming Problems
*
*  Description: A program to take a student ID number and determine the problem they will solve for the weekly discussion post.
*
*
*  Algorithm:             
*
*  START
*Brief explanation of complex numbers formula
*Ask user for two numbers to be used as real
*a1 = input
*a2 = input
*Ask user for two numbers to be used as imaginary
*b1 = input
*b2 = input
*
*Print : z1 = a1 + i*b1
*	z2 = a2 + i*b2
*	
*	z1 + z1 = (a1+a2) + i*(b1+b2)
*	z1 – z2 = (a1-a2) + i*(b1-b2)
*	z1*z2 = (a1*a2 – b1*b2) + i(a1*b2 + b1*a2)
*	z1/z2 = (a1*a2 + b1*b2)/(a2^2 + b2^2) + i(b1*a2 – a1*b2)/(a2^2
* 		+ b2^2)
*
*  END
*
*  Input:        User provides two numbers for real portion of equation and two for imaginary portion of equation
*
*
*  Output:       Program prints complex number equations using user's numbers
*
*
*  @author  Talina Hammonds
*
*  @since   May 19, 2020
*
*/
import java.util.Scanner;

public class Mod1Problem4 {

   public static void main (String[] args) {
   
      System.out.println("To compute a complex number, we use the following formula:");
      System.out.println("z = a + i*b");
      System.out.println("Here, 'a' represents the real portion of the equation, and 'b' will be used to compute the imaginary portion.");
      System.out.println("To compute multiple complex numbers, the same formula can be used:");
      System.out.println("z1 = a1 + i*b1");
      System.out.println("z2 = a2 + i*b2");
      System.out.println();
      System.out.println("We are going to examine the formulas used to perform operations on two complex numbers.");
      System.out.println("Enter two numbers to be used for a1 and a2:");
      Scanner keyboard = new Scanner(System.in);
      float a1 = keyboard.nextFloat();
      float a2 = keyboard.nextFloat();
      System.out.println("Enter two numbers to be used for b1 and b2:");
      float b1 = keyboard.nextFloat();
      float b2 = keyboard.nextFloat();
      System.out.println();
      System.out.println("Using the numbers you provided, the following formulas would be used to compute the two complex numbers:");
      System.out.println("z1 = " + a1 + " + i*" + b1);
      System.out.println("z2 = " + a2 + " + i*" + b2);
      System.out.println();
      System.out.println("Now to perform operations on our z1 and z2, we can use the following formulas:");
      System.out.println("Addition: z1+z2 = (" + a1 + "+" + a2 + " + i*(" + b1 + "+" + b2 + ")");
      System.out.println("Subtraction: z1-z2 = (" + a1 + "-" + a2 + " + i*(" + b1 + "-" + b2 + ")");      
      System.out.println("Multiplication: z1*z2 = (" + a1 + "*" + a2 + " - " + b1 + "*" + b2 + ") + i(" + a1 + "*" + b2 + " + " + b1 + "*" + a2 + ")");
      System.out.println("Division: z1/z1 = (" + a1 + "*" + a2 + " + " + b1 + "*" + b2 + ")/(" + a2 + "^2 + " + b2 + "^2) + i(" + b1 + "*" + a2 + " - " + a1 + "*" + b2 + ")/(" + a1 + "^2 + " + b2 + "^2)");
            
   }
}
