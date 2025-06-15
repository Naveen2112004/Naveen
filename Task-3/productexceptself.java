public class productexceptself {
    public static int[] productexceptself(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        int leftProduct = 1;
        for (int i = 0; i < n; i++) {
            result[i] = leftProduct;
            leftProduct *= nums[i];
        }
        int rightProduct = 1;
        for (int i = n - 1; i >= 0; i--) {
            result[i] *= rightProduct;
            rightProduct *= nums[i];
        }        
        return result;
    }
    public static void main(String[] args) {
        int[] input = {1, 2, 3, 4};
        int[] output = productexceptself(input);
        for (int num : output) {
            System.out.print(num + " ");
        }
    }    
}
