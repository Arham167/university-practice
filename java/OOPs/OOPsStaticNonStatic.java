class Counter {
    static int count = 0;

    public Counter()
    {
        count++;
    }

    public static void getCount()
    {
        System.out.println("Count: " + count);
    }

    public void displayMessage()
    {
        System.out.println("I'm counter instance");
    }
}

public class OOPsStaticNonStatic {
    public static void main(String[] args) 
    {
        Counter counter1 = new Counter();
        Counter counter2 = new Counter();
        Counter counter3 = new Counter();
        
        Counter.getCount();
        counter1.displayMessage();
        counter2.displayMessage();
        counter3.displayMessage();
    }
}