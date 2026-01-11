import java.util.Scanner;

public class discountPrice {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        double op, per, dp;

        System.out.print("Please enter original selling price: ");
        op = input.nextDouble();

        while (op <= 0)
        {
            System.out.print("Original selling price can not be negative. Please enter again: ");
            op = input.nextDouble();
        }

        System.out.print("Please enter discount percentage: ");
        per = input.nextDouble();

        while (per < 0 || per >= 100)
        {
            System.out.print("Please enter valid percentage (positive and less than 100): ");
            per = input.nextDouble();
        }

        dp = per / 100 * op;
        dp = op - dp;

        System.out.print(dp);

        input.close();
    }
}