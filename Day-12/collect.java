import java.util.ArrayList;
public class collect {
    public static void main(String[] args) {
        ArrayList<Object> al = new ArrayList<>();
        al.add(5265);
        al.add("Saathwik"); 
        al.add(88);
        al.add("Saathwik");
        al.forEach(System.out::println);
    }
}