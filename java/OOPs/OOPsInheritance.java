class Animal {
    String name;

    public void eat()
    {
        System.out.println("nom nom nom");
    }
}

class Dog extends Animal {
    String breed;

    public void bark()
    {
        System.out.println("Woof");
    }
}

public class OOPsInheritance {
    public static void main(String args[])
    {
        Dog doggo = new Dog();
        doggo.name = "Buddy";
        doggo.breed = "Golden Retriever";

        doggo.eat();
        doggo.bark();
    }
}