import java.util.Scanner;

public class wattCalc {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        double w, a, v;

        System.out.print("Enter the ampere reading: ");
        while (input.hasNextDouble() == false)
        {
            System.out.print("Please enter a number: ");
            input.next();
        }
        a = input.nextDouble();

        while (a <= 0)
        {
            System.out.print("Please enter valid ampere reading: ");
            while (input.hasNextDouble() == false)
            {
                System.out.print("Please enter a number: ");
                input.next();
            }
            a = input.nextDouble();
        }

        System.out.print("Enter the voltage reading: ");
        while (input.hasNextDouble() == false)
        {
            System.out.print("Please enter a number: ");
            input.next();
        }
        v = input.nextDouble();

        while (v <= 0)
        {
            System.out.print("Please enter valid voltage reading: ");
            while (input.hasNextDouble() == false)
            {
                System.out.print("Please enter a number: ");
                input.next();
            }
            v = input.nextDouble();
        }

        w = a * v;
        System.out.print("The power consumption is: " + w + " Watts");

        input.close();
    }
}