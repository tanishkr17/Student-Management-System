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
