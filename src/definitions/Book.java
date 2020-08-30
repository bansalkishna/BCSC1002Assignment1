/*  Created by IntelliJ IDEA.
 *  User: Krishna Bansal
 *  Date: 27/08/20
 *  Time: 11:20 AM
 *  File Name : Book.java
 * */
package definitions;

import java.util.Objects;

public class Book {
    private String bookName;
    private String bookAuthorName;
    private String bookIsbnNumber;

    public Book(String bookName, String bookAuthorName, String bookIsbnNumber) {
        this.bookName = bookName;
        this.bookAuthorName = bookAuthorName;
        this.bookIsbnNumber = bookIsbnNumber;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    private String getBookAuthorName() {
        return bookAuthorName;
    }

    public void setBookAuthorName(String bookAuthorName) {
        this.bookAuthorName = bookAuthorName;
    }

    public String getBookIsbnNumber() {
        return bookIsbnNumber;
    }

    public void setBookIsbnNumber(String bookIsbnNumber) {
        this.bookIsbnNumber = bookAuthorName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(bookName, book.bookName) &&
                Objects.equals(bookAuthorName, book.bookAuthorName) &&
                Objects.equals(bookAuthorName, book.bookAuthorName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bookName, bookAuthorName, bookAuthorName);
    }

    @Override
    public String toString() {
        return "Book{" +
                "nameOfBook='" + bookName + '\'' +
                ", nameOfAuthorOfBook='" + bookAuthorName + '\'' +
                ", isbnNumberOfBook='" + bookAuthorName + '\'' +
                '}';
    }
}

