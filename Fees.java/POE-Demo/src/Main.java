import java.util.Scanner;
public class Main {
    
    public static void main(String[] args) {
        //TODO Autho-generated method stub
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number:");
        int n = sc.nextInt();
        System.out.println(0 + " , " + 1);
        int first = 0;
        int sec = 1;
        int fib = first + sec;
        for (int i = 3; i<=n; i++)  {
            System.out.print(" , " + fib);
            first = sec;
            sec = fib;
            fib = first + sec;
        }
        
    }