public class MinNumber {
    public static void main(String[] args) {
        int[] num = {12,2234,433,74,2,876,7,1};
        int a = min(num);
        System.out.println(a);
    }

    static int min(int[] arr){
        if(arr.length==0){
            System.out.println("Null array");;
        }
        int Mini = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i]< Mini){
                Mini = arr[i];
            }
            
            
        }
        return Mini;
    }
}
