import java.util.*;
public class queue_add {
    public static void main(String[] args) {
        Set obj = new LinkedHashSet<>();
        obj.add("Anantha Sai : 9922005148");
        obj.add("Sudharshan : 9922005301");
        obj.add("Sai Kumar : 9922005064");
        obj.add("Iliyas : 9922005343");
        System.out.println("Original Set: " + obj);        
        Set retainSet = new LinkedHashSet<>();
        retainSet.add("Anantha Sai : 9922005148");
        retainSet.add("Sudharshan : 9922005301");
        retainSet.add("Sai Kumar : 9922005064");        
        obj.retainAll(retainSet);
        System.out.println("After retaining: " + obj);
    }
}