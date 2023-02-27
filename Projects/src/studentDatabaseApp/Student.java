package studentDatabaseApp;

import java.util.Scanner;

public class Student {
    private  String firstName;
    private  String lastName;
    private  int gradeYear;
    private String studentID;
    private String courses = "";
    private int tuitionBalance = 0;
    private static int costOfCourse = 600;
    private static int id = 1000;



    //Constructor: prompt user to enter student's name and year
    public Student(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter student name: ");
        this.firstName = scanner.nextLine();

        System.out.println("Enter student last name: ");
        this.lastName = scanner.next();

        System.out.println("Enter student level: \n1 - Bachelor\n2 - Master\n3 - Doctorate");
        this.gradeYear = scanner.nextInt();

        setStudentID();

    }

    //Generate an 5-digit ID(first digit is equal to their grade year)
    private void setStudentID(){
        id ++;
        this.studentID = gradeYear + "" + id;
    }

    //Enroll in courses
    public void enroll(){
        Scanner scanner = new Scanner(System.in);
        do{
            System.out.println("Enter course to enroll (Q to quit)");
            String course = scanner.nextLine();
            if (!course.equalsIgnoreCase("Q")) {
                courses = courses + "\n" + course;
                tuitionBalance = tuitionBalance + costOfCourse;
            }else {
                break;
            }
        }while(true);
        }

    //View balance
    public void viewBalance(){
        System.out.println("Your balance is: €" + tuitionBalance);
    }

    //Pay tuition
    public void payTuition(){
        viewBalance();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your payment in EUR");
        int payment = scanner.nextInt();
        tuitionBalance = tuitionBalance - payment;
        System.out.println("Thank you for your payment of: €" +payment);
        viewBalance();
    }

    public String showInfo(){
        return "\nName: " + firstName + " " +lastName +
                "\nGrade Level " + gradeYear +
                "\nStudentID: " + studentID +
                "\nCourses Enrolled: " +courses +
                "\nBalance: €" +tuitionBalance +
                "\n";
    }
}
