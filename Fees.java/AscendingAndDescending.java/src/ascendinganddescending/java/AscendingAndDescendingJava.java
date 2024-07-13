package ascendinganddescending.java;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class AscendingAndDescendingJava {

    public static void main(String [] args) {
        // Create a Scanner object to read input from the user
        Scanner kbd = new Scanner(System.in);

        // Prompt the user to enter the first number
        System.out.println("Enter the first number:");
        int num1 = kbd.nextInt();

        // Prompt the user to enter the second number
        System.out.println("Enter the second number:");
        int num2 = kbd.nextInt();

        // Prompt the user to enter the third number
        System.out.println("Enter the third number:");
        int num3 = kbd.nextInt();

        // Create an array to hold the three numbers
        Integer[] arr = new Integer[3];
        arr[0] = num1;
        arr[1] = num2;
        arr[2] = num3;

        // Sort the array in descending order and print the result
        Arrays.sort(arr, Collections.reverseOrder());
        System.out.println("Descending:");
        System.out.println(arr[0] + " " + arr[1] + " " + arr[2]);

        // Reset the array to the original input values
        arr[0] = num1;
        arr[1] = num2;
        arr[2] = num3;

        // Sort the array in ascending order and print the result
        Arrays.sort(arr);
        System.out.println("Ascending:");
        System.out.println(arr[0] + " " + arr[1] + " " + arr[2]);
    }
}



