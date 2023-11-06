import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Duplicate_element {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter five numbers:-");
        int[] nums = new int[5];

        for (int i = 0; i < 5; i++) {
            nums[i] = sc.nextInt();

        }

        if (containsDuplicate(nums)) {
            System.out.println("Array contains duplicate elements.");
        } else {
            System.out.println("Array does not contains duplicate elements.");
        }

    }

    public static boolean containsDuplicate(int[] nums) {

        // create hashset to store integers
        Set<Integer> inSet = new HashSet<>();

        // Iterate over each element
        for (int num : nums) {
            // here the first element will not be present in hashset so it will directly add the element in hashset.
            if (inSet.contains(num))
                return true;

            inSet.add(num);
        }
        return false;
    }
}
