/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6tranthanh;

/**
 * Lab6
 * December 3, 2018
 * Thanh Tran
 */
public class Lab6TranThanh {
       
    // computes the average score
        public static double computeAverage (double scoreList[]) {
            
        // declare and initialize variables
        double sum = 0;
        double avg = 0;
        
        // compute sum and average
            for (int i = 0; i < scoreList.length; i++){
               sum += scoreList[i]; // computes the sum
                
               avg = sum/scoreList.length;  // computes the avg
            }   // end of for loop
           
            return avg;     // passes the avg score to reference avgOfScores in the main method
            
        }   // end of computeAverage method
        
    // computes the maximum score 
        public static double maximumScore(double arrList[]) {
            
        double max = arrList[0];
        
            // initialize the array with random numbers
            for (int i = 1; i < arrList.length; i++){
            
            if (arrList[i] > max)
                    max = arrList[i];
            }   // end of for loop
            
            return max;     // return the maximum score to reference the maxScore in the main method
        }   // end of maximumScore method
    
    // find scores below the average
        public static void belowAverage (double belowAvgList[]) {
            
            System.out.println ("\nStudents that fall below average:");
            // for loop that searches through all scores in a list and displays the score that fall below 50%
            for (int i = 0; i < belowAvgList.length; i++){

                if (belowAvgList[i] < 50) 
                   System.out.printf ("%2.2f \n", belowAvgList[i]);
        
            }   // end of for loop
        }   // end of belowAverage method
        
    public static void main(String[] args) {
        
        double[] listOfScores = new double[35];
        double sumOfScores = 0;
        
            System.out.println ("Student scores");
            // initialize the array with random numbers
            for (int i = 0; i < listOfScores.length; i++){
               listOfScores[i] = Math.random()*100;
            // Print out the list of scores
               System.out.printf ("%2.2f\n", listOfScores[i], "\n");
               
            }   // end of for loop
            
                //compute the average from the list of scores and display it
                double avgOfScores = computeAverage(listOfScores);  
                System.out.printf ("\nThe Average of class scores is: %1.2f \n", avgOfScores);
                // compute maxScore and display it
                double maxScore = maximumScore(listOfScores);
                System.out.printf ("Maximum Score: %1.2f \n", maxScore);
                // call out the method for any scores below average
                belowAverage(listOfScores);
                          
    }   // end of main
}   // end of class
