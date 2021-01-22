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
*     Ask user for student ID number, assign to int variable
*     Compute ID%3, assign remainder to int variable
*     Compute remainder + 3, assign value to chapter variable
*     If chapter is 3: 
*        compute ID%34, assign remainder to int variable
*        compute remainder + 1, assign to problem variable                
*     else if chapter is 4:
*        computer ID%38, assign remainder to int variable
*        compute remainder + 1
*     else if chapter is 5:
*        compute ID%46, assign remainder to int variable
*        compute remainder + 1
*     
*     If chapter is 4
*        print output statement using "Chapter 6"        
*     else
*        print output statment using chapter variable
*  END
*
*  Input:        User provides their student ID number
*
*
*  Output:       Program prints chapter, problem, and page number
*
*
*  @author  Talina Hammonds
*
*  @since   May 19, 2020
*
*/
import java.util.Scanner;

public class Mod1Problem1 {
   public static void main (String[] args) {
   
      System.out.println("What is your student ID number?");
      Scanner keyboard = new Scanner(System.in);
      int studentID = keyboard.nextInt();
      int remainder1 = studentID%3;
      int chapter = remainder1 + 3;
      int problem = 0;
      
      if (chapter == 3) {
         int remainder2 = studentID%34;
         problem = remainder2 + 1;
      }
      
      else if (chapter == 4) {
         int remainder2 = studentID%38;
         problem = remainder2 + 1;
      }
      
      else if (chapter == 5) {
         int remainder2 = studentID%46;
         problem = remainder2 + 1;
      }
      
      if (chapter == 4) {
         System.out.println("On what page of the textbook can problem number " + problem + " from chapter 6 be found?");
         int pageNumber = keyboard.nextInt();
         System.out.println("Please solve programming exercise " + problem + " from chapter 6, on page " + pageNumber + ".");
      }
      
      else {
         System.out.println("On what page of the textbook can problem number " + problem + " from chapter " + chapter + " be found?");
         int pageNumber = keyboard.nextInt();
         System.out.println("Please solve programming exercise " + problem + " from chapter " + chapter + " on page " + pageNumber + ".");
      }
   }
}
