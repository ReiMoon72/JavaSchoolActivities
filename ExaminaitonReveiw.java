import java.util.*;

public class ExaminaitonReveiw {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        int userChoices;
        int studentGrade = 0;
        String studentWant = "";
        String studentID = "";
        String studentName = "";
        int studentAge = 0;
        String studentCourse = "";
        int studentYearLevel = 0;

        System.out.println("Enter UserName: ");
        String userNameString = inputScanner.nextLine();

        while (!userNameString.equals("IanJame")) {
            System.out.println("Wrong UserName Enter Again: ");
            userNameString = inputScanner.nextLine();
        }
        System.out.println("Access Granted");
        do {
            System.out.println("==========STUDENT MENU==========");
            System.out.println("1. Student Information");
            System.out.println("2. Grade Evaluation");
            System.out.println("3. Student Status");
            System.out.println("4. Subject Enrollment");
            System.out.println("5. Display Summary");
            System.out.println("6. Exit");

            System.out.println("Enter The Number Where You Go (1-6)");
            userChoices = inputScanner.nextInt();

            switch (userChoices) {
                case 1:
                    inputScanner.nextLine();
                    System.out.println("Enter Student ID: ");
                    studentID = inputScanner.nextLine();
                    System.out.println("Enter Student Name: ");
                    studentName = inputScanner.nextLine();
                    System.out.println("Enter Age");
                    studentAge = inputScanner.nextInt();
                    System.out.println("Enter Course/Program: ");
                    inputScanner.nextLine();
                    studentCourse = inputScanner.nextLine();
                    System.out.println("Enter Year Level: ");
                    studentYearLevel = inputScanner.nextInt();

                    if (studentAge >= 18 && studentAge <= 24) {
                        System.out.println("Welcome Student");
                        System.out.println(
                                studentID + "\n" + studentName + "\n" + studentCourse + "\n" + studentYearLevel);
                    } else {
                        System.out.println("You're Not a Student");
                    }
                    System.out.println("Press Enter To Go back in Menu");
                    inputScanner.nextLine();
                    inputScanner.nextLine();
                    break;
                case 2:
                    // This for Grade Evaluation
                    System.out.println("Enter Your Grade: ");
                    studentGrade = inputScanner.nextInt();

                    if (studentGrade >= 75 && studentGrade <= 79) {
                        System.out.println("Passed");
                    } else if (studentGrade >= 80 && studentGrade <= 84) {
                        System.out.println("Good");
                    } else if (studentGrade >= 85 && studentGrade <= 89) {
                        System.out.println("Very Good");
                    } else if (studentGrade >= 90 && studentGrade <= 100) {
                        System.out.println("Excellent");
                    } else {
                        System.out.println("FAILED!");
                    }
                    System.out.println("Press Enter To Go back in Menu");
                    inputScanner.nextLine();
                    inputScanner.nextLine();
                    break;
                case 3:
                    if (studentGrade >= 75 && studentGrade <= 100) {
                        System.out.println("Congratulations You Passed This Semester");
                    } else {
                        System.out.println("Unfortunately You Failed This Semester");
                    }
                    System.out.println("Press Enter To Go back in Menu");
                    inputScanner.nextLine();
                    inputScanner.nextLine();
                    break;
                case 4:
                    inputScanner.nextLine();
                    for (int studentSubject = 1; studentSubject <= 5; studentSubject++) {
                        System.out.println("Enter Subject You Want to In " + studentSubject + ":");
                        studentWant = inputScanner.nextLine();
                    }
                    System.out.println(studentWant);
                    System.out.println("Press Enter To Go back in Menu");
                    inputScanner.nextLine();
                    inputScanner.nextLine();
                    break;
                case 5:
                    System.out.println("Summary");
                    if (studentID == "" || studentName == "" || studentAge == 0 || studentCourse == ""
                            || studentYearLevel == 0) {
                        System.out.println("Do Data Found");
                    } else {
                        System.out.println(
                                studentID + "\n" + studentName + "\n" + studentAge + "\n" + studentCourse + "\n"
                                        + studentYearLevel);
                    }
                    System.out.println("Press Enter To Go back in Menu");
                    inputScanner.nextLine();
                    inputScanner.nextLine();
                    break;
                case 6:
                    System.out.println("Exit");
                    break;
                default:
                    System.out.println("Number Invalid");
                    break;
            }
        } while (userChoices != 6);

        inputScanner.close();
    }
}
