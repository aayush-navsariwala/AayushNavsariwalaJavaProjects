package bubblesortnumbers;


public class BubbleSortNumbersV2 {
        //declare and filling array
        public static int [] numbers={40,89,63,41,35}; 
    
    public static void main(String[] args) {
         
         //display array before sorting
        System.out.println("Array items before sorting: ");
        
        //loop control variable
        int i=0; 
        while(i<numbers.length) {
            //incrementing loop control variable
            System.out.print(numbers[i] + " ");
            i++;
        }
        //sort Array
        for(int y=0; y<numbers.length-1;y++) {
            for (int x=0; x<numbers.length-1;x++) {
                //swap values that are not sorted
                if (numbers[x]>numbers[x+1]) {
                    int temp=numbers[x];
                    numbers[x]=numbers[x+1];
                    numbers[x+1]=temp;
                }
            }
        }
        //display array items after sorting
        System.out.println("\n Array items after sorting: ");
        i=0;
                while(i<numbers.length) {
                    System.out.print(numbers[i] + " ");
                    i++; //incrementing loop variable
                }
    }
    public static void displayArray (int[] numbers) {
        int i=0;//loop control variable
        while (i<numbers.length) {
            System.out.print(numbers[i] + " ");
            i++;//incrementing loop control variable
        }
  
        
        }
    }
    


    
    

