class Person {
    String name;
    int age;

    public Person(String name, int age)
    {
        this.name = name;
        this.age = age;
    }

    public void greet()
    {
        System.out.println("Hi, I am " + name + " and I'm " + age + " years old");
    }
}

public class OOPsConstructor {
    public static void main(String args[])
    {
        Person Arham = new Person("Arham", 18);
        Person Harry = new Person("Harry", 20);

        Arham.greet();
        Harry.greet();
    }
}