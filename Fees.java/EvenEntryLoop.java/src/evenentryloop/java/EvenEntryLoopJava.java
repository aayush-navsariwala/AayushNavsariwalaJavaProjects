
package evenentryloop.java;

import java.util.Scanner;
public class EvenEntryLoopJava {


    public static void main(String[] args) {
    Scanner reader=new Scanner (System.in);
    //prompt user
    System.out.println ("Enter an Even number or the Sentinel Value 999 to stop");
    int num=reader.nextInt();
    
    if (num%2==0){
        System.out.println ("Good job!");
    } else {
        System.out.println ("Error");
    }
    //prompt user    
    System.out.println ("Enter a another input");
    
   
    
    }
    
    
       
       
    }
    
}
