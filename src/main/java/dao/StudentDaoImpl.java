package dao;

import domain.Student;

import java.util.Scanner;

public class StudentDaoImpl implements StudentDao {
    public Student createTempStudent() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter your firsname: ");
        String firsname = scanner.nextLine();
        System.out.print("enter your lastname: ");
        String lastname = scanner.nextLine();

        return new Student(firsname, lastname);
    }
}
