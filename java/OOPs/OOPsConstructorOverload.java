class Book {
    String title, author;
    int pages;

    public Book(String title, String author, int pages)
    {
        this.title = title;
        this.author = author;
        this.pages = pages;
    }

    public Book(String title, String author)
    {
        this.title = title;
        this.author = author;
        this.pages = 0;
    }

    public Book(String title)
    {
        this.title = title;
        this.author = "Unknown";
        this.pages = 0;
    }

    public void displayInfo()
    {
        System.out.println("Title: " + title + "\n" + "Author: " + author + "\n" + "Pages: " + pages);
    }
}

public class OOPsConstructorOverload {
    public static void main(String args[])
    {
        Book book1 = new Book("Harry Potter", "J.K. Rowling", 1000);
        Book book2 = new Book("LOTR", "Tolkien");
        Book book3 = new Book("Of Arrogant Toerags and Rabid Redheads");

        book1.displayInfo();
        book2.displayInfo();
        book3.displayInfo();
    }
}