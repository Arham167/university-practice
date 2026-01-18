import java.util.Scanner;

public class even {
    public static void main (String[] args)
    {
        Scanner input = new Scanner(System.in);
        int a, b;

        System.out.print("Enter first number: ");
        while (input.hasNextInt() ==  false)
        {
            System.out.print("Please enter a number: ");
            input.next();
        }
        a = input.nextInt();

        System.out.print("Enter second number: ");
        while (input.hasNextInt() ==  false)
        {
            System.out.print("Please enter a number: ");
            input.next();
        }
        b = input.nextInt();

        while (a <= b)
        {
            if (a % 2 == 0)
            {
                System.out.println(a);
                a = a + 2;
            }
            else
            {
                a = a + 1;
            }
        }

        input.close();
    }
}