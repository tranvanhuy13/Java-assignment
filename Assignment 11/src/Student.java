import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Student extends Person {
    private float gpa;
    private String major;

    Student(String id, String fullName, Date dateOfBirth, float gpa, String major) {
        super(id, fullName, dateOfBirth);
        this.gpa = gpa;
        this.major = major;
    }

    Student() {
    }

    public float getGpa() {
        return gpa;
    }

    public void setGpa(float gpa) {
        this.gpa = gpa;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    @Override
    public void displayInfo() {
        System.out.println("--------------------------------");
        System.out.println("Student ID: " + getId());
        System.out.println("Full Name: " + getFullName());
        System.out.println("Date of Birth: " + getDateOfBirth());
        System.out.println("GPA: " + getGpa());
        System.out.println("Major: " + getMajor());
        System.out.println("--------------------------------");
    }

    public void addStudent() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Student ID: ");
        String id = sc.nextLine();
        setId(id);

        System.out.println("Enter Full Name: ");
        String name = sc.nextLine();
        setFullName(name);

        System.out.println("Enter Date of Birth (YYYY-MM-DD): ");
        String date = sc.nextLine();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        try {
            Date dateOfBirth = dateFormat.parse(date);
            setDateOfBirth(dateOfBirth);
        } catch (Exception e) {
            System.out.println("Invalid Date Format");
        }

        System.out.println("Enter GPA: ");
        float gpa = sc.nextFloat();
        setGpa(gpa);

        sc.nextLine();

        System.out.println("Enter Major: ");
        String major = sc.nextLine();
        setMajor(major);

    }


}