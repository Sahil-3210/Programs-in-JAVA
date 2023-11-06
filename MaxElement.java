import java.util.Arrays;

public class MaxElement {
    public static void main(String[] args) {
        int[] arr = {1,23,44,31,79,66};
        System.out.println(Arrays.toString(arr));
        int maximum_value = max(arr);
        System.out.println("Maximum value in array :- "+maximum_value);

        int maximum_index = indexOfmaxval(arr,maximum_value);
        System.out.println("Index of that maximum value :- "+maximum_index);
        
    }

    static int max(int[] arr){
        // initializing 0th index of an array as the max value which is arr[0]
        int maxval = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] > maxval){
                maxval = arr[i];
            }
            
        }
        return maxval;
    }


    static int indexOfmaxval(int[] arr, int maxval ){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == maxval){
                return i;
            }
            
        }
        // in case if we dont find the maxval the return -1.
        return -1;
    }


}
