import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class fileLineCount {
    public static void main(String args[])
    {
        try
        {
            File file = new File("file.txt");
            Scanner reader = new Scanner(file);
            int count = 0;

            while (reader.hasNextLine())
            {
                reader.nextLine();
                count++;
            }
            reader.close();
            System.out.print(count);
        }
        catch (FileNotFoundException e)
        {
            System.out.print("not found");
        }
    }
}
