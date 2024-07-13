package inspection;
//ST10243270

public abstract class Inspection implements iInspection{
    
    //Declaring all variables
    public String hospitalName;
    public String hospitalLocation;
    public int timeSinceInspection;
    
    public Inspection(String hospitalName , String hospitalLocation, int timeSinceInspection){
      this.hospitalName = hospitalName;
      this.hospitalLocation = hospitalLocation;
      this.timeSinceInspection = timeSinceInspection;
    }
    
    @Override
    public String getHospitalName(){// asking for hospital name
        return hospitalName;
    }

    @Override
    public String getLocation(){// asking for hospital locaation
        return hospitalLocation;
    }
    
    @Override
    public int gettimeSinceInspection(){//asking for years since inspection
        return timeSinceInspection;
    }
    
}
