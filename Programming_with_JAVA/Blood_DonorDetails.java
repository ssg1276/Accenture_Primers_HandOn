class DonorDetails {
    // Attributes
    private String name;
    private int age;
    private String gender;
    private String bloodGroup;
    private long phoneNumber;

    // Parameterized constructor
    public DonorDetails(String name, int age, String gender, String bloodGroup, long phoneNumber) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.bloodGroup = bloodGroup;
        this.phoneNumber = phoneNumber;
    }

    // Getter and Setter for name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Getter and Setter for age
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // Getter and Setter for gender
    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    // Getter and Setter for blood group
    public String getBloodGroup() {
        return bloodGroup;
    }

    public void setBloodGroup(String bloodGroup) {
        this.bloodGroup = bloodGroup;
    }

    // Getter and Setter for phone number
    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}

import java.util.Scanner;

public class UserInterface {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Getting the details from the user
        System.out.println("Enter the name");
        String name = scanner.nextLine();

        System.out.println("Enter the age");
        int age = scanner.nextInt();
        scanner.nextLine(); // consume newline

        System.out.println("Enter the gender");
        String gender = scanner.nextLine();

        System.out.println("Enter the blood group");
        String bloodGroup = scanner.nextLine();

        System.out.println("Enter the phone no");
        long phoneNumber = scanner.nextLong();

        // Creating the DonorDetails object using the parameterized constructor
        DonorDetails donor = new DonorDetails(name, age, gender, bloodGroup, phoneNumber);

        // Displaying the donor's details
        System.out.println("Name:" + donor.getName());
        System.out.println("Age:" + donor.getAge());
        System.out.println("Gender:" + donor.getGender());
        System.out.println("Blood group:" + donor.getBloodGroup());
        System.out.println("Phone no:" + donor.getPhoneNumber());

        scanner.close();
    }
}

