import java.util.Scanner;

public class discountPrice {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        double op, per, dp;

        System.out.print("Please enter original selling price in Rs.: ");
        while (input.hasNextDouble() == false)
        {
            System.out.print("Please enter a number: ");
            input.next();
        }
        op = input.nextDouble();

        while (op <= 0)
        {
            System.out.print("Original selling price can not be negative or zero. Please enter again: ");
            while (input.hasNextDouble() == false)
            {
                System.out.print("Please enter a number: ");
                input.next();
            }
            op = input.nextDouble();
        }

        System.out.print("Please enter discount percentage: ");
        while (input.hasNextDouble() == false)
        {
            System.out.print("Please enter a number: ");
            input.next();
        }
        per = input.nextDouble();

        while (per < 0 || per >= 100)
        {
            System.out.print("Please enter valid percentage (positive and less than 100): ");
            while (input.hasNextDouble() == false)
            {
                System.out.print("Please enter a number: ");
                input.next();
            }
            per = input.nextDouble();
        }

        dp = per / 100 * op;
        dp = op - dp;

        System.out.print("The discounted selling price is: Rs. " + dp);

        input.close();
    }
}