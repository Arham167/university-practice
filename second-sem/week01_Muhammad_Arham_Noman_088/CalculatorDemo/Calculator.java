public class Calculator {
    public double add(double... nums)
    {
        if (nums.length == 0)
            return 0;

        double total = 0;
        for (double number : nums)
        {
            total += number;
        }
        return total;
    }

    public double subtract(double... nums)
    {
        if (nums.length == 0)
            return 0;

        double total = nums[0];
        for (int i = 1; i < nums.length; i++)
        {
            total -= nums[i];
        }

        return total;
    }

    public double multiply(double... nums)
    {
        if (nums.length == 0)
            return 0;

        double total = 1;
        for (double number : nums)
        {
            total *= number;
        }
        
        return total;
    }

    public double divide(double... nums)
    {
        if (nums.length == 0)
            return 0;

        double total = nums[0];
        for (int i = 1; i < nums.length; i++)
        {
            if (nums[i] == 0)
                throw new ArithmeticException();

            total /= nums[i];
        }

        return total;
    }

    public double max(double... nums)
    {
        if (nums.length == 0)
            return 0;

        double max = nums[0];

        for (double number : nums)
        {
            if (number > max)
                max = number;
        }

        return max;
    }

    public double min(double... nums)
    {
        if (nums.length == 0)
            return 0;

        double min = nums[0];

        for (double number : nums)
        {
            if (number < min)
                min = number;
        }

        return min;
    }

    public double average(double... nums)
    {
        if (nums.length == 0)
            return 0;

        double avg;
        double total = 0;

        for (double number : nums)
        {
            total += number;
        }

        avg = total / nums.length;

        return avg;
    }
}