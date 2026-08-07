public class Main {
    public static void main(String args[])
    {
        Car bmw = new Car();
        Car tesla = new Car();

        bmw.setDetails("bmw", "blue");
        tesla.setDetails("tesla", "red");

        bmw.display();
        tesla.display();

        bmw.startEngine();
        bmw.display();

        bmw.accelerate(10);
        bmw.accelerate(50);
        bmw.display();

        bmw.drive();

        bmw.gearUpshift(7);
        bmw.gearUpshift(5);
        bmw.gearUpshift(1);
        bmw.display();

        bmw.gearDownshift(6);
        bmw.gearDownshift(-1);
        bmw.gearDownshift(4);
        bmw.display();

        bmw.reverse();
        bmw.display();

        bmw.turboMode();
        bmw.display();

        bmw.stopEngine();
        bmw.display();

        tesla.display();
    }
}