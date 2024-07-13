package trytoparsedouble;
import java.util.Scanner;
public class TryToParseDouble {

    public static void main(String[] args) 
    {
        Scanner kb = new Scanner(System.in);
        double num;
        try
        {
            System.out.print("Enter a floating point number: ");
            num = Double.parseDouble(kb.nextLine());
        }
        catch(NumberFormatException error)
        {
            num = 0;
            System.out.println("Value entered cannot be converted to a floating point number");
        }
        System.out.println("Number is " + num);
    }  
}
