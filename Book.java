public class Book {
    /*
        Member Variables
        - the data needed to describe or define an instance of the object
        - also called "internal state"
        - exist for a specific instance of this object
        - we set them private in most cases, public for static constants
    */
    private String m_ISBN;
    private String m_title;
    private String m_author;
    private int m_nPages;
    private boolean m_isAvailable;

    // static variables are shared across all instances of Book
    private static int booksInCatalog = 0;
    // final variables are not allowed to be changed
    private static final String LIBRARY_SLOGAN = "Books are Magic!";

    /*
        Default Constructor
        - this code runs when a new instance
        of the Book class gets created
        - sets default values of all member variables
        and increases total books by one
    */
    public Book() {
        m_ISBN = "";
        m_title = "";
        m_author = "";
        m_nPages = 0;
        m_isAvailable = true;
        booksInCatalog++;
    }

    // overloaded constructor
    public Book(String ISBN, String title, String author, int nPages) {
        m_ISBN = ISBN;
        m_title = title;
        m_author = author;
        m_nPages = nPages;
        m_isAvailable = true;
        booksInCatalog++;
    }

    // copy constructor
    public Book(Book original) {
        m_title = original.getTitle();
        m_author = original.getAuthor();
        m_ISBN = "";
        m_nPages = 0;
        m_isAvailable = true;
        booksInCatalog++;
    }

    /*
        Accessors & Mutators
        - allow users of this class to access
        or update private member variables
    */
    public String getTitle() {
        return m_title;
    }

    public void setTitle(String t) {
        m_title = t;
    }

    public String getAuthor() {
        return m_author;
    }

    public void setAuthor(String a) {
        m_author = a;
    }

    public static int getBooksInCatalog() {
        return booksInCatalog;
    }

    /*
        Methods that perform some sort of action
        that is not accessing/mutating member variables
    */
    public void checkOut() {
        if (m_isAvailable) {
            System.out.println("Enjoy your read!");
            m_isAvailable = false;
        } else {
            System.out.println("Sorry, this book is not currently available.");
        }
    }

    public void returnToLibrary() {
        m_isAvailable = true;
        System.out.println("Thank you, kind person!");
    }

    /*
        toString method
        Allows you to use pretty printing in System.out.println
        (must be called toString to work automatically)
    */
    public String toString() {
        return "--------------------------\n"
        + m_title + " by " + m_author
        + "\nPages: " + m_nPages
        + "\nISBN: " + m_ISBN
        + "\n" + LIBRARY_SLOGAN
        + "\n--------------------------";
    }

    /*
        equals method
        Allows you to compare this instance of Book to other objects
        (other Books or any other objects)
    */
    public boolean equals(Object o) {
        if (!(o instanceof Book)) {
            // if it's not a book, clearly not equal
            return false;
        } else {
            // cast down into this class
            Book otherBook = (Book) o;
            // the "this" keyword means the calling object
            // in this case that this current book's isbn is equal to
            // the isbn of the book we are comparing it against
            return this.m_ISBN.equals(otherBook.m_ISBN);
        }
    }

    public static void main(String[] args) {
        // Book firstBook = new Book(); // creates default book
        // firstBook.setTitle("Big Magic");
        // firstBook.setAuthor("Elizabeth Gilbert");
        // System.out.println(firstBook);
        //
        // // creates book with overloaded constructor
        // Book secondBook = new Book("", "Devotions", "Mary Oliver", 234);
        // System.out.println(secondBook);
        // System.out.println(firstBook.equals(secondBook));
        //
        // secondBook.checkOut();
        // secondBook.checkOut();
        // secondBook.returnToLibrary();
        // secondBook.checkOut();
        //
        // System.out.println(Book.getBooksInCatalog());
        //
        // // creates book with copy constructor
        // Book thirdBook = new Book(secondBook);
        // System.out.println(thirdBook);
        // System.out.println(Book.getBooksInCatalog());

        Book firstBook = new Book("ISBN", "Harry Potter", "JK Rowling", 386);
        System.out.println("Originals");
        System.out.println(firstBook);

        // shallow copy, just of a copy of the reference
        Book secondBook = firstBook;
        secondBook.setAuthor("Severus Snape");
        System.out.println(secondBook);

        // deep copy
        Book thirdBook = new Book(firstBook);
        thirdBook.setAuthor("JK Rowling");
    }
}
