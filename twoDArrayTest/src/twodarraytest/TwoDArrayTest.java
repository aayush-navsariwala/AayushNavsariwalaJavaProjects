package twodarraytest;

public class TwoDArrayTest {

    public static void main(String[] args) {
       
        //declare and fill 2nd Array
        String [] series= ("Big Bang Theory","Scandal","Modern Family","Dexter","Grand Designs")
        
        //create and fill array with ratings
        int [][] ratings =  {{9,8,5},
                            {7,5,5},
                            {8,8,8},
                            {10,7,8},
                            {3,1,5}};
       
        //declare additional variables 
        int sum= 0,average=0;int count=0;
        String continuation="";
        
        //print headings
        System.out.println("Series Name \t" + "Rating \t" + "Series Continuation \t");
            System.out.println("-----------------------------------------------------");
            
            ///display series name, rating and continuation row by row
            for(int row=0;row<ratings.length;row++){
                System.out.print(series[row]);
                for(int col=0;col<ratings[row].length;col++) {
                    sum+=ratings[row][col];
                    count=ratings[row].length;
                }
                //calculate average of ratings
                average=sum/count;
                
                //check for continuation
                if (average>=7) {
                    continuation="YES";
                }
                else {
                    continuation="NO";
                }
                System.out.print("    "+average + "    " + continuation);
                System.out.println("   ");
            }
    }
    
    
           
           }
           
       
        
        
    


