import java.util.HashMap;
import java.util.Set;

public class hashMapRemove {
    public static void main(String args[])
    {
        HashMap<String, Integer> products = new HashMap<>();

        products.put("Mobile", 50000);
        products.put("Laptop", 80000);
        products.put("Charger", 1000);
        products.put("Bag", 5000);

        Set<HashMap.Entry<String, Integer>> entries = products.entrySet();

        for (HashMap.Entry<String, Integer> entry : entries)
            System.out.println(entry.getKey() + " - " + entry.getValue());

        products.remove("Charger");

        Set<HashMap.Entry<String, Integer>> updated_entries = products.entrySet();

        for (HashMap.Entry<String, Integer> entry : updated_entries)
            System.out.println(entry.getKey() + " - " + entry.getValue());
    }
}