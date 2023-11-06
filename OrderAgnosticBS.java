public class OrderAgnosticBS {
    public static void main(String[] args) {

//        int[] arr = {-15,13,-4,-1,0,3,4,7,9,23,45,60}; // sorted ascending array
        int[] arr ={23,15,14,13,12}; //  sorted descending array
        int target = 12;
        int ans = orderAgnosticBS(arr, target);
        System.out.println(ans);

    }

    static int orderAgnosticBS(int[] arr, int target){
//      declare initial start and end
        int start = 0;
        int end = arr.length-1;

//      check weather the array is ascending or descending
//      true if ascending , false if descending
        boolean isAsc;
        if(arr[start] < arr[end]){
            isAsc = true;
        }
        else{
            isAsc = false;
        }


//      check if start is less than end to go in while loop, if not just return any random value or Integer.MAX/MIN
        while (start <= end) {
//              to calculate mid of the given array
                int mid = start + (end - start) / 2;

//              if target is our mid element the return mid.
                if(arr[mid] == target){
                    return mid;
                }

//              when the array is in ascending eg: {12,13,14,15,26}
                if(isAsc){

                    if (target > arr[mid]) {
                    start = mid + 1;
                    }
//                    else if (target < arr[mid])
                    else{
                    end = mid - 1;
                    }
                }

//               when the array is in descending eg: {23,15,14,13,12}
                else{
                    if (target < arr[mid]) {
                        start = mid + 1;
                    }
//                    else if (target > arr[mid])
                    else{
                        end = mid - 1;
                    }
                }
        }

//      Return -1 to indicate the target is not found in the array
        return  -1;


    }

}
