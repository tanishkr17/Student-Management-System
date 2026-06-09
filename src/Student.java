public class Student {
    private int id;
    private String name;
    private int age;
    public Student(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public void displayDetails() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println();
    }
}
import java.util.ArrayList;
public class StudentManager {
    private ArrayList<Student> students = new ArrayList<>();
    public void addStudent(Student student) {
        students.add(student);
    }
    public void displayAllStudents() {
        for (Student student : students) {
            student.displayDetails();
        }
    }
    public void searchStudentById(int id) {
        for (Student student : students) {
            if (student.getId() == id) {
                System.out.println("Student Found:");
                student.displayDetails();
                return;
            }
        }
        System.out.println("Student not found.");
    }
    public void searchStudentByName(String name) {
        for (Student student : students) {
            if (student.getName().equalsIgnoreCase(name)) {
                System.out.println("Student Found:");
                student.displayDetails();
                return;
            }
        }
        System.out.println("Student not found.");
    }
}
public class Main {
    public static void main(String[] args) {
        StudentManager manager = new StudentManager();
      
        manager.addStudent(new Student(101, "Rahul", 20));
        manager.addStudent(new Student(102, "Priya", 19));
        manager.addStudent(new Student(103, "Amit", 21));

        System.out.println("All Students:");
        manager.displayAllStudents();

        System.out.println("Search by ID:");
        manager.searchStudentById(102);

        System.out.println("Search by Name:");
        manager.searchStudentByName("Amit");
    }
}
