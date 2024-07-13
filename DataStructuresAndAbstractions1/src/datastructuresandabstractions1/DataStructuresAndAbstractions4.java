package datastructuresandabstractions1;

public class DataStructuresAndAbstractions4 {

    public static void main(String[] args) 
    {
        int[] firstArr = { 23, 36, 96, 78, 55 };
        int[] secondArr = { 78, 45, 19, 73, 55 };
        findIntersection(firstArr, secondArr);
    }
    private static void findIntersection(int[] myArray1, int[] myArray2)
    {
        System.out.print("Intersection: ");
        for(int i = 0; i < myArray1.length; i++)
        {
            for(int j = 0; j < myArray2.length; j++)
            {
                if(myArray1[i] == myArray2[j])
                    System.out.print(myArray2[j] + " ");
            }
        }
    }
}

