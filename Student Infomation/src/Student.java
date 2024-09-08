
import java.util.Scanner;

public class Student {
    private String id;
    private String fullName;
    private Float GPA;
    private String dateOfBirth;
    private String major;

    public Student() {
    }


    Student enterStudentInfo(Student student) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter student id: ");
        student.id = sc.nextLine();

        System.out.print("Enter student name: ");
        student.fullName = sc.nextLine();

        System.out.print("Enter GPA: ");
        student.GPA = sc.nextFloat();
        sc.nextLine();

        System.out.print("Enter date of birth: ");
        student.dateOfBirth = sc.nextLine();

        System.out.print("Enter major: ");
        student.major = sc.nextLine();
        System.out.println();
        System.out.println();
        System.out.println();
        return student;
    }

    public void displayStudentInfo(Student student) {
        System.out.println("Student id: " + student.id);
        System.out.println("Student name: " + student.fullName);
        System.out.println("Student GPA: " + student.GPA);
        System.out.println("Student date of birth: " + student.dateOfBirth);
        System.out.println("Student major: " + student.major);
    }

    public static void main(String[] args) {
        Student student = new Student();
        student = student.enterStudentInfo(student);
        student.displayStudentInfo(student);

    }
}