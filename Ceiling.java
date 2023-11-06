public class Ceiling {
    public static void main(String[] args) {
        int [] arr = {2,3,5,9,14,16,18};
        int target = 15;
        int ans = ceiling(arr , target);
        System.out.println(ans);
    }

    static int ceiling(int []arr, int target){
        int start = 0;
        int end = arr.length-1;

//       what if the target number is greater than the greatest number in the array.
        if(target > arr[arr.length-1]) {
            return -1;
        }
        //       cealing is smallest number greater than equal to target.
//         and floor is greatest number smaller than equal to target.
        while(start <= end){
            int mid = start+(end-start)/2;
            if(target > arr[mid]){
                start = mid +1;
            }
            else if (target < arr[mid]){
                end = mid -1;
            }
            else{
                return mid;
            }

        }

//      cealing is smallest number greater than equal to target.
        return arr[start];


    }
}
