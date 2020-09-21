/**
* A class that maintains information on a book.
* This could become a larger part of an application
* such as a library system.
*
* @author Ben Kiley
* @version Sep 21, 2020
*/
class Book
{
    // The fields.
    private String author;
    private String title;
    // 2.85
    private int pages;
    // 2.88
    private String refNumber;
    // 2.91
    private int borrowed;
    // 2.92
    private boolean courseText;

    /**
    * Set the author, title, pages, reference number, and textbook
    * fields when this object is constructed
    */
    public Book(String bookAuthor, String bookTitle, int bookPages, boolean textBook) {
        author = bookAuthor;
        title = bookTitle;
        // 2.85
        pages = bookPages;
        // 2.88
        refNumber = "";
        // 2.92
        courseText = textBook;
    }

    // Add the methods here ...
    /**
    * Provide access to the string holding the author's name
    * 2.83
    */
    public String getAuthor() {
        return author;
    }
    
    /**
    * Provide access to the string holding the book's title
    * 2.83
    */
    public String getTitle() {
        return title;
    }
    
    /**
    * Provide access to the integer holding the book's total pages
    * 2.85
    */
    public int getPages() {
        return pages;
    }
    
    /**
    * Provide access to the string holding the reference number
    * 2.88
    */
    public String getRefNumber() {
        return refNumber;
    }
    
    /**
    * Provide access to the integer holding how many times the book
    * was borrowed
    * 2.91
    */
    public int getBorrowed() {
        return borrowed;
    }
    
    /**
    * Provide access to the boolean to determine if it's a textbook
    * 2.92
    */
    public boolean isCourseText() {
        return courseText;
    }
    
    /**
    * Set the reference number for the book
    * 2.88
    */
    public void setRefNumber(String ref) {
        // 2.90
        if (ref.length() < 3) {
            System.err.println("Error: RefNumber must be" + 
            "\n atleast three characters long.");
        } else {
            refNumber = ref;
        }
    }
    
    /**
    * Increase the amount of times a book has been borrowed
    * 2.91
    */
    public void borrow() {
        borrowed += 1;
    }
    
    /**
    * Print the author's name to the console
    * 2.84
    */
    public void printAuthor() {
        System.out.println(author);
    }
    
    /**
    * Print the title of the book to the console
    * 2.84
    */
    public void printTitle() {
        System.out.println(title);
    }
    
    /**
    * Print the book details to the console
    * 2.87
    */
    public void printDetails() {
        System.out.println("Author: " + author + "\n\tTitle: "
        + title + "\n\tPages: " + pages);
        // 2.89
        if (refNumber.length() <= 0) {
            System.out.println("\tReference ID: zzz");
        } else {
            System.out.println("\tReference ID: " + refNumber);
        }
        // 2.91
        System.out.println("\tRented: " + borrowed);
        // 2.92
        System.out.println("\tTextbook: " + courseText);
    }
    
    
    
    
    
}
