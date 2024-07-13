package propertyprices;

// ST10243270 AAYUSH NAVSARIWALA

public class PropertyPrices {

    public static void main(String[] args) {
        //Declare and populate the arrays
        String[] houseType = {" ","FLAT", "TOWNHOUSE", "HOUSE"};
        String[] provinces = {"Gauteng", "Natal", "Cape"};
        
        //Populate the costs array
        int [][] prices =   {{800000, 1500000, 2000000},
                            {700000, 1200000, 1600000},
                            {750000, 1300000, 1800000}      
        };
        
        //To display the arrays
        System.out.println("\t\t  FLAT \t\t    TOWNHOUSE \t      HOUSE");
        System.out.println("----------------------------------------------------------------");
        for (int m = 0; m < prices.length; m++) {
                    System.out.printf("%-17s ", provinces[m]);
		for (int j = 0; j < prices[m].length; j++) {
                    System.out.printf("%-17s ", prices[m][j]);
			}
                    System.out.println();
		}
        
        //To calculate the average property type price
        System.out.println(" ");
        int rowTotal = 0;
        double average = 0;
        for (int[] price : prices) {
            for (int column = 0; column < price.length; column++) {
                rowTotal += price[column];
            }
            average = rowTotal / price.length;
            System.out.println("Average property prices in Gauteng = R" + average);
            rowTotal= 0;
        }
		}

    private static void printf(String s_, String string) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
    }
    
                                                
        
        
    
    

