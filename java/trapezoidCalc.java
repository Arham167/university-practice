import java.util.Scanner;

public class trapezoidCalc {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        double a, b, h, k;

        System.out.print("Enter length of first pair of parallel lines: ");
        a = input.nextDouble();

        while (a <= 0)
        {
            System.out.print("Please enter a valid value (non-zero and positive): ");
            a = input.nextDouble();
        }

        System.out.print("Enter length of second pair of parallel lines: ");
        b = input.nextDouble();

        while (b <= 0)
        {
            System.out.print("Please enter a valid value (non-zero and positive): ");
            b = input.nextDouble();
        }

        System.out.print("Enter height between parallel lines: ");
        h = input.nextDouble();

        while (h <= 0)
        {
            System.out.print("Please enter a valid value (non-zero and positive): ");
            h = input.nextDouble();
        }

        k = h * (a + b) * 1/2;

        System.out.print("The area of trapezium is: ");
        System.out.print(k);
        System.out.print(" units");

        input.close();
    }
}