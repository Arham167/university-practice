public class Car {
    private String brand;
    private String color;
    private int speed;
    private float angle;
    private boolean engineOn;
    private float fuel;
    private int gear;

    public Car()
    {
        this.brand = "Unknown";
        this.color = "Unpainted";
        this.speed = 0;
        this.angle = 0;
        this.engineOn = false;
        this.fuel = 100;
        this.gear = 0;
    }

    public void setDetails(String brand, String color)
    {
        this.brand = brand;
        this.color = color;
    }

    public void startEngine()
    {
        if (this.fuel == 0)
        {
            System.out.println("Refuel your car");
        }

        else
        {
            this.engineOn = true;
            System.out.println(this.brand + " engine started");
        }
    }

    public void accelerate(int new_speed)
    {
        if (this.engineOn == false)
        {
            System.out.println("Please turn on the engine first");
        }

        if (new_speed < this.speed || new_speed < 0)
        {
            System.out.println("Can't accelerate with a speed lesser than the current speed");
        }

        else
        {            
            this.speed = this.speed + new_speed;
            this.fuel = this.fuel - 10;
            System.out.println(this.brand + " accelerated to " + this.speed);
        }
    }

    public void reverse()
    {
        if (this.engineOn == false)
        {
            System.out.println("Please turn on the engine first");
        }

        else
        {
            this.angle = -180;
            this.fuel = this.fuel - 10;
            System.out.println(this.brand + " reversing...");
        }
    }

    public void gearUpshift(int new_gear)
    {
        if (this.engineOn == false)
        {
            System.out.println("Please turn on the engine first");
        }

        if (new_gear < gear || new_gear < 0 || new_gear > 6)
        {
            System.out.println("Invalid upshift. Current gear is " + this.gear);
        }

        else
        {
            this.gear = new_gear;
            this.speed = this.speed + 10;
            System.out.println(this.brand + " gear upshifted to " + this.gear);
        }
    }

    public void gearDownshift(int new_gear)
    {
        if (this.engineOn == false)
        {
            System.out.println("Please turn on the engine first");
        }

        if (new_gear > gear || new_gear < 0)
        {
            System.out.println("Invalid downshift. Current gear is " + this.gear);
        }

        else
        {
            this.gear = new_gear;
            this.speed = this.speed + 10;
            System.out.println(this.brand + " gear downshifted to " + this.gear);
        }
    }

    public void drive()
    {
        if (this.engineOn == false)
        {
            System.out.println("Please turn on the engine first");
        }

        if (this.speed == 0)
        {
            System.out.println("Please accelerate the car first");
        }

        else
        {
            this.fuel = this.fuel - 10;
            System.out.println("Vroom vroom! " + this.brand + " is moving with a speed of " + this.speed + " and an angle of " + this.angle);
        }
    }

    public void stopEngine()
    {        
        if (this.engineOn == false)
        {
            System.out.println("Please turn on the engine first");
        }

        this.speed = 0;
        this.engineOn = false;
        System.out.println(this.brand + " engine stopped");
    }

    public void turboMode()
    {
        if (this.engineOn == false)
        {
            System.out.println("Please turn on the engine first");
        }

        else
        {
            this.speed = 200;
            this.fuel = this.fuel - 50;
            System.out.println(this.brand + "Turbo Mode Activated!!!");
        }
    }

    public void display()
    {
        System.out.println("The brand of car is: " + this.brand);
        System.out.println("The color of car is: " + this.color);
        System.out.println("The speed of car is: " + this.speed);
        System.out.println("The angle of car is: " + this.angle);
        System.out.println("The engine is: " + this.engineOn);
        System.out.println("The fuel of car is: " + this.fuel);
        System.out.println("The gear of car is: " + this.gear);
        System.out.println("=================================");
    }
}