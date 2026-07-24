import java.util.HashMap;
import java.util.Scanner;

public class hashMapKeyCheck {
    public static void main(String args[])
    {
        HashMap<String, String> countries = new HashMap<>();
        Scanner input = new Scanner(System.in);

        countries.put("Pakistan", "Islamabad");
        countries.put("United Kingdom", "London");
        countries.put("United States of America", "Tel Aviv");
        countries.put("Russia", "Moscow");

        System.out.print("Enter country to check capital: ");
        String checkCountry = input.nextLine();
        
        if (countries.containsKey(checkCountry))
            System.out.println("Capital of " + checkCountry + " is " + countries.get(checkCountry));

        else
            System.out.println("Sorry, we do not have that");

        input.close();
    }
}