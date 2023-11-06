public class Basics{
    public static void main(String[] args) {
        
        String[] cars = {"volvo", "BMW", "Ford", "alto"};
        for(int i = 0; i<cars.length; i++){
            System.out.println(cars[i]);
            
        }
        System.out.println();

        int[] nums = {67,455,3,3455,3468,765};
        for(int i = 0; i<nums.length; i++){
            System.out.println(nums[i]);
        }

        System.out.println();
        System.out.println(cars[3]);
        System.out.println(cars[0]);
        System.out.println(nums[2]);
        System.out.println(nums[4]);

        System.out.println();


        cars[0] = "sahil";
        System.out.println(cars[0]);
        // INCOMPLETE.....no info about how to access static array and non static array to me......
    }
    static int[] decimal = {78,45,43};
    
}