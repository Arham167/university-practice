public class Rational {
    private int num;
    private int denom;

    public Rational()
    {
        num = 1;
        denom = 1;
    }

    public Rational(int n, int d)
    {
        num = n;
        denom = d;
        reduce();
    }

    public void reduce()
    {
        int gcd = 0;
        int smaller;

        if (num < denom)
            smaller = num;
        else
            smaller = denom;

        for (int divisor = smaller; divisor >= 2; divisor--)
        {
            if (num % divisor == 0 && denom % divisor == 0)
            {
                gcd = divisor;
                break;
            }
        }

        if (gcd != 0)
        {
            num = num / gcd;
            denom = denom / gcd;
        }
    }

    public void display()
    {
        System.out.println("Numerator is: " + this.num);
        System.out.println("Denominator is: " + this.denom);
    }

    public String toString()
    {
        return num + "/" + denom;
    }
}