import java.util.Scanner;
import java.util.Arrays;

public class TwoD_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [][] arr = new int[3][3];

        for(int rows = 0; rows<arr.length; rows++){
            for(int col = 0; col<arr[rows].length; col++){
                arr[rows][col]= sc.nextInt();
            }
        }

        // for(int rows = 0; rows<arr.length; rows++){
        //     for(int col = 0; col < arr[rows].length; col++){
        //         System.out.print(arr[rows][col]+ " ");                             // 1st way for printing output.
        //     }
        //     System.out.println();
        // }   // normal printing of an output.
        
        
        // for(int rows = 0; rows<arr.length; rows++){
        //     System.out.println(Arrays.toString(arr[rows]));                        // 2nd way for printing output.
        // }        //  in arr every element itself is an array
        // by using Arrays.toString() method.



        for (int[] a : arr) { // for every array in arr                              // 3rd way for printing output.
            System.out.println(Arrays.toString(a));
        } // enhanced for loop







        // int [][] arr2D = {
        //     {1,2,3},
        //     {4,5},
        //     {6,7,8,9}
        // };

        // System.out.println(arr2D[2][2]);

    }
}
