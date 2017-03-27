/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minandmaxgrade;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author brian
 */
public class MinandMaxGrade {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    int num_of_grades;
    
    //Declare variable minGrade as type int and initialize it to Integer.MAX_VALUE
    int minGrade = Integer.MAX_VALUE ;
    
    //Declare variable maxGrade as type int and initialize it to Integer.MIN_VALUE
    int maxGrade = Integer.MIN_VALUE ;
    
    //Create objects and declare variables for loop
    Scanner scan = new Scanner ( System. in ) ;
    System.out.print ( "Please enter number of grades " );
    num_of_grades = scan.nextInt();
    int grade = 0 ;
    int total = 0 ;
    
    //Use a for loop to get 6 values. Inside the for loop:
    for ( int i = 1 ; i <= num_of_grades ; i++ )
    {
      //use a do-while loop to make sure that each entered value is in the correct range.
      do
      {
        System.out.print ( "Please enter grade " + i + " > " );
        grade = scan.nextInt() ;
      } while ( ! ( grade >=0 && grade <= 100 ) ) ;
      
      //calculate requested minimum, maximum, and the running total as the values of grades are entered
      if ( grade < minGrade )
      {
        minGrade = grade ;
      }
      if ( grade > maxGrade )
      {
        maxGrade = grade ;
      }
      
      total += grade ;
    }
    
    //When outside of the for loop calculate the requested average
    DecimalFormat avgPattern = new DecimalFormat ( "#0.00" ) ;
    
    double average = ( double )( total ) / num_of_grades ;
    
    //Display the results
    System.out.println( "The average grade is " 
                         + avgPattern.format(average) + ". The minimum grade is " + minGrade
                         + ", and the maximum grade is " + maxGrade );
    }
    
}
