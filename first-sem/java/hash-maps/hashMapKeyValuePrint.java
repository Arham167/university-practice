import java.util.HashMap;
import java.util.Set;

public class hashMapKeyValuePrint {
    public static void main(String args[])
    {
        HashMap<String, Integer> movies = new HashMap<>();

        movies.put("Harry Potter", 2002);
        movies.put("Endgame", 2019);
        movies.put("Interstellar", 2014);

        Set<HashMap.Entry<String, Integer>> entries = movies.entrySet();

        for (HashMap.Entry<String, Integer> entry : entries)
            System.out.println(entry.getKey() + " - " + entry.getValue());
    }
}