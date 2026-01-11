import java.util.Scanner;

public class evenOdd {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int n;

        System.out.print("Please enter a number: ");
        n = input.nextInt();

        if (n % 2 == 0)
        {
            System.out.print("The number ");
            System.out.print(n);
            System.out.print(" is an even number");
        } 
        
        else
        {
            System.out.print("The number ");
            System.out.print(n);
            System.out.print(" is an odd number");
        }

        input.close();
    }
}