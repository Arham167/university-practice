import java.util.Scanner;

public class backwardsLoop {
    public static void main (String[] args)
    {
        Scanner input = new Scanner(System.in);
        int a;

        System.out.print("Please enter the start number: ");
        while (input.hasNextInt() == false)
        {
            System.out.print("Please enter a number: ");
            input.next();
        }
        a = input.nextInt();

        while (a < 0)
        {
            System.out.print("Please enter a positive number: ");
            while (input.hasNextInt() == false)
            {
                System.out.print("Please enter a number: ");
                input.next();
            }
            a = input.nextInt();
        }

        while (a >= 0)
        {
            System.out.println(a);
            a = a - 1;
        }

        input.close();
    }
}