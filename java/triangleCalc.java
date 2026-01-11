import java.util.Scanner;
import java.lang.Math;

public class triangleCalc {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        double a, b, c, sp, s, area;

        System.out.print("Enter value of first side of triangle: ");
        a = input.nextDouble();

        while (a <= 0)
        {
            System.out.print("Please enter valid value: ");
            a = input.nextDouble();         
        }

        System.out.print("Enter value of second side of triangle: ");
        b = input.nextDouble();

        while (b <= 0)
        {
            System.out.print("Please enter valid value: ");
            b = input.nextDouble();         
        }

        System.out.print("Enter value of third side of triangle: ");
        c = input.nextDouble();

        while (c <= 0)
        {
            System.out.print("Please enter valid value: ");
            c = input.nextDouble();         
        }

        if (a < b + c && b < a + c && c < a + b)
        {
            sp = (a + b + c) / 2;
            s = sp * (sp - a) * (sp - b) * (sp - c);

            area = Math.sqrt(s);
            System.out.print(area);
        }

        else
        {
            System.out.print("Length of one side must be less than the sum of the lengths of the other two sides.");
        }

        input.close();
    }
}