package topthreedevices;

public class TopThreeDevices {

public static void main(String[] args) {
    
        //DONE BY ST10243270 & ST10208163
		
        //declare separate arrays
        String[] time = { " ", "JAN", "FEB", "MAR", "TOTAL" };
        String[] devices = { "iPhone 7", "Samsung S8", "Huawei Mate 10" };
	
        //populate sales arrays
        int[][] sales = {{30,15,35,80}, 
                        {20,25,30,75}, 
                        {25,11,32,68} 
            };
        System.out.println("***************************************************");
        System.out.println("TOP CELL PHONE SALES REPORT - 2018");
        System.out.println("***************************************************");
        int[] total = {75,51,97};
            for (int i = 0; i < time.length; i++) {
                if (i == 0) {
                    System.out.printf("%-17s ", time[i]);
}               else {
                    System.out.printf("%-8s ", time[i]);
			}
                
		}
                    System.out.println();
		for (int m = 0; m < sales.length; m++) {
                    System.out.printf("%-17s ", devices[m]);
		for (int j = 0; j < sales[m].length; j++) {
                    System.out.printf("%-8s ", sales[m][j]);
			}
                    System.out.println();
		}
                    System.out.println("***************************************************");
                    System.out.printf("%-17s ", "MONTHLY TOTAL");
		for (int i = 0; i < total.length; i++) {
                    System.out.printf("%-8s ", total[i]);
               
		}
               
	}   
            
}
    
                
    
    

