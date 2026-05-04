import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class fileError {
    public static void main(String args[])
    {
        try
        {
            File file = new File("nonexistent.txt");
            Scanner reader = new Scanner(file);

            while (reader.hasNextLine())
            {
                String line = reader.nextLine();
                System.out.println(line);
            }
            reader.close();
        }
        catch (FileNotFoundException e)
        {
            System.out.println("File not found");
        }
    }
}