public class smallestinarray {
    public static void main(String[] args) {
        int[] arr = {12, 5, 8, 19, 3, 7};
        int smallest = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < smallest) {
                smallest = arr[i];
            }
        }
        System.out.println("Smallest number is: " + smallest);
    }
}
