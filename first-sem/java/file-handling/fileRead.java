import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class fileRead {
    public static void main(String args[])
    {
        try
        {
            File file = new File("file.txt");
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
            System.out.print("not found");
        }
    }
}