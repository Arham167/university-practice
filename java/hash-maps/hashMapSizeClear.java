import java.util.HashMap;

public class hashMapSizeClear {
    public static void main(String args[])
    {
        HashMap<String, String> results = new HashMap<>();

        results.put("Arham", "A+");
        results.put("Harry", "B");
        results.put("Sirius", "A");

        System.out.println(results.size());

        results.clear();

        System.out.println(results.size());
    }
}