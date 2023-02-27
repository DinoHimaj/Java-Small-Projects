package studentDatabaseApp;

import java.util.Scanner;

public class studentDatabaseApp {
    public static void main(String[] args) {
        //Ask how many users we want to add
        System.out.println("Enter a number of new students to enroll: ");
        Scanner scanner = new Scanner(System.in);
        int numOfStudents = scanner.nextInt();
        Student[] student = new Student[numOfStudents];

        //Create a number of new students
        for (int i = 0; i < numOfStudents; i++) {
            student[i] = new Student();
            student[i].enroll();
            student[i].payTuition();
            System.out.println(student[i].showInfo());
        }
    }
}
