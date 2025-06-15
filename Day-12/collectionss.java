import java.util.ArrayList;
public class collectionss {
    public static void main(String[] args) {
        ArrayList al = new ArrayList<>();
        al.add(5265);
        al.add("Saathwik"); 
        al.add(88);
        al.add("Saathwik");
        System.out.println(al.size());
        System.out.println(al.isEmpty());
        System.out.println(al.contains("Saathwik"));
        System.out.println(al.indexOf("Saathwik"));
        System.out.println(al.lastIndexOf("Saathwik"));

    }
    
}