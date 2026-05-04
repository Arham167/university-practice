import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class fileWrite {
    public static void main(String args[]) throws FileNotFoundException
    {
        PrintWriter write = new PrintWriter("file.txt");
        write.println("Hello, ");
        write.println("This is a new file");
        write.println("I am testing PrintWriter");
        write.println("This is line 4");
        write.println("This is line 5");
        write.close();
    }
}