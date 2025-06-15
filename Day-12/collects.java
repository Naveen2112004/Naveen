import java.util.ArrayList;
public class collects {
    public static void main(String[] var0) {
        ArrayList al = new ArrayList<>();
        ArrayList newlist = new ArrayList<>();
        al.add(5265);
        al.add("Saathwik");
        al.add(88);
        al.add("Saathwik");
        newlist.addAll(al);
        al.add("Students");
        System.out.println(newlist);
        al.removeAll(newlist);
        System.out.println(al);
    }

    
}
