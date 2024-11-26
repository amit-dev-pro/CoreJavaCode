 import java.util.ArrayList;
import java.util.*;

// Book class represents a book with title and author
class Book
{
    private String title;
    private String author;
    public Book(String title,String author)
    {
        this.title=title;
        this.author=author;

    }
    public String getTitle()
    {
        return title;
    }
    public String getAuthor()
    {
        return author;
    }
    public String toString()
    {
        return "Books "+title+" by "+author;
    }

}

// library member class represent a member of the library
class libraryMember
{
    private String memberName;

    public libraryMember(String memberName)
    {
        this.memberName=memberName;
    }
    public String getMemberName()
    {
        return memberName;
    }
    public String toString()
    {
        return "library member "+memberName;
    }

} 

// Library class manages books and members
class Library
{
    private List<Book> books;
    private List<libraryMember> members;

    public Library()
    {
        this.books=new ArrayList<>();
        this.members=new ArrayList<>();
    }

    public void addBook(Book book)
    {
        books.add(book);
        System.out.println("Book added to the library "+book.getTitle());
    }
    
    public void addMembers(libraryMember member)
    {
        members.add(member);
        System.out.println("Library member added "+member.getMemberName());
    }

    public void displayBooks()
    {
        System.out.println("Library Books ");
        for(Book book: books)
        {
            System.out.println(book);
        }
    }
    public void displayMemebers()
    {
        System.out.println("Library Memebers ");
        for(libraryMember member:members)
        {
            System.out.println(member);
        }
    }

}


public class library {
    public static void main(String args[]){
        Library lib=new Library();

        Book b1=new Book("The catcher in the Aye", "J.D Salinger");
        Book b2=new Book("To the Mockingbird","Harper");

        libraryMember lb1=new libraryMember("John Doe");
        libraryMember lb2=new libraryMember("Jane Smith");

        lib.addBook(b1);
        lib.addBook(b2);
        lib.addMembers(lb1);
        lib.addMembers(lb2);

        lib.displayBooks();
        lib.displayMemebers();

        System.out.println("RADHE RADHE");
    }
    
}
