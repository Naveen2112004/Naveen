import java.util.*;
public class queuearray {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        Integer[] array = queue.toArray(new Integer[queue.size()]);
        System.out.println(Arrays.toString(array));
    }
}