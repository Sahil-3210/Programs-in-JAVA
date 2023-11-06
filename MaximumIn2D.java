import java.util.Arrays;

public class MaximumIn2D {
    public static void main(String[] args) {
        int [][] nums = {
            {43,43,2,9},
            {99,7,55,12},
            {9,7,11},
            {8,343,77,83,6}
            };
            // below 2 lines will print the maximum number for the 2D array.
            // 1st static method is used to find maximum number.
            int target =maximum(nums);
            System.out.println(target);


            // below 2 lines will print the position of target form 2Darray.
            // 2nd static method is used to find position of any target we want.
            // target = 343;
            int[] ans = search1(nums, target);   // int[] ans = {rows,cols};
            System.out.println(Arrays.toString(ans));
            // if we dont want to print int[] ans by Arrays.toStirng() we can use if else also
            // condition be if(ans!=null) or we can directly syso in main method.
            
        }



        // for Maximum
        static int maximum(int[][]arr){
            // below step is same as initializing int max = 0; in normal maximum program.
            // below step is for initializing max of 2Darray as [0][0]  i.e [rows][cols] 
            int max = arr[0][0]; 
            // we can aslo take this for initializing 
            // int max = Integer.MIN_VALUE;
            for (int rows= 0; rows < arr.length; rows++) {
                for (int cols = 0; cols < arr[rows].length; cols++) {
                    if(arr[rows][cols]>max){
                        max = arr[rows][cols];
                    }
                    
                }
                
            }
            return max;
        }



        // for searching the position.
        static int[] search1(int[][] arr, int target){
            for (int rows = 0; rows < arr.length; rows++) {
                for (int cols = 0; cols < arr[rows].length; cols++) {
                    
                    if(arr[rows][cols]==target){
    // Array Initialization: In Java, {row, col} without the new keyword is used for array initialization, not array creation. It can only be used in certain contexts, like when declaring an array variable, as in int[] arr = {row, col};. It can't be used for creating an array as a return value from a method.
    
    // new Keyword: When you use new int[] {row, col}, you are creating a new integer array object on the heap memory. This array object can be returned from the method, and the caller can work with it as a distinct array. This ensures that you return a newly created array with the values row and col in it.
                        return new int[] {rows,cols};
                    }
                }
                
            }
            return null;
        }
}
