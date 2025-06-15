public class equilibriumindex {
    public static int findEquilibriumIndex(int[] nums) {
        int total = 0, leftSum = 0;
        for (int num : nums) total += num;
        for (int i = 0; i < nums.length; i++) {
            total -= nums[i]; 
            if (leftSum == total) return i;
            leftSum += nums[i];
        }
        return -1;  
    }
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 2, 2};
        System.out.println(findEquilibriumIndex(arr)); 
    }
}
