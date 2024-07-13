package inspection;
//ST10243270

import java.util.Scanner;

public class Use_Inspection {

    public static void main(String[] args) {
        
        //Scanner to read the input
         Scanner scanner = new Scanner(System.in);
         
        //To prompt the user
         System.out.print("Enter the hospital location: ");
         String location = scanner.next();
         System.out.print("Enter the hospital name: ");
         String name = scanner.next();
         System.out.print("Enter years since last inspection: ");
         int years = scanner.nextInt();
                
        HospitalInspections hospitalInspections = new HospitalInspections(name, location, years);
        hospitalInspections.printInspectionReport();
    }
    
}


