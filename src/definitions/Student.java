/*  Created by IntelliJ IDEA.
 *  User: Krishna Bansal
 *  Date: 27/08/20
 *  Time: 4:38 PM
 *  File Name : Student.java
 * */
package definitions;

import java.util.Arrays;
import java.util.Objects;

public class Student {
    private String studentName;
    private long studentUniversityRollNumber;
    private int howManyBookIssuedByStudent;
    private Book[] studentIssuedBook;

    public Student(String studentName, long studentUniversityRollNumber, int howManyBookIssuedByStudent, Book[] studentIssuedBook) {
        this.studentName = studentName;
        this.studentUniversityRollNumber = studentUniversityRollNumber;
        this.howManyBookIssuedByStudent = howManyBookIssuedByStudent;
        this.studentIssuedBook = studentIssuedBook;
    }

    public Student() {
    }

    public String getstudentName() {
        return studentName;
    }

    public void setstudentName(String studentName) {
        this.studentName = studentName;
    }

    public long getstudentUniversityRollNumber() {
        return studentUniversityRollNumber;
    }

    public void setstudentUniversityRollNumber(long studentUniversityRollNumber) {
        this.studentUniversityRollNumber = studentUniversityRollNumber;
    }

    public int gethowManyBookIssuedByStudent() {
        return howManyBookIssuedByStudent;
    }

    public void sethowManyBookIssuedByStudent(int howManyBookIssuedByStudent) {
        this.howManyBookIssuedByStudent = howManyBookIssuedByStudent;
    }

    public Book[] getstudentIssuedBook() {
        return studentIssuedBook;
    }

    public void setstudentIssuedBook(Book[] studentIssuedBook) {
        this.studentIssuedBook = studentIssuedBook;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return studentUniversityRollNumber == student.studentUniversityRollNumber &&
                howManyBookIssuedByStudent == student.howManyBookIssuedByStudent &&
                Objects.equals(studentName, student.studentName) &&
                Arrays.equals(studentIssuedBook, student.studentIssuedBook);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(studentName, studentUniversityRollNumber, howManyBookIssuedByStudent);
        result = 31 * result + Arrays.hashCode(studentIssuedBook);
        return result;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentName='" + studentName + '\'' +
                ", studentUniversityRollNumber=" + studentUniversityRollNumber +
                ", numberOfBooksIssuedByStudent=" + howManyBookIssuedByStudent +
                ", booksIssuedByStudent=" + Arrays.toString(studentIssuedBook) +
                '}';
    }

    public void addBook(Book book) {
        System.out.println(book.getBookName() + "issued book is . ");
    }

    public void returnPreviouslyIsssuedBook(String bookName) {
        System.out.println(bookName + " is returned");
    }

    public void showAllBooks() {
        studentIssuedBook = new Book[10];
        for (int i = 0; i < 10; i++) {
            System.out.println("Book" + (i + 1));
        }
    }
}