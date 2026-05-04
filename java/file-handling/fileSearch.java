import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class fileSearch {
    public static void main(String args[])
    {
        String search = "testing";
        int lineNumber = 0;
        boolean found = false;

        try
        {
            File file = new File("file.txt");
            Scanner reader = new Scanner(file);

            while (reader.hasNextLine())
            {
                lineNumber++;
                String line = reader.nextLine();
                if (line.contains(search))
                {
                    System.out.print("Found at " + lineNumber);
                    found = true;
                    break;
                }
            }
            reader.close();
            if (!found)
                System.out.println("not found in file");
        }
        catch (FileNotFoundException e)
        {
            System.out.print("not found");
        }
    }
}