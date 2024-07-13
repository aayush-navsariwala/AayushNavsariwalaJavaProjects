package badsubscriptcaught;
import java.util.Scanner;
public class BadSubscriptCaught {

    public static void main(String[] args) {
    
        //Declare array
        String[] names = {"Ariel", "Brad", "Carla"};
        
        //Declare integer for user input and instantiate scnner
        int userInput;
        Scanner kb = new Scanner(System.in);
        
        //Create a try and catch block, catch ArrayOutOfBounds exception
        try {
            System.out.println("Enter a number to display a name ");
            userInput = kb.nextInt();
            System.out.println("Name is " + names[userInput]);
    }
        catch (ArrayIndexOutOfBoundsException mistake) {
            System.out.println("Exception Thrown:" + mistake.getMessage());
    }
        //Display end of program
        System.out.println("End of Program" +"\nThank you");

    }
    }
    