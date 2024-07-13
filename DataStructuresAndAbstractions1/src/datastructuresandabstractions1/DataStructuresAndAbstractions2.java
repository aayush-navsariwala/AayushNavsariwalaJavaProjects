package datastructuresandabstractions1;

        public class DataStructuresAndAbstractions2{
            
    public static void main(String args[]){
        
        int a[][] = {{ 2,3,1 },{ 7,4,1 },{ 9,-2,1 }};
        int b[][] = {{ 9,-2,1 },{ 5,7,3 },{ 8,1,0 }};
        int c[][] = new int[3][3];
        System.out.println("Resultant Matrix:");
        
        for(int i = 0; i < 3; i++)
        {    
            for(int j = 0; j < 3; j++){
                c[i][j] = 0;
                for(int k = 0; k < 3; k++){
                    c[i][j]+=a[i][k]*b[k][j];
                }
                System.out.print(c[i][j]+" ");
            }
            System.out.println();
        }
    }
}

