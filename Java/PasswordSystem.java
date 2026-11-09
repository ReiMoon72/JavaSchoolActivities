import java.util.Scanner;

public class PasswordSystem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Correct Password
        String correctPassword = "ReimonePUGI";
        int userAttempt = 3;

        while (userAttempt >= 1) {

            // Printing the user Attempt
            System.out.println("============ENTER PASSWORD============");
            System.out.println("You Have " + userAttempt + " Many Attempt");
            System.out.print("Enter password: ");
            String password = input.nextLine();

            // Will Print if the password is right
            if (password.equals(correctPassword)) {
                System.out.println("Access Granted");
                System.out.println("Welcome To The System");
                break;
            } else {
                // Will Print if the password is wrong
                System.out.println("Incorrect Password. Try Again");
                userAttempt--;
            }
        }
        System.out.println("Too Many Attemp");
        System.out.println("Access Denied");
        input.close();
    }
}
