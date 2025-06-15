import java.util.PriorityQueue;
public class queueinter {
    public static void main(String[] args) {
        PriorityQueue<Integer> queue = new PriorityQueue<Integer>();
        System.out.println("The removed element is: " + queue.remove());
        System.out.println("The head is: " + queue.element());
    }
}