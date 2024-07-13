package datastructuresandabstractions1;

public class DataStructuresAndAbstractions3 {

    public static void display(int[][] matrix)
    {
        System.out.println("Transposed matrix: ");
        for(int[] row : matrix)
        {
            for(int column : row){
                System.out.print(column + " ");
            }
            System.out.println();
        }
   }
   public static void main(String[] args)
   {
       int row = 2, column = 3;
       int[][] matrix = {{ 3, 4, 6 }, { 5, 2, 9 }};
       int[][] transpose = new int[column][row];
       for(int i = 0; i < row; i++) 
       {
           for(int j = 0; j < column; j++) 
           {
               transpose[j][i] = matrix[i][j];
           }
       }
       display(transpose);
   }
}
 
