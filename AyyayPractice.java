public class AyyayPractice {
    public static void main(String[] args) {
        
        int [] nums = {112,565,3,34,53,42,7,46,34};
        int target = 34;
        int a = linear(nums, target);
        System.out.println(a);
    }

    static int linear(int [] arr, int target){

        if(arr.length==0){
            return Integer.MAX_VALUE;
        }

        for (int i = 0; i < arr.length; i++) {
            int element = arr[i];
            if(element==target){
                return i;     // represents index values
            }
        }

        return Integer.MAX_VALUE;
    }
    

}
