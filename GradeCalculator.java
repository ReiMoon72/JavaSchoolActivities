import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        // Creating the scanner
        Scanner scanner = new Scanner(System.in);

        // Asking for the Student name
        System.out.println("Enter Student Name: ");
        String studentName = scanner.nextLine();

        // Asking the Student to input the score of quiz
        System.out.println("Input TheGrade in Quiz: ");
        int quizScore = scanner.nextInt();

        // Asking the Student to input the score of assignment
        System.out.println("InputThe Grade in Assignment: ");
        int assignmentScore = scanner.nextInt();

        // Asking the Student to input the score of exam
        System.out.println("Input The Grade in Exam: ");
        int examScore = scanner.nextInt();

        // Calculating the quiz, assignment, and exam
        double finalGrade = (quizScore * 0.30) + (assignmentScore * 0.30) + (examScore * 0.40);

        if (finalGrade <= 75) {
            System.out.println("Pasang Awa");
        } else if (finalGrade >= 76 && finalGrade <= 79) {
            System.out.println("Sakto");
        } else if (finalGrade >= 80 && finalGrade <= 89) {
            System.out.println("Pasado na rin");
        } else if (finalGrade >= 90 && finalGrade <= 99) {
            System.out.println("Dean Lister!!");
        } else {
            System.out.println("Pasado!!");
        }

        // Printing The Final Grade and name
        System.out.println("Name: " + studentName);
        System.out.println("The Final Grade is:" + finalGrade);

        scanner.close();
    }
}
