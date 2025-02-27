public class ProductsOfArrayExceptSelf {
    public static void main(String args[]) {
        int[] nums = {-1,0,1,2,3};
        int[] result = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int value = 1;
            for (int j = 0; j < nums.length; j++) {
                if (i != j)
                     value *= nums[j];
            }
            result[i] = value;
        }

        for (int i = 0; i < nums.length; i++) {
            System.out.println(result[i]);
        }
    }
}
