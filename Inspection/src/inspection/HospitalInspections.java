package inspection;

public class HospitalInspections extends Inspection{
       
    public HospitalInspections(String hospitalName , String hospitalLocation, int timeSinceInspection){
      super(hospitalName, hospitalLocation,timeSinceInspection); 
    }
    
    @Override
    //For the hospital name
    public String getHospitalName(){
        return hospitalName;
    }

    @Override
    //For the location of the hospital
    public String getLocation(){
        return hospitalLocation;
    }
    
    @Override
    //For the amount of years since the last inpection
    public int gettimeSinceInspection(){
        return timeSinceInspection;
    }
    
    @Override
    //For telling the user whether an inspection is required or not
     public String getInspectionNeeded(){
         if(gettimeSinceInspection()>2){
             return "YES";
         }
        return "NO";
    }
    public void printInspectionReport(){
        //For the report
        System.out.println("HOSPITAL INSPECTION REPORT");
        System.out.println("*******************");
        System.out.println("HOSPITAL LOCATION: " + getLocation());
        System.out.println("HOSPITAL NAME : " + getHospitalName());
        System.out.println("YEARS SINCE INSPECTION: " + gettimeSinceInspection());
        System.out.println("INSPECTION NEEDED: " + getInspectionNeeded());
     
    }
}
