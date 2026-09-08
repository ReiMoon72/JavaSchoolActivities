import java.util.Scanner;

public class StudentInformation {
    public static void main(String[] args) {

        Scanner quizInput = new Scanner(System.in);

        int average;

        // Start
        System.out.println("========== Student Information ==========");

        // Input the Student Name
        System.out.println("Enter Your Name: ");
        String studentName = quizInput.nextLine();

        // Input the Student Age
        System.out.println("Enter Your Age: ");
        int age = quizInput.nextInt();

        // This do so that the input of program/course will not be skipped/skip
        quizInput.nextLine();

        // Input the Student Program/Course
        System.out.println("Enter Your Course: ");
        String course = quizInput.nextLine();

        // Input the Student Quiz 1
        System.out.println("\nEnter The Quiz 1 Score: ");
        int quiz1 = quizInput.nextInt();

        // Input the Student Quiz 2
        System.out.println("Enter The Quiz 2 Score: ");
        int quiz2 = quizInput.nextInt();

        // Calculate the Quiz 1 + Quiz 2 = Sum then divide by 2.
        average = (quiz1 + quiz2) / 2;

        // Printing The Name, Age, and Program/Course
        System.out.println("\nName: " + studentName + " \nAge: " + age + " \nCourse: " + course);

        if (age >= 18) {
            System.out.println("You're A College Student");
        } else {
            System.out.println("You're a SHS, JHS, or Elem");
        }

        // Print The Quiz 1 & Quiz 2
        System.out.println("Quiz1 " + quiz1);
        System.out.println("Quiz2 " + quiz2);
        // Printing The Average Score for Quiz 1 & 2
        System.out.println("The Average Score Is: " + average);

        System.out.println("========== END ==========");
        quizInput.close();
    }
}
