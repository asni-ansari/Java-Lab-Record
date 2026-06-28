import java.util.Scanner;

class Book
{
    private int bookId;
    private String title;
    private String author;

    void setBook()
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Book ID : ");
        bookId = sc.nextInt();

        System.out.print("Enter Title : ");
        title = sc.next();

        System.out.print("Enter Author : ");
        author = sc.next();
    }

    void display()
    {
        System.out.println("Book ID : " + bookId);
        System.out.println("Title : " + title);
        System.out.println("Author : " + author);
    }
}

class BookUtility
{
    static void displayBook(Book b)
    {
        b.display();
    }
}

public class BookApp
{
    public static void main(String args[])
    {
        Book book1 = new Book();
        Book book2 = new Book();

        System.out.println("Enter First Book Details");
        book1.setBook();

        System.out.println();

        System.out.println("Enter Second Book Details");
        book2.setBook();

        System.out.println("\nBook Details");

        BookUtility.displayBook(book1);

        System.out.println();

        BookUtility.displayBook(book2);
    }
}
