import java.util.Scanner;

public class percent {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        double obt, max, per;

        System.out.print("Please enter total marks: ");
        while (input.hasNextDouble() == false)
        {
            System.out.print("Please enter a number: ");
            input.next();
        }
        max = input.nextDouble();

        while (max <= 0)
        {
            System.out.print("Please enter positive total marks: ");
            while (input.hasNextDouble() == false)
            {
                System.out.print("Please enter a number: ");
                input.next();
            }
            max = input.nextDouble();
        }

        System.out.print("Please enter your obtained marks: ");
        while (input.hasNextDouble() == false)
        {
            System.out.print("Please enter a number: ");
            input.next();
        }
        obt = input.nextDouble();

        while (obt < 0 || obt > max)
        {
            System.out.print("Please enter valid obtained marks (positive and less than total marks): ");
            while (input.hasNextDouble() == false)
            {
                System.out.print("Please enter a number: ");
                input.next();
            }
            obt = input.nextDouble();
        }

        per = obt / max * 100;
        System.out.print("Your percentage is: " + per + " %");

        input.close();
    }
}