// public class Linear_Search {
//     public static void main(String[] args) {
//         int[] nums = { 1, 22, 554, 765, 434, 77, 90, -345, -2, -1 };
//         int target = 77;
//         boolean out = linearSearch(nums, target);
//         System.out.println(out);

//     }

//     // static int linearSearch(int[] arr, int target) {
//     //     if (arr.length == 0) {
//     //         return -1;
//     //     }

//     //     for (int i = 0; i < arr.length; i++) {
//     //         int element = arr[i];
//     //         if (element == target) {
//     //             return i;
//     //         }
//     //     }
//     //     return Integer.MAX_VALUE;
//     // }

// // ------------------------------------------------------------------------------------------------------------

//     static boolean linearSearch(int[] arr, int target) {
//         if (arr.length == 0) {
//             return false;
//         }

//         for (int i = 0; i < arr.length; i++) {
//             int element = arr[i];
//             if (element == target) {
//                 return true;
//             }
//         }
//         return false;
//     }

// }

// ---------------------------------------------------------------------------------------------------------------

public class Linear_Search {
    public static void main(String[] args) {
        // Create an integer array 'nums' with some values
        int[] nums = { 1, 333, 3453, 54343, 644, 8, 967, 56 };

        // Set the target value to 78
        int target = 967;

        // Call the 'linearSearch' method to search for the 'target' in 'nums'
        linearSearch(nums, target);
    }

    static void linearSearch(int[] arr, int target) {
        // Check if the input array 'arr' is empty
        if (arr.length == 0) {
            System.out.println("null array");
        }

        // Iterate through the elements of the array
        for (int i = 0; i < arr.length; i++) {
            int element = arr[i];

            // Check if the current element is equal to the 'target'
            if (element == target) {
                // Print a message indicating that the target element is present at the current
                // index
                System.out.println("Element " + target + " is present at index: " + i);
                return; // Exit the method if the target is found
            } 
        }
        System.out.println("Elment "+target+" is not present in the array");
        
    }
}
