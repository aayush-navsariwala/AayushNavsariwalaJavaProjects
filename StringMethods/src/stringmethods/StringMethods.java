package stringmethods;
import java.util.Scanner;


public class StringMethods {

   
    public static void main(String[] args) {
        StringMethods rev=new StringMethods();
	Scanner sc=new Scanner(System.in);
	System.out.print("Please enter a string: ");
	String  str=sc.nextLine();	
	System.out.println("The reverse of that string  is: "+rev.reverse(str));
	}
static String reverse(String s)
	{
	String rev="";
	for(int j=s.length();j>0;--j)
	{
	rev=rev+(s.charAt(j-1)); 
	}
	return rev;
    }
    
}
