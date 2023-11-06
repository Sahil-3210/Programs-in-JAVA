public class Remove_specific_ele {
    public static void main(String[] args) {
        
        int[] a = {33,78,90,20,78,5,50,40};
        int target =78;

        int count = 0;

        for(int i = 0; i < a.length; i++){
            if(a[i] == target)
            {
                count++;
            }
        }
            
        int newIndex = 0;
        int[] newArray = new int[a.length - count];

        for (int i = 0; i < a.length; i++) {
            if(a[i] != target ){
                newArray[newIndex] = a[i];
                newIndex++;
            }
            
        }
        for (int i : newArray) {
            System.out.print(i+" ");
            
        }

            
        
    }
    
}
