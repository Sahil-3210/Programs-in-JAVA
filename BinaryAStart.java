
public class BinaryAStart {
    public static void main(String[] args) {
        int[] arr = {12,13,15,17,18,19,22,25,26};
        int target = 26;
        int ans = binarySearch(arr , target);
        System.out.println("Your target " +target+ " is present at index number " +ans);

    }

    static int binarySearch(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;

        while(start<=end){

            int mid = start + (end-start)/2;

            if(target < arr[mid]){
                end = mid-1;

            }
            else if(target > arr[mid]){
                start = mid+1;
            }
            else{
                return mid;
            }

        }
        return -1;
    }
}
