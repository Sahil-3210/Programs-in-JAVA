import java.util.Arrays;

public class Reverse_Array {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,88,9};
        // for (int i = 0; i < arr.length; i++) {
            //     System.out.print(arr[i]+ " ");
            // }
        System.out.println(Arrays.toString(arr));
        swap(arr);
        System.out.println(Arrays.toString(arr));
        

    }
    static void swap(int[]arr ){
        int i = 0;
        int j = arr.length-1;
        // System.out.println(j);
        
        while(i<j){
           int t = arr[i];
           arr[i] = arr[j];
           arr[j]= t;
           i++;
           j--; 
        }
    }
}
