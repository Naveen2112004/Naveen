import java.util.ArrayList;
public class dynamicarray {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> arr = new ArrayList<>();
        
        arr.add(new ArrayList<Integer>() {{ add(1); add(2); add(3); }});
        arr.add(new ArrayList<Integer>() {{ add(4); add(5); add(6); }});
        arr.add(new ArrayList<Integer>() {{ add(7); add(100); add(9); }});

        for (int i = 0; i < arr.size(); i++) {
            for (int j = 0; j < arr.get(i).size(); j++) {
                System.out.println(arr.get(i).get(j));
            }
        }       
    }
}
