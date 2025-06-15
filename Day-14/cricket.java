import java.util.*;
public class cricket {
    public static void main(String[] args) {
        Map <Integer, String> player = new HashMap <Integer, String>();
        Map <Integer, String> jersey = new HashMap <Integer, String>();
        player.put(18, "Virat Kohli");
        player.put(7, "MS Dhoni");
        player.put(45, "Rohit Sharma");
        player.put(33, "Hardik Pandya");
        player.put(1, "KL Rahul");
        jersey.putAll(player);
        jersey.putIfAbsent(10, "Sachin");
        player.remove(45);
        player.remove(45, "Rohit Sharma");
        System.out.println(player);
        System.out.println("Players and Jersey: " + player);
        System.out.println("Players and Jersey: " + jersey);
        System.out.println(player.containsKey(18));
        System.out.println(player.containsValue("Rinku Singh"));
        System.out.println(player.keySet());
        System.out.println(player.values());
    }
}
