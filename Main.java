import java.util.ArrayList;
import java.util.Scanner;

// Main class
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter student's name and address:");
        String studentName = scanner.nextLine();
        String studentAddress = scanner.nextLine();
        Student student = new Student(studentName, studentAddress);

        System.out.println("Enter the number of courses for the student:");
        int numCoursesStudent = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < numCoursesStudent; i++) {
            System.out.println("Enter course name and grade:");
            String course = scanner.nextLine();
            int grade = Integer.parseInt(scanner.nextLine());
            student.addCourseGrade(course, grade);
        }
        
        student.printGrades();
        System.out.println("Average grade: " + student.getAverageGrade());

        System.out.println("\nEnter teacher's name and address:");
        String teacherName = scanner.nextLine();
        String teacherAddress = scanner.nextLine();
        Teacher teacher = new Teacher(teacherName, teacherAddress);

        System.out.println("Enter the number of courses to add for the teacher:");
        int numCoursesTeacher = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < numCoursesTeacher; i++) {
            System.out.println("Enter course name to add:");
            String course = scanner.nextLine();
            boolean added = teacher.addCourse(course);
            if (!added) {
                System.out.println("Course already exists.");
            }
        }

        System.out.println("Enter the number of courses to remove for the teacher:");
        int numCoursesToRemove = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < numCoursesToRemove; i++) {
            System.out.println("Enter course name to remove:");
            String course = scanner.nextLine();
            boolean removed = teacher.removeCourse(course);
            if (!removed) {
                System.out.println("Course does not exist.");
            }
        }

        System.out.println(student);
        System.out.println(teacher);

        scanner.close();
    }
}
