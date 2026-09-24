package OOP;

import java.util.ArrayList;

class Book {
    String title;
    String author;

    void displayBookDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("----------------------------");
    }
}

class Library {
    ArrayList<Book> libraryBooks = new ArrayList<>();

    void addBook(Book newBook) {
        libraryBooks.add(newBook);
    }

    void showBook() {
        if(libraryBooks.isEmpty()) {
            System.out.println("The Library has zero books!");
        }
        for(Book book : libraryBooks) {
            book.displayBookDetails();
        }
    }
}

public class HASA {
    public static void main(String[] args) {
        Book myFavoriteBook = new Book();
        myFavoriteBook.title = "1984";
        myFavoriteBook.author = "George Orwell";

        Book secondBook = new Book();
        secondBook.title = "A series of unfortunate events";
        secondBook.author = "Lemony Snicket";

        Library cityLibrary = new Library();
        cityLibrary.addBook(myFavoriteBook);
        cityLibrary.addBook(secondBook);
        cityLibrary.showBook();
    }
}