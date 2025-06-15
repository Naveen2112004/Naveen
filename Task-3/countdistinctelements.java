import java.util.*;
public class countdistinctelements {
    public static int countDistinct(int[] nums) {
        HashSet<Integer> distinctSet = new HashSet<>();
        for (int num : nums) {
            distinctSet.add(num);
        }
        return distinctSet.size();
    }
    public static void main(String[] args) {
        int[] input = {1, 2, 2, 3, 4, 1};
        int distinctCount = countDistinct(input);
        System.out.println("Number of distinct elements: " + distinctCount);
    }
}
