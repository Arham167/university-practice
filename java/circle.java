import java.util.Scanner;
import java.lang.Math;

public class circle {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        double pi = Math.PI;
        double r, c, a;

        System.out.print("Please enter radius of the circle: ");
        while (input.hasNextDouble() == false)
        {
            System.out.print("Please enter a number: ");
            input.next();
        }
        r = input.nextDouble();

        while (r <= 0)
        {
            System.out.print("Please enter positive radius: ");
            while (input.hasNextDouble() == false)
            {
                System.out.print("Please enter a number: ");
                input.next();
            }
            r = input.nextDouble();
        }

        c = 2 * pi * r;
        a = pi * Math.pow(r, 2);

        System.out.println("The circumference of the circle is: " + c);
        System.out.println("The area of the circle is: " + a);

        input.close();
    }
}