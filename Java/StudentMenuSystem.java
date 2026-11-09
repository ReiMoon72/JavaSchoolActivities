import java.util.*;

public class StudentMenuSystem {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);

        int userChoices = -1;

        do {
            System.out.println("========== STUDENT MENU SYSTEM ==========");
            System.out.println("1. Check Student Status");
            System.out.println("2. Display Numbers");
            System.out.println("3. Grade Category");
            System.out.println("4. Exit");

            userChoices = inputScanner.nextInt();

            System.out.println("==============================");
            System.out.println("You Enter Number: " + userChoices);
            System.out.println("==============================");

            switch (userChoices) {
                // This Where the student Enter the grade and the attendance grade
                case 1:
                    System.out.println("Enter Grade: ");
                    int studentGrade = inputScanner.nextInt();
                    System.out.println("Enter Attendance ");
                    int studentAttendace = inputScanner.nextInt();

                    // If the student grade is higer then 75 but not higher than 100 same as the
                    // attendance the print will be PASSED
                    if (studentGrade >= 75 && studentGrade <= 100 && studentAttendace >= 75
                            && studentAttendace <= 100) {
                        System.out.println("PASSED");
                    } else {
                        System.out.println("FAILED");
                    }
                    // Student press enter it will do back in the menu
                    System.out.println("Press Enter to back in the main menu");
                    inputScanner.nextLine();
                    inputScanner.nextLine();
                    break;
                case 2:
                    // For loop when the user enter the number
                    System.out.println("Enter a number: ");
                    int numberCount = inputScanner.nextInt();

                    for (int i = 0; i < numberCount; i++) {
                        System.out.print(i + " ");
                    }
                    // Student press enter it will do back in the menu
                    System.out.println("\n Press Enter to back in the main menu");
                    inputScanner.nextLine();
                    inputScanner.nextLine();
                    break;
                case 3:
                    // Grade Category
                    inputScanner.nextLine();
                    System.out.println("Enter Your Grade Category: ");
                    String gradeCategory = inputScanner.nextLine();
                    switch (gradeCategory) {
                        // If student print the A
                        case "A":
                            System.out.println("Nice One");
                            break;
                        // If student print the B
                        case "B":
                            System.out.println("Very Good");
                            break;
                        // If student print the C
                        case "C":
                            System.out.println("Nice!");
                            break;
                        // If student print the D
                        case "D":
                            System.out.println("Okey, Nice");
                            break;
                        // If student print the F
                        case "F":
                            System.out.println("Better Luck Next Time");
                            break;
                        // If student print the S, Just a Eastern Egg
                        case "S":
                            System.out.println("Sung Jin Woo?");
                            break;
                        // If student print a letter in grade category that doesn't exist
                        default:
                            System.out.println("That Letter in Grade Doesn't Exist");
                            break;
                    }
                    // Student press enter it will do back in the menu
                    System.out.println("Press Enter to back in the main menu");
                    inputScanner.nextLine();
                    inputScanner.nextLine();
                    break;
                case 4:
                    // If student press o enter 4 the system will be in automatic exit
                    System.out.println("Thank You for using the STUDENT MENU SYSTEM");
                    System.out.println("Exit The Program");
                    break;
                // If user click a number that doesn't exis in the system
                default:
                    System.out.println("That Doesn't Exist");
            }

        } while (userChoices != 4);

        inputScanner.close();
    }
}