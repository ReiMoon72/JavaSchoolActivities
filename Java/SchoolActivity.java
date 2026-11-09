/*  Reimone Glaire M. Palama
    BSIT - 261D
    PROGCON
*/
import java.util.Scanner;

public class SchoolActivity {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //asking for user/person age
        System.out.println("Enter Your Age");
        int age = input.nextInt();

        //Checking if the age is 18+
        if (age >= 18) {
            //If 18+ the age
            System.out.println("You can vote");
        } else {
            //If not 18+ the age
            System.out.println("You're Minor");
        }
        input.close();
    }
}
