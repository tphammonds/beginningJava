/**
*
*  Project:     Module 2 Programming Problems - Problem 2
*
*  Description: A program that takes individual dive scores from 7 judges and computes the diver's final score.
*
*
*  Algorithm:             
*
*
START

inputValidScore method: //Postcondition: each temp variable must be used to input value to a specific
                              judge’s score
   new Scanner object
   float temp = input;
   if temp is < 0 or > 10, end program
   return temp

inputAllScores method: //Precondition: must have values stored for judge scores
	initialize new array scores {judge1Score, …judge7Score};
	sort array in ascending order
	return scores

inputValidDegreeOfDifficulty method:
   new Scanner object		
   Prompt user for degree of difficulty
	float difficulty = input
	if difficulty is < 1.2 or > 3.8, end program
	return difficulty

calculateScore method: //Precondition: must have sorted array scores
	scores[0] = 0;
	scores[6] = 0;
	float scoreSum = 0
	for all elements, sum and store in float scoreSum
	float finalScore = (scoreSum * degreeofDifficulty) * 0.6
	return finalScore

main method:
   initialize judge1Score-judge7Score, degreeofDifficulty, judgeScores[]

   Prompt user for judge 1 score
   judge1Score = Mod2Problem2.inputValidScore
   
   Prompt user for judge 2 score
   judge2Score = Mod2Problem2.inputValidScore
   
   Prompt user for judge 3 score
   judge3Score = Mod2Problem2.inputValidScore
   
   Prompt user for judge 4 score
   judge4Score = Mod2Problem2.inputValidScore
   
   Prompt user for judge 5 score
   judge5Score = Mod2Probelm2.inputValidScore
   
   Prompt user for judge 6 score
   judge6Score = Mod2Problem2.inputValidScore
   
   Prompt user for judge 7 score
   judge7Score = Mod2Problem2.inputValidScore
   
   judgeScores = Mod2Problem2.inputAllScores(judge1Score, …judge7Score)
   
   degreeofDifficulty = Mod2Problem2.inputValidDegreeOfDifficulty
   
   Print Mod2Problem2.calculateScore(judgeScores, degreeofDifficulty);
   
END
	

*
*  Input:        User provides each individual judge's score and the dive's degree of difficulty.
*
*
*  Output:       Program prints the diver's final score.
*
*
*  @author  Talina Hammonds
*
*  @since   May 31, 2020
*
*/
import java.util.Scanner;

public class Mod2Problem2 {
   
   public static float inputValidScore() {//Precondition: must be preceded by a prompt for user input; temp values must immediately be stored into individual judge score variables
      Scanner keyboard = new Scanner(System.in);
      float temp = keyboard.nextFloat();
      if ((temp < 0) || (temp > 10)) {
         System.out.println("Invalid score entry.");
         System.exit(0);
      }
      return temp;
   }
   
   public static float[] inputAllScores(float judge1Score, float judge2Score, float judge3Score, float judge4Score, float judge5Score, float judge6Score, float judge7Score) {//Precondition: must have values stored for judge scores
      float[] scores = {judge1Score, judge2Score, judge3Score, judge4Score, judge5Score, judge6Score, judge7Score};
      for (int i = 0; i < scores.length-1; i++) {
         float currentMin = scores[i];
         int currentMinIndex = i;
         
         for (int j = i + 1; j < scores.length; j++) {
            if (currentMin > scores[j]) {
               currentMin = scores[j];
               currentMinIndex = j;
            }
         }
         
         if (currentMinIndex != i) {
            scores[currentMinIndex] = scores[i];
            scores[i] = currentMin;
         }
      }
      return scores;
   }
      
   public static float inputValidDegreeOfDifficulty() {
      Scanner keyboard = new Scanner(System.in);
      System.out.println("Enter the degree of difficulty for the dive. Value must be between 1.2 and 3.8, inclusive.");
      float difficulty = keyboard.nextFloat();
      if ((difficulty < 1.2)||(difficulty > 3.8)) {
         System.out.println("Invalid entry.");
         System.exit(0);
      }
      return difficulty;
   }
      
   public static float calculateScore(float[] scores, float degreeofDifficulty) {//Precondition: must have sorted array scores
      scores[0] = 0;
      scores[6] = 0;
      float scoreSum = 0;
      for (int i = 0; i < scores.length; i++) {
         scoreSum += scores[i];
      }
      float finalScore = (scoreSum * degreeofDifficulty) * (float)0.6;
      return finalScore;
   }
      
   public static void main (String[] args) {
      float judge1Score, judge2Score, judge3Score, judge4Score, judge5Score, judge6Score, judge7Score, degreeofDifficulty;
      float[] judgeScores;
      Scanner keyboard = new Scanner(System.in);
      
      System.out.println("There are seven judges for a dive competition. Dives are scored on a 0 to 10 scale.");
      System.out.println("Enter score from judge 1:");
      judge1Score = Mod2Problem2.inputValidScore();
      
      System.out.println("Enter score from judge 2:");
      judge2Score =  Mod2Problem2.inputValidScore();
      
      System.out.println("Enter score from judge 3:");
      judge3Score = Mod2Problem2.inputValidScore();
      
      System.out.println("Enter score from judge 4:");
      judge4Score = Mod2Problem2.inputValidScore();
      
      System.out.println("Enter score from judge 5:");
      judge5Score = Mod2Problem2.inputValidScore();
       
      System.out.println("Enter score from judge 6:");
      judge6Score = Mod2Problem2.inputValidScore();
      
      System.out.println("Enter score from judge 7:");
      judge7Score = Mod2Problem2.inputValidScore();
      
      judgeScores = Mod2Problem2.inputAllScores(judge1Score, judge2Score, judge3Score, judge4Score, judge5Score, judge6Score, judge7Score);
      
      degreeofDifficulty = Mod2Problem2.inputValidDegreeOfDifficulty();
      
      System.out.println("The diver's score for this dive was " + Mod2Problem2.calculateScore(judgeScores, degreeofDifficulty));

   }
}   