package hospitalhealthinspection;
//ST10243270 Question 1

import java.text.DecimalFormat;

public class HospitalHealth {

//To create the decimal points    
private static final DecimalFormat df = new DecimalFormat("0.00");

    public static void main(String[] args) {
        //To declare the array for inspections
        int[][] inspecNum =     {{4,8,6},
                                 {5,4,2},
                                 {4,2,8},
                                         };
        //Declaring the array for each hospital
        String[] hospital = {"HOSPITAL 1: -->", "HOSPITAL 2: -->", "HOSPITAL 3: -->"};        

        //Declaring the term used for the number of times visited monthly
        double monthlyTotal = 0, sum = 0;

        //Output for the report 
        System.out.println("****************************************************************************");
        System.out.println("HEALTH INSPECTION REPORT");
        System.out.println("****************************************************************************");
        
        //Output of the amount of months
        System.out.println("\t\t\tJAN\t\t" + "FEB\t\t" + "MAR\t\t" + "AVG");
        
        //To display the hospital numbers vertically
        for(int row = 0; row < inspecNum.length; row++)
        {
            System.out.print(hospital[row]);
            
            //To display the number of inspections horizontally
            for(int col = 0; col < inspecNum[row].length; col++)
            {
            //To calculate the total of each row
            sum = sum + inspecNum[row][col];
            System.out.print("\t\t" +inspecNum[row][col]);        
            }
            System.out.print("\t\t" + df.format(sum/3));
            sum = 0;
            System.out.println(" ");
        }
        //Output for the monthly total visits
        System.out.println("****************************************************************************");
        System.out.println  ("MONTHLY TOTALS ");
        System.out.println("****************************************************************************");
        
        //To display the totals vertically 
         for(int row = 0; row < inspecNum.length; row++)
        {
            System.out.print(hospital[row]);
            for(int col = 0; col < inspecNum[row].length; col++)
            {
                monthlyTotal += inspecNum[row][col]; 
            }
            System.out.print("\t\t" + monthlyTotal);
            monthlyTotal = 0;
            System.out.println(" ");
        }
    }
    
}
