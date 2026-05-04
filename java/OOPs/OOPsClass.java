class Car {
    String brand;
    String color;
    int speed;

    public int accelerate()
    {
        speed = speed + 10;
        return speed;
    }

    public void display_info()
    {
        System.out.println("Brand is " + brand);
        System.out.println("Color is " + color);
        System.out.println("Speed is " + speed);
    }
}

public class OOPsClass {
    public static void main(String args[])
    {
        Car myCar = new Car();
        myCar.brand = "Ford";
        myCar.color = "Blue";
        myCar.speed = 100;

        myCar.display_info();
        myCar.accelerate();
        myCar.display_info();
    }
}