
import java.util.Scanner;
public class Fees {
    public static void main(String[] args){

        Scanner keyboard = new Scanner(System.in);
       
        final int COST_PER_CREDIT = 85;
        final int ATHLETIC_FEE = 65;

        System.out.println("Please enter number of credit hours ");
        int studentCredits = keyboard.nextInt();

        System.out.println("You have entered " + studentCredits);

        System.out.println("Please enter cost of books ");
        double bookCost = keyboard.nextInt();

        System.out.println("You have entered " + bookCost);

        double creditCost = COST_PER_CREDIT * studentCredits;

        double total = creditCost +(double)bookCost + (double)ATHLETIC_FEE;
       
        System.out.println("Your total cost is $ " + total);

    }

}