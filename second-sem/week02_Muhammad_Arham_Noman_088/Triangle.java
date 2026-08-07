public class Triangle{
    private double sideA;
    private double sideB;
    private double sideC;

    public Triangle()
    {
        this.sideA = 1;
        this.sideB = 1;
        this.sideC = 1;
    }

    public Triangle(Point p1, Point p2, Point p3)
    {
        sideA = p1.distance(p2);
        sideB = p2.distance(p3);
        sideC = p3.distance(p1);
    }

    public void display()
    {
        System.out.println("Side A is: " + this.sideA);
        System.out.println("Side B is: " + this.sideB);
        System.out.println("Side C is: " + this.sideC);
    }

    public String toString()
    {
        String str = "Sides are: " + this.sideA + ", " + this.sideB + ", " + this.sideC;
        return str;
    }

}