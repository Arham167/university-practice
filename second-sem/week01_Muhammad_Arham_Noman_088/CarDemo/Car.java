public class Car {
    private String brand;
    private String color;
    private int speed;
    private boolean engineOn;
    private float fuel;
    private int gear;

    public Car()
    {
        this.brand = "Unknown";
        this.color = "Unpainted";
        this.speed = 0;
        this.engineOn = false;
        this.fuel = 100;
        this.gear = 0;
    }

    public setDetails(String brand, String color)
    {
        this.brand = brand;
        this.color = color;
    }

    public display()
    {
        System.out.println("The brand of car is: " + this.brand);
        System.out.println("The color of car is: " + this.color);
        System.out.println("The speed of car is: " + this.speed);
        System.out.println("The engine is: " + this.engineOn);
        System.out.println("The fuel of car is: " + this.fuel);
        System.out.println("The gear of car is: " + this.gear);

    }
}