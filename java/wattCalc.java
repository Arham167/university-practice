import java.util.Scanner;

public class wattCalc {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        double w, a, v;

        System.out.print("Enter the ampere reading: ");
        a = input.nextDouble();

        while (a <= 0)
        {
            System.out.print("Please enter valid ampere reading: ");
            a = input.nextDouble();
        }

        System.out.print("Enter the voltage reading: ");
        v = input.nextDouble();

        while (v <= 0)
        {
            System.out.print("Please enter valid voltage reading: ");
            v = input.nextDouble();
        }

        w = a * v;
        System.out.print("The power consumption is: ");
        System.out.print(w);
        System.out.print(" Watts");

        input.close();
    }
}