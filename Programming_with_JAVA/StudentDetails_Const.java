import java.util.Scanner;

public class Student {
    // Attributes
    private int studentId;
    private String studentName;
    private String studentAddress;
    private String collegeName;

    // Getters and Setters
    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentAddress() {
        return studentAddress;
    }

    public void setStudentAddress(String studentAddress) {
        this.studentAddress = studentAddress;
    }

    public String getCollegeName() {
        return collegeName;
    }

    public void setCollegeName(String collegeName) {
        this.collegeName = collegeName;
    }

    // Constructor with four arguments
    public Student(int studentId, String studentName, String studentAddress, String collegeName) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.studentAddress = studentAddress;
        this.collegeName = collegeName;
    }

    // Constructor with three arguments (collegeName defaults to "NIT")
    public Student(int studentId, String studentName, String studentAddress) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.studentAddress = studentAddress;
        this.collegeName = "NIT";
    }
}

public class UserInterface {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get Student ID
        System.out.println("Enter Student's Id:");
        int studentId = Integer.parseInt(scanner.nextLine());

        // Get Student Name
        System.out.println("Enter Student's Name:");
        String studentName = scanner.nextLine();

        // Get Student Address
        System.out.println("Enter Student's address:");
        String studentAddress = scanner.nextLine();

        // Check if the student is from NIT
        String fromNIT;
        while (true) {
            System.out.println("Whether the student is from NIT(Yes/No):");
            fromNIT = scanner.nextLine();
            if (fromNIT.equalsIgnoreCase("yes")) {
                // Create Student object with NIT college name
                Student student = new Student(studentId, studentName, studentAddress);
                printStudentDetails(student);
                break;
            } else if (fromNIT.equalsIgnoreCase("no")) {
                // Get College Name
                System.out.println("Enter the college name:");
                String collegeName = scanner.nextLine();

                // Create Student object with custom college name
                Student student = new Student(studentId, studentName, studentAddress, collegeName);
                printStudentDetails(student);
                break;
            } else {
                System.out.println("Wrong Input");
            }
        }

        scanner.close();
    }

    // Method to print Student details
    public static void printStudentDetails(Student student) {
        System.out.println("Student id:" + student.getStudentId());
        System.out.println("Student name:" + student.getStudentName());
        System.out.println("Address:" + student.getStudentAddress());
        System.out.println("College name:" + student.getCollegeName());
    }
}
