/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.fees.java;

/**
 *
 * @author aayus
 */
public class FeesJava {

    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
}
import java.util.Scanner;

/**
 *
 * @author aayus
 */
public class Fees { //begin class
    public static void main(String[] args){

        //Create scanner object
        Scanner keyboard;
        keyboard = new Scanner(System.in);

        //Declare final variables (since they are constants)
        final int COST_PER_CREDIT = 85;
        final int ATHLETIC_FEE = 65;

        //Prompt user for number of credits using only integer values (we cannot allow 1.5 credits)
        System.out.println("Please enter number of credit hours ");
        int studentCredits;
        studentCredits = (int) keyboard.nextInt();

        //Echo user input
        System.out.println("You have entered " + studentCredits);

        //Prompt user for cost of books- use double data type
        System.out.println("Please enter cost of books ");
        double bookCost;
        bookCost = keyboard.nextInt();

        //Echo user input
        System.out.println("You have entered " + bookCost);

        //Create variable for product of COST_PER_CREDIT and studentCredits to avoid confusion in print line
        double creditCost = COST_PER_CREDIT * studentCredits;

        /*Create variable for total fees and typecast integer values to double values to avoid
         * ambiguity in print line 
         */
        double total = creditCost +(double)bookCost + (double)ATHLETIC_FEE;


        //Print total costs
        System.out.println("Your total cost is $ " + total);




    }//end main

}//end class 