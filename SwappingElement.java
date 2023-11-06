import java.util.Arrays;

public class SwappingElement {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5};
    //     swap(arr, 0, 3);
    //     System.out.println(Arrays.toString(arr));
        
    
    // }
    // static void swap(int[]arr, int index1, int index2){
    //     int temp = arr[index1];
    //     arr[index1] = arr[index2];
    //     arr[index2] = temp;





    

// 2nd way to swap

// to determine the size of an arrray.
        int size = arr.length;
        System.out.println(size);

        int temp = arr[0];
        arr[0]= arr[size-2];
        arr[size-2]= temp;
        System.out.println(Arrays.toString(arr));
//  int size = arr.length will give us the total length of the array which is 5 in this case.
// we are trying to swap 2nd last index with the 0th index
// to know which is the 2nd last index we use arr[size-2]
// eg:- 5-2= 3rd index in the array
// in this way we can get 2nd last index
// and then we are swap it with 0th index
// if we want to access last index of the array we will do
// arr[size-1]   i.e. 5-1=4th index which is the last index for this array. 
    }
}
