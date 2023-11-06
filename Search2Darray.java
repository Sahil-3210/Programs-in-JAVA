import java.util.Arrays;

public class Search2Darray {
    public static void main(String[] args) {
        int [][] arr = {
            {43,43,2,9},
            {99,7,55,12},
            {9,7,11},
            {8,343,77,83,6}
            };
            int[] ans = search(arr, 11);
            System.out.println(Arrays.toString(ans));
        

    }


    static int[] search(int[][] arr, int target){
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




    
