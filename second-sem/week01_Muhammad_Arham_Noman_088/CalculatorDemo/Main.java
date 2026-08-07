import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        ArrayList<Double> numbers = new ArrayList<>();
        Calculator calc = new Calculator();

        System.out.print("Enter first number: ");

        while (input.hasNextDouble() == true)
        {
            numbers.add(input.nextDouble());
            System.out.print("Enter next number (enter x to stop adding numbers): ");
        }

        input.close();

        double nums[] = new double[numbers.size()];

        for (int i = 0; i < numbers.size(); i++)
        {
            nums[i] = numbers.get(i);
        }

        double addition_result = calc.add(nums);
        System.out.println("The addition of given numbers is " + addition_result);

        double subtraction_result = calc.subtract(nums);
        System.out.println("The subtraction of given numbers is " + subtraction_result);

        double multiplication_result = calc.multiply(nums);
        System.out.println("The multiplication of given numbers is " + multiplication_result);

        try
        {        
            double division_result = calc.divide(nums);
            System.out.println("The division of given numbers is " + division_result);
        }

        catch (ArithmeticException e)
        {
            System.out.println("Cannot divide by zero!");
        }

        double maximum = calc.max(nums);
        System.out.println("The maximum of given numbers is " + maximum);

        double minimum = calc.min(nums);
        System.out.println("The minimum of given numbers is " + minimum);

        double avg = calc.average(nums);
        System.out.println("The average of given numbers is " + avg);

    }
}