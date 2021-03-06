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
    private static final int SHOW_ISUUED_BOOK = 3;
    private static final int EXIT = 4;

    public static void main(String[] args) {
        Byte studentInput;
        String bookName;
        String studentName;
        Long studentUniversityRollNumber;
        Library library = new Library();
        Student student = new Student();
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Hello," + student.getStudentName() + "!!");
            System.out.println("-=-=--=-=-Welcome To The Front Desk-=-=--=-=-");
            System.out.println("How may I help today?");
            System.out.println("1. Issue a new book for me.");
            System.out.println("2. Return a previously issues book for me.");
            System.out.println("3. Show me all my issues books.");
            System.out.println("4. Exit.");
            System.out.println("Enter your choice (1..4): ");
            studentInput = scanner.nextByte();

            switch (studentInput) {
                case ADD_BOOK:
                    System.out.println("Enter your name:");
                    studentName = scanner.next();
                    System.out.println("Enter your university roll number:");
                    studentUniversityRollNumber = scanner.nextLong();
                    System.out.println("These are the books currently available in library:");
                    library.listOfAvailableBooks();
                    System.out.println("Enter the name of the book that you want to issue:");
                    scanner.nextLine();
                    bookName = scanner.nextLine();
                    student.addBook(bookName);
                    System.out.println();
                    break;
                case RETURN_BOOK:
                    System.out.println("Enter your name:");
                    studentName = scanner.next();
                    System.out.println("Enter your university roll number:");
                    studentUniversityRollNumber = scanner.nextLong();
                    System.out.println("Enter the name of the book that you want to return: ");
                    scanner.nextLine();
                    bookName = scanner.nextLine();
                    student.doReturn(bookName);
                    System.out.println();
                    break;
                case SHOW_ISUUED_BOOK:
                    System.out.println("Enter your name:");
                    studentName = scanner.next();
                    System.out.println("Enter your university roll number:");
                    studentUniversityRollNumber = scanner.nextLong();
                    System.out.print("These are the books that you have issued: ");
                    student.listOfIssuedBook();
                    System.out.println();
                    break;
                default:
                    System.out.println("WRONG CHOICE");
                    break;
            }
        } while (studentInput != EXIT);
        scanner.close();
    }
}