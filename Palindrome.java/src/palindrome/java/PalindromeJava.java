package palindrome.java;
import java.util.Scanner;

public class PalindromeJava {

    public static void main(String[] args) {
         {
        String x, y = "";
       Scanner a = new Scanner(System.in);
      System.out.print("Enter a string:");
     x = a.nextLine();
        int l = x.length();
       for(int k = l - 1; k >= 0; k--)
     {
          y = y + x.charAt(k);
      }
      if(x.equalsIgnoreCase(y))
        {
            System.out.println("Good job.");
        }
        else
        {
            System. out.println("Not in palindrome.");
        }
    }
}
    
    }       

