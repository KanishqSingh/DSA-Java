package oops;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Student class with encapsulation
class Student {
    private int id;
    private String name;
    private int age;
    private String grade;

    // Constructor
    public Student(int id, String name, int age, String grade) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    // Getters
    public int getId() { return id; }
    public String getName() { return name; }
    public int getAge() { return age; }
    public String getGrade() { return grade; }

    // Display student details
    public void display() {
        System.out.println("ID: " + id + " | Name: " + name + " | Age: " + age + " | Grade: " + grade);
    }
}

// Student Management System class
class StudentManagement {
    private List<Student> students = new ArrayList<>();

    // Add a new student
    public void addStudent(Student student) {
        students.add(student);
        System.out.println("Student added successfully!");
    }

    // Display all students
    public void displayAllStudents() {
        if (students.isEmpty()) {
            System.out.println("No students found.");
            return;
        }
        System.out.println("\nStudent List:");
        for (Student student : students) {
            student.display();
        }
    }

    // Search student by ID
    public void searchById(int id) {
        for (Student student : students) {
            if (student.getId() == id) {
                System.out.println("Student Found:");
                student.display();
                return;
            }
        }
        System.out.println("Student with ID " + id + " not found.");
    }

    // Search student by Name
    public void searchByName(String name) {
        boolean found = false;
        for (Student student : students) {
            if (student.getName().equalsIgnoreCase(name)) {
                if (!found) System.out.println("Students Found:");
                student.display();
                found = true;
            }
        }
        if (!found) System.out.println("No student found with the name: " + name);
    }

    // Search student by Age
    public void searchByAge(int age) {
        boolean found = false;
        for (Student student : students) {
            if (student.getAge() == age) {
                if (!found) System.out.println("Students Found:");
                student.display();
                found = true;
            }
        }
        if (!found) System.out.println("No student found with age: " + age);
    }
}

// Main Class
public class StudentManagementSystem {
    public static void main(String[] args) {
        StudentManagement management = new StudentManagement();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nStudent Management System");
            System.out.println("1. Add Student");
            System.out.println("2. Display All Students");
            System.out.println("3. Search by ID");
            System.out.println("4. Search by Name");
            System.out.println("5. Search by Age");
            System.out.println("6. Exit");
            System.out.print("Choose an option: ");
            
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter ID: ");
                    int id = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    System.out.print("Enter Name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter Age: ");
                    int age = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    System.out.print("Enter Grade: ");
                    String grade = scanner.nextLine();
                    management.addStudent(new Student(id, name, age, grade));
                    break;

                case 2:
                    management.displayAllStudents();
                    break;

                case 3:
                    System.out.print("Enter Student ID to Search: ");
                    int searchId = scanner.nextInt();
                    management.searchById(searchId);
                    break;

                case 4:
                    System.out.print("Enter Student Name to Search: ");
                    String searchName = scanner.nextLine();
                    management.searchByName(searchName);
                    break;

                case 5:
                    System.out.print("Enter Student Age to Search: ");
                    int searchAge = scanner.nextInt();
                    management.searchByAge(searchAge);
                    break;

                case 6:
                    System.out.println("Exiting the system. Goodbye!");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice! Please enter a valid option.");
            }
        }
    }
}
