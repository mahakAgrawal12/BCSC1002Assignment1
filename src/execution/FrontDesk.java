/*  Created by IntelliJ IDEA.
 *  User: Mahak Agrawal
 *  Date: 21/08/20
 *  Time: 3:50 PM
 *  File Name : FrontDesk.java
 * */
package execution;

import definitions.Library;
import definitions.Student;

import java.util.Scanner;

public class FrontDesk {

    private static final int ADD_BOOK = 1;
    private static final int RETURN_BOOK = 2;
    private static final int ISUUE_BOOK = 3;
    private static final int EXIT = 4;

    public static void main(String[] args) {
        Library library = new Library();
        Student student = new Student();
        Byte studentInput;
        String bookName;
        String studentName;
        Long studentUniversityRollNumber;
        Scanner scanner = new Scanner(System.in);
    }
}