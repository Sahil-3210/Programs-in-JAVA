public class Unique_pair {
    public static void main(String[] args) {
        int [] a ={2,4,3,5,6,-2,4,7,8,9};
        int target = 7;
        Paris(a,target);
    }

    static void Paris(int[] arr, int target){
        for (int i = 0; i < arr.length; i++) {
            for(int j = i+1; j< arr.length; j++){
                if(arr[i] + arr[j] == target){
                    System.out.println(arr[i]+" "+arr[j]);
                }
            }//??????????????????

        }
    }
}
