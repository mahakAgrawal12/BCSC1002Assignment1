/*  Created by IntelliJ IDEA.
 *  User: Mahak Agrawal
 *  Date: 21/08/20
 *  Time: 3:50 PM
 *  File Name : Library.java
 * */
package definitions;

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
}