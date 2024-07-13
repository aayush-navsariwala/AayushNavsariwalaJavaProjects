package pkg3num;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
public class Numbers {

    public static void main(String[] args) {
        int number1, number2, number3;
        Scanner kb=new Scanner (System.in);
        //prompt user
        System.out.println ("Enter number1");
        number1=kb.nextInt();
        System.out.println ("Enter number2");
        number2=kb.nextInt();
        System.out.println ("Enter number3");
        number3=kb.nextInt();
    }
}
