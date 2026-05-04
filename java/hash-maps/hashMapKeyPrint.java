import java.util.HashMap;
import java.util.Set;

public class hashMapKeyPrint {
    public static void main(String args[])
    {
        HashMap<String, String> books = new HashMap<>();

        books.put("Harry Potter", "J.K. Rowling");
        books.put("LOTR", "Tolkien");
        books.put("Fantastic Beasts and Where to Find Them", "Newt Scamaner");

        Set<String> keys = books.keySet();

        for (String key : keys)
            System.out.println(key);
    }
}