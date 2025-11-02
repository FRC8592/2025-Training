package AC.Library;

public class Library {
    private static final int LIBRARY_CAPACITY = 10;
    Book[] libraryCatalog = new Book[LIBRARY_CAPACITY];

    private String name;
    private String location;
    //next open index in the library catalog array
    private int numberOfBooks = 0;

    public Library(String name, String location)
    {
        this.name = name;
        this.location = location;
    }

    //adds a book to the library array
    public void addBookToLibrary(Book bookToAdd)
    {
        if (numberOfBooks >= LIBRARY_CAPACITY)
        {
            System.out.println("library has reached maximum capacity, you can't add another book :(");
            return;
        }
        else
        {
            libraryCatalog[numberOfBooks] = bookToAdd;
            numberOfBooks++;
        }
    }


    //returns the name of the library
    public String getName()
    {
        return name;
    }

    //returns the location of the library
    public String getLocation()
    {
        return location;
    }

    //returns number of books
    public int getNumberOfBooks()
    {
        return numberOfBooks;
    }

    //returns number of books available
    public int getNumberOfAvailableBooks()
    {
        return numberOfBooks - Book.getNumberCheckedOut();
    }

    //searches for a book
    public Book searchForBookTitle(String searchTitle)
    {
        for (int i = 0; i <= numberOfBooks; i++)
        {
            if ((libraryCatalog[i].getTitle()).equals(searchTitle))
            {
                return libraryCatalog[i];
            }
        }
        
        System.out.println("this book doesn't exist :(");
        return null;
    }
    
}
