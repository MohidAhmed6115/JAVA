import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<String, Double> map = new HashMap<>();
        map.put("apple", 0.50);
        map.put("orange", 0.75);
        map.put("banana", 0.25);
        map.put("watermelon", 1.00);

        map.remove("apple");

        System.out.println(map);
        System.out.println("Watermelon: $" + map.get("watermelon"));
        System.out.println(map.containsKey("banana") ? "Banana are in stock" : "Bananas are out of stock");
        System.out.println(map.containsValue(1.00) ? "Some fruits are sold for $1" : "No fruits are sold for $1");
        System.out.println("Total Fruits sold here: " + map.size());

        for(String key : map.keySet())
        {
            System.out.println(key + " : $" + map.get(key));
        }
    }
}