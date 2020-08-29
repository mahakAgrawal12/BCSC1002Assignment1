/*  Created by IntelliJ IDEA.
 *  User: Mahak Agrawal
 *  Date: 21/08/20
 *  Time: 3:49 PM
 *  File Name : Student.java
 * */
package definitions;

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
}