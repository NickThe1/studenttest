package domain;

import java.util.List;
import java.util.Scanner;

public class Student {

    private String firstname;
    private String lastname;
    private int grade;

    public Student() {
    }

    public Student(String firstname, String lastname) {
        this.firstname = firstname;
        this.lastname = lastname;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(List<Task> tasks) {
        this.grade = 0;

        for(Task i : tasks){
            Scanner scanner = new Scanner(System.in);
            System.out.println(i.getExercise());
            String studentInput = scanner.nextLine();

            if(i.getAnswer().contentEquals(studentInput)) ++grade;
            else continue;
        }

    }
}
