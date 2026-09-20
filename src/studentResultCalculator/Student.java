package studentResultCalculator;

public class Student {

    private String name;
    private int rollNumber;

    public Student(String name, int rollNumber) {
        this.name = name;
        this.rollNumber = rollNumber;
    }

    public void displayStudent() {

        System.out.println("===== STUDENT DETAILS =====");
        System.out.println("Student Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
    }

    public static void main(String[] args) {

        Student student = new Student("Vaishnavi", 101);

        student.displayStudent();
    }
}