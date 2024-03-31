import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Example of creating a Student
        System.out.print("Enter student's name: ");
        String studentName = scanner.nextLine();
        System.out.print("Enter student's address: ");
        String studentAddress = scanner.nextLine();
        Student student = new Student(studentName, studentAddress);

        // Add courses and grades for the student
        // This would typically be a loop, but here we just add one for the example
        System.out.print("Enter course name: ");
        String courseName = scanner.nextLine();
        System.out.print("Enter grade: ");
        int grade = scanner.nextInt();
        student.addCourseGrade(courseName, grade);

        // Example of creating a Teacher
        scanner.nextLine(); // consume newline
        System.out.print("Enter teacher's name: ");
        String teacherName = scanner.nextLine();
        System.out.print("Enter teacher's address: ");
        String teacherAddress = scanner.nextLine();
        Teacher teacher = new Teacher(teacherName, teacherAddress);

        // Add a course for the teacher
        System.out.print("Enter course name to add: ");
        String newCourse = scanner.nextLine();
        if (teacher.addCourse(newCourse)) {
            System.out.println("Course added.");
        } else {
            System.out.println("Course already exists.");
        }

        scanner.close();

        // Print the details
        System.out.println(student);
        student.printGrades();
        System.out.println("Average grade is: " + student.getAverageGrade());
        System.out.println(teacher);
    }
}
