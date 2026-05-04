import java.util.HashMap;

public class hashMapStoreRetrieve {
    public static void main(String args[])
    {
        HashMap<String, String> results = new HashMap<>();

        results.put("Arham", "A+");
        results.put("Harry", "B");
        results.put("Sirius", "A");

        System.out.print("Result of Sirius Black: " + results.get("Sirius"));
    }
}