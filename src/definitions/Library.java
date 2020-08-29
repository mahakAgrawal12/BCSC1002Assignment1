/*  Created by IntelliJ IDEA.
 *  User: Mahak Agrawal
 *  Date: 21/08/20
 *  Time: 3:50 PM
 *  File Name : Library.java
 * */
package definitions;

import java.util.Arrays;

public class Library {
    private Book[] books;

    //constructor
    public Library() {
        books = new Book[5];
        for (int i = 0; i < books.length; i++) {
            books[0] = new Book();
            books[1] = new Book("Book");
            books[2] = new Book(44);
            books[3] = new Book("Book Author", "Book Name");
            books[4] = new Book("Book Name", "Book Author", "Book Number");
        }
    }

    //getters and setters method
    public Book[] getBooks() {
        return books;
    }

    public void setBooks(Book[] books) {
        this.books = books;
    }

    // The toString() method
    @Override
    public String toString() {
        return "Library{" +
                "books=" + Arrays.toString(books) +
                '}';
    }

    //The equals() method
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Library library = (Library) o;
        return Arrays.equals(getBooks(), library.getBooks());
    }

    //the hashCode() method
    @Override
    public int hashCode() {
        return Arrays.hashCode(getBooks());
    }
}