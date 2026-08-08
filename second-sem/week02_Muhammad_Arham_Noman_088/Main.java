public class Main {
    public static void main(String args[])
    {
        Point p1 = new Point();
        Point p2 = new Point(5, 6);
        Point p3 = new Point(p2);

        p1.display();
        p2.display();
        p3.display();

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);

        Point add_point = new Point();
        add_point = p2.add(p3);
        System.out.println(add_point);

        Point sub_point = new Point();
        sub_point = p2.subtract(p3);
        System.out.println(sub_point);

        System.out.println(p2.distance(p1));

        Point p4 = new Point(5, 7);
        Point p5 = new Point(8, 10);
        Point p6 = new Point(16, 12);

        Triangle t1 = new Triangle();
        Triangle t2 = new Triangle(p4, p5, p6);

        t1.display();
        t2.display();

        System.out.println(t1);
        System.out.println(t2);

        Rational r1 = new Rational(10, 15);
        r1.display();
        System.out.println(r1);
    }
}