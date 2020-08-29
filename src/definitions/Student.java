/*  Created by IntelliJ IDEA.
 *  User: Mahak Agrawal
 *  Date: 21/08/20
 *  Time: 3:49 PM
 *  File Name : Student.java
 * */
package definitions;

import java.util.Arrays;
import java.util.Objects;

public class Student {
    private static Book[] studentIssuedBookName;
    private String studentName;
    private long studentUniversityRollNumber;
    private int studentIssueedBookNumber;

    //constructors
    public Student() {
        studentIssuedBookName = new Book[2];
        for (int i = 0; i < studentIssuedBookName.length; i++) {
            studentIssuedBookName[0] = new Book("Book Author", "Book Name");
            studentIssuedBookName[1] = new Book("Book" + (i + 1));
        }
    }

    public Student(String studentName) {
        this.studentName = "Mahi Bansal";
    }

    //getters and setters method
    public String getStudentName() {
        this.studentName = "Mahi Bansal";
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public long getStudentUniversityRollNumber() {
        return studentUniversityRollNumber;
    }

    public void setUniversityRollNumber(long universityRollNumber) {
        this.studentUniversityRollNumber = studentUniversityRollNumber;
    }

    public int getStudentIssueedBookNumber() {
        return studentIssueedBookNumber;
    }

    public void setStudentIssueedBookNumber(int studentIssueedBookNumber) {
        this.studentIssueedBookNumber = studentIssueedBookNumber;
    }

    public Book[] getStudentIssuedBookName() {
        return studentIssuedBookName;
    }

    public void setStudentIssuedBookName(Book[] studentIssuedBookName) {
        Student.studentIssuedBookName = studentIssuedBookName;
    }

    //The toString() method
    @Override
    public String toString() {
        return "Student{" +
                "studentName='" + studentName + '\'' +
                ", universityRollNumber=" + studentUniversityRollNumber +
                ", studentIssueedBookNumber=" + studentIssueedBookNumber +
                ", studentIssuedBookName=" + Arrays.toString(studentIssuedBookName) +
                '}';
    }

    //The equals() method
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return getStudentUniversityRollNumber() == student.getStudentUniversityRollNumber() &&
                getStudentIssueedBookNumber() == student.getStudentIssueedBookNumber() &&
                Objects.equals(getStudentName(), student.getStudentName());
    }

    //The hashCode() method
    @Override
    public int hashCode() {
        int result = Objects.hash(getStudentName(), getStudentUniversityRollNumber(), getStudentIssueedBookNumber());
        result = 31 * result + Arrays.hashCode(getStudentIssuedBookName());
        return result;
    }
}