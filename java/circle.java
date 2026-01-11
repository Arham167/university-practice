import java.util.Scanner;
import java.lang.Math;

public class circle {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        double pi = Math.PI;
        double r, c, a;

        System.out.print("Please enter radius of the circle: ");
        r = input.nextDouble();

        while (r <= 0)
        {
            System.out.print("Please enter positive radius: ");
            r = input.nextDouble();
        }

        c = 2 * pi * r;
        a = pi * Math.pow(r, 2);

        System.out.print("The circumference of the circle is: ");
        System.out.println(c);
        System.out.print("The area of the circle is: ");
        System.out.println(a);

        input.close();
    }
}