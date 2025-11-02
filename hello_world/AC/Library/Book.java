package AC.Library;

public class Book {
    //book identification
    private String title;
    private String genre;
    private String author;
    private int numberOfPages;
    private String type;
    private boolean available;
    private static int numberCheckedOut = 0;


    public Book(String title, String genre, String author, int numberOfPages, String type)
    {
        this.title = title;
        this.genre = genre;
        this.author = author;
        this.numberOfPages = numberOfPages;
        this.type = type;
        available = true;
    }

    //attempt to check out a book, if the book is unavailable, return false, if it is available, return true
    public boolean checkOut()
    {
        if (available)
        {
            available = false;
            numberCheckedOut++;
            return true;
        }
        else
        {
            System.out.println("book has already been checked out");
            return false;
        }
    }

    //attempt to check in a book, if the book was never checked out, return false, if it was checked out, return true
    public boolean checkIn()
    {
        if (!available)
        {
            available = true;
            numberCheckedOut--;
            return true;
        }
        else
        {
            System.out.println("you never checked this out so you can't check it in");
            return false;
        }
    }

    //returns true of book is available
    public boolean isAvailable()
    {
        return available;
    }

    //returns the title of the book
    public String getTitle()
    {
        return title;
    }

    //returns the genre of the book
    public String getGenre()
    {
        return genre;
    }

    //returns the author of the book
    public String getAuthor()
    {
        return author;
    }

    //returns how many pages there are in the book
    public int getPageNumber()
    {
        return numberOfPages;
    }

    //returns what type of book
    public String getBookType()
    {
        return type;
    }

    //returns the number of books checked out
    public static int getNumberCheckedOut()
    {
        return numberCheckedOut;
    }
    public String toString() {
        
       return "Title: " + title + ", Genre: " + genre + ", Author: " + author + ", Pages: " + numberOfPages + ", Type: " + type + ", Available: " + available;
    }


}
