import java.util.Scanner;

public class originalPrice {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        double op, per, dp;

        System.out.print("Please enter discounted selling price: ");
        dp = input.nextDouble();

        while (dp <= 0)
        {
            System.out.print("Discounted selling price can not be negative. Please enter again: ");
            dp = input.nextDouble();
        }

        System.out.print("Please enter discount percentage: ");
        per = input.nextDouble();

        while (per < 0 || per >= 100)
        {
            System.out.print("Please enter valid percentage (positive and less than 100): ");
            per = input.nextDouble();
        }

        op = dp / (1 - per/100); 

        System.out.print(op);

        input.close();
    }
}