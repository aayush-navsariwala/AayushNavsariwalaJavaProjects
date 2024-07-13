package datastructuresandabstractions1;

public class DataStructuresAndAbstractions1 {

    public static void main(String[] args) {

        String[] groceryBag = new String[] { "Sugar", "Soup", "Grain", "Pulse", "Soup", "Soup", "Grain", "Salt", "Spice", "Pulse" };
        
        int len = groceryBag.length; 
        for(int i = 0; i < len; i++)
        {
            int count = 1;
            for(int j = (i+1); j < (len); j++){
                if(groceryBag[i].equals(groceryBag[j])){
                   count++;
                   for(int k = j; k < (len-1); k++)
                       groceryBag[k] = groceryBag[k+1];
                   len--;
                   j--;
                }
            }
            System.out.println("Item: " + groceryBag[i] + " Occurrence: " + count);
            count = 0;
        }
    }
}
