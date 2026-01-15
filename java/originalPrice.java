import java.util.Scanner;

public class originalPrice {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        double op, per, dp;

        System.out.print("Please enter discounted selling price: ");
        while (input.hasNextDouble() == false)
        {
            System.out.print("Please enter a number: ");
            input.next();
        }
        dp = input.nextDouble();

        while (dp <= 0)
        {
            System.out.print("Discounted selling price can not be negative or zero. Please enter again: ");
            while (input.hasNextDouble() == false)
            {
                System.out.print("Please enter a number: ");
                input.next();
            }
            dp = input.nextDouble();
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

        op = dp / (1 - per/100); 

        System.out.print("The original selling price is: Rs. " + op);

        input.close();
    }
}