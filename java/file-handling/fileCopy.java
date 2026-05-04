import java.util.Scanner;
import java.io.File;
import java.io.PrintWriter;
import java.io.FileNotFoundException;

public class fileCopy {
    public static void main(String args[]) throws FileNotFoundException
    {
        try
        {
            File file = new File("file.txt");
            Scanner reader = new Scanner(file);
            PrintWriter writer = new PrintWriter("newfile.txt");

            while (reader.hasNextLine())
            {
                String line = reader.nextLine();
                writer.println(line);
            }
            reader.close();
            writer.close();
        }
        catch (FileNotFoundException e)
        {
            System.out.println("not found");
        }
    }
}