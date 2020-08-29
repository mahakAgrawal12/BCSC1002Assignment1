/*  Created by IntelliJ IDEA.
 *  User: Mahak Agrawal
 *  Date: 21/08/20
 *  Time: 3:49 PM
 *  File Name : Book.java
 * */
package definitions;

import java.util.Objects;

public class Book {

    private String bookName;
    private String bookAuthor;
    private String bookNumber;
    private int bookId;

    //constructors
    public Book() {
        this.bookName = "Python";
        this.bookAuthor = "Harsh Bhasin";
        this.bookNumber = "76t7y3eh7yuu";
    }

    public Book(String bookName) {
        this.bookName = "Java";
        this.bookAuthor = "Herbert Schildt";
        this.bookNumber = "683yyrh0oj9j5";
    }

    public Book(String bookAuthor, String bookName) {
        this.bookName = "letusc";
        this.bookAuthor = "Yashavant P Kanetkar";
        this.bookNumber = "gft7yuehj7uiw8";
    }

    public Book(String bookName, String bookAuthor, String bookNumber) {
        this.bookName = "PHP";
        this.bookAuthor = "Vikram Vaswani";
        this.bookNumber = "tyhffyye87e78";
    }

    public Book(int bookId) {
        this.bookName = "javascript";
        this.bookAuthor = "David Flanagan";
        this.bookNumber = "66te3j878yu34";
    }

    //getterrs and setters for the private fields
    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getBookAuthor() {
        return bookAuthor;
    }

    public void setBookAuthor(String bookAuthor) {
        this.bookAuthor = bookAuthor;
    }

    public String getBookNumber() {
        return bookNumber;
    }

    public void setBookNumber(String bookNumber) {
        this.bookNumber = bookNumber;
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    //the toString() method
    @Override
    public String toString() {
        return "Book{" +
                "bookName='" + bookName + '\'' +
                ", bookAuthor='" + bookAuthor + '\'' +
                ", bookNumber='" + bookNumber + '\'' +
                '}';
    }

    //the equals() method
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(getBookName(), book.getBookName()) &&
                Objects.equals(getBookAuthor(), book.getBookAuthor()) &&
                Objects.equals(getBookNumber(), book.getBookNumber());
    }

    //the hashCode() method
    @Override
    public int hashCode() {
        return Objects.hash(getBookName(), getBookAuthor(), getBookNumber());
    }
}



