import java.util.ArrayList;
import java.util.Collections;
public class collectionshuffle {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>();
        ArrayList<Integer> numbers = new ArrayList<>();        
        numbers.add(5265);
        strings.add("Saathwik");
        strings.add("Ananth");
        strings.add("Gopi");        
        Collections.shuffle(strings);
        Collections.shuffle(numbers);
        System.out.println("Shuffled Strings: " + strings);
        System.out.println("Shuffled Numbers: " + numbers);        
        Collections.sort(strings);
        Collections.sort(numbers);
        System.out.println("Sorted Strings: " + strings);
        System.out.println("Sorted Numbers: " + numbers);
    }
}