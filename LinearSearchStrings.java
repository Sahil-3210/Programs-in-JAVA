import java.util.Arrays;

public class LinearSearchStrings {
    public static void main(String[] args) {
            String  names = "Sahil";
            char target = 'a';
            boolean s = search(names, target);
            System.out.println(s);
            
            System.out.println(Arrays.toString(names.toCharArray()));

    }

    static boolean search(String str, char target){
        if(str.length()==0){
        return false;}
        for(int i = 0; i<str.length(); i++){
            if(target == str.charAt(i)){
                return true;
            }
        }
        // for (char ch : str.toCharArray()) {
        //     if(ch==target){
        //         return true;
        //     }
        // }
        return false;
    }
}
// to use for each loop use have to convert String to a Char array:---- str.toCharArray()

