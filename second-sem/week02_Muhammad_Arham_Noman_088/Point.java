public class Point {
    private int x;
    private int y;

    public Point()
    {
        this.x = 0;
        this.y = 0;
    }

    public Point(int x, int y)
    {
        this.x = x;
        this.y = y;
    }

    public Point(Point p)
    {
        this.x = p.x;
        this.y = p.y;
    }

    public void display()
    {
        System.out.println("x co-ordinate is: " + this.x);
        System.out.println("y co-ordinate is: " + this.y);
    }

    public String toString()
    {
        String str = "Co-ordinates are: (" + this.x + ", " + this.y + ")";
        return str;
    }

    public Point add(Point p)
    {
        int new_x = this.x + p.x;
        int new_y = this.y + p.y;

        Point final_point = new Point(new_x, new_y);
        return final_point;
    }

    public Point subtract(Point p)
    {
        int del_x = this.x - p.x;
        int del_y = this.y - p.y;

        Point final_point = new Point(del_x, del_y);
        return final_point;
    }

    public double distance(Point p)
    {
        double dx = this.x - p.x;
        double dy = this.y - p.y;
        double distance = Math.sqrt(dx * dx + dy * dy);
        return Math.round(distance * 100.0) / 100.0;
    }
}