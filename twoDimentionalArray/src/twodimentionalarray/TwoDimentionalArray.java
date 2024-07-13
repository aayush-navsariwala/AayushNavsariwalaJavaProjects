package twodimentionalarray;

import java.util.Scanner;

public class TwoDimentionalArray {

    public static void main(String[] args) {
        
       //creating the string array of the artists
       String[] artist = {"Ed Sheeran", "Pink", "Bruno Mars", "Foo Fighters", "Taylor Swift"};
       
       //creating the artist's sales figures
    long[][] sales = new long[5][3];
        
        sales[0][0] = 900000L;
        sales[0][1] = 800000L;
        sales[0][2] = 500000L;

        sales[1][0] = 700000L;
        sales[1][1] = 500000L;
        sales[1][2] = 500000L;

        sales[2][0] = 800000L;
        sales[2][1] = 100000L;
        sales[2][2] = 50000L;

        sales[3][0] = 100000L;
        sales[3][1] = 200000L;
        sales[3][2] = 200000L;

        sales[4][0] = 300000L;
        sales[4][1] = 100000L;
        sales[4][2] = 50000L;

        //prompting the user to enter a number
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a position (between 1 and 5) to view the artist's CD, DVD and Blu-Ray sales for 2017: ");
        String position = sc.nextLine();
        sc.close();
        
        //for the user's input
        if(!position.matches("\\d+")) {
            System.out.println("Wrong format");
        } else if(Integer.parseInt(position) > 5 || Integer.parseInt(position) < 1 ){
            System.out.println("There are no artists in this position.");
        } else {
            int pos = Integer.parseInt(position) - 1;
            System.out.println("Artist: " + artist[pos]);
            long albumSum = sales[pos][0] + sales[pos][1] + sales[pos][2];
            System.out.println("CD Sales: " + sales[pos][0] + ", DVD Sales: " + sales[pos][1] + ", " + "BLU-RAY Sales: " + sales[pos][2]);
            System.out.println("Total sales: " + albumSum);
        }
    }
}

