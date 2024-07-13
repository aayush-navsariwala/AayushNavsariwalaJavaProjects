package twodarrayexample;

public class TwoDArrayExample {
    public static void main(String[] args) {
       //declare and fill 2nd Array
       int [][] numbers =   {{2,4,6,8},
                            {10,12,14,16},
                            {18,20,22,24}
       };
       int sum=0,average=0,count=0;
       //display headings
       System.out.println("Col 1 \t" + "Col 2 \t" + "Col 3 \t" + "Col 4 \t" + "Sum \t" + "Average \t");
       //display 2D array row by row
       for(int row=0;row<numbers.length;row++){
           for(int col=0;col<numbers[row].length;col++) {
               
               sum+=numbers[row][col]; //calculate the sum of each row
               System.out.print(numbers[row][col] + "\t");
               count=numbers[row].length; //counts the total number of columns
               
       }
           average=sum/count; //calculate the average of each row
           System.out.print(sum + "\t" + average);
           sum=0;
           System.out.println(" ");
    }
    //calculate the sum and average
    }
}
