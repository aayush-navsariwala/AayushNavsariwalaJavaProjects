/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prog.the.question2;

/**
 *
 * @author Ryan
 */
public class ProgTHEQUESTION2 {

    public static void main(String[] args) {
        // declare Single array to store type of house
        String provinces[] = {"FLAT", "TOWNHOUSE", "HOUSE"};
        // declare Single array to store theprovinces
        String placeNames[] = {"Gauteng", "Natal", "Cape"};
	//Declaring 2d Array to store the average property type prices
	int data[][] = {            
            {800000, 1500000, 2000000},
	    {700000, 1200000, 1600000},
	    {750000, 1300000, 1800000}
	        };
        //code to print table
	System.out.printf("%20s", "");    
	for (String province : provinces) {
            System.out.printf("%-20s", province);
        }
	    System.out.println("\n--------------------------------------------------------------------------------");
	    
	for(int i=0; i<placeNames.length; i++) {
             System.out.printf("%-20s", placeNames[i]);
	     for(int j=0; j<data.length; j++) {
                 System.out.printf("R %-18s", data[i][j]);
             }
             System.out.println();
        }
        // code to Calculate the total average property price per province  
	System.out.println();
	for(int i=0; i<data.length; i++) {
            int sum = 0;
	    for(int j=0; j<data[i].length; j++) {
                sum += data[i][j];
            }
            
            // code to print average property price 
	    System.out.printf("Average property prices in %s = R %,d\n", placeNames[i], sum/data[i].length);

	    }
	    
    }
    
}
