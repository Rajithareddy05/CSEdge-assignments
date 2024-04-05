import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the marks obtained in Mathematics: ");
        int mathMarks = scanner.nextInt();

        System.out.println("Enter the marks obtained in Physics: ");
        int physicsMarks = scanner.nextInt();

        System.out.println("Enter the marks obtained in Chemistry: ");
        int chemistryMarks = scanner.nextInt();

        int totalMarks = mathMarks + physicsMarks + chemistryMarks;
        double average = totalMarks / 3.0;

        System.out.println("Average marks: " + average);

        char grade;

        if (average >= 90 && average <= 100) {
            grade = 'A';
        } else if (average >= 80 && average < 90) {
            grade = 'A';
        } else if (average >= 70 && average < 80) {
            grade = 'B';
        } else if (average >= 60 && average < 70) {
            grade = 'C';
        } else {
            grade = 'F';
        }

        System.out.println("Grade: " + grade);
    }
}
