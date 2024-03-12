public class Student {
    private int enrollmentNo;
    private String name;

    // Constructor to initialize enrollment number and name
    public Student(int enrollmentNo, String name) {
        this.enrollmentNo = enrollmentNo;
        this.name = name;
    }

    // Getter method for enrollment number
    public int getEnrollmentNo() {
        return enrollmentNo;
    }

    // Getter method for name
    public String getName() {
        return name;
    }

    public static void main(String[] args) {
        // Creating three Student objects
        Student student1 = new Student(1, "John");
        Student student2 = new Student(2, "Alice");
        Student student3 = new Student(3, "Bob");

        // Displaying names of the students
        System.out.println("Student 1 Name: " + student1.getName());
        System.out.println("Student 2 Name: " + student2.getName());
        System.out.println("Student 3 Name: " + student3.getName());
    }
}
