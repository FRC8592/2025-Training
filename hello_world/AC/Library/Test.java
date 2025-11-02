package AC.Library;

public class Test {
  
    public static void main (String[] args) {
        Library ourLibrary = new Library("City Library", "123 Main St");
        Book iRobotBook = new Book("I, Robot", "Science", "Isaac Asimov", 304, "Ebook");
        Book perryBook = new Book("Perry", "Science", "Ayesha Khan", 67, "Hardcover");
        Book softwareBook = new Book("Software", "Science", "Bob Ross", 4879524, "Paperback");
        Book drillBook = new Book("Drill", "Engineering", "Windows Computer", 232, "Ebook");
        Book cardboardBoxBook = new Book("Cardboard Boxes", "Drills", "VS Code", 99, "Hardcover");

        //tests searching an empty library for a book
        Book resultingBook = ourLibrary.searchForBookTitle("I,Robot");
        if (resultingBook != null)
        {
            System.out.println(resultingBook.toString());
        }
        else
        {
            System.out.println("this book doesn't exist in our library, so we can't give information about it");
        }

        
        //adds the books to the library!
        ourLibrary.addBookToLibrary(iRobotBook);
        ourLibrary.addBookToLibrary(perryBook);
        ourLibrary.addBookToLibrary(softwareBook);
        ourLibrary.addBookToLibrary(drillBook);
        ourLibrary.addBookToLibrary(cardboardBoxBook);


        //checking number of books
        System.out.println(ourLibrary.getNumberOfBooks());

        //checking robot book out
        ourLibrary.searchForBookTitle("I, Robot").checkOut();

        //checking library catalog
        ourLibrary.printCatalog();
    }
    
}