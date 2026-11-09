/*  Reimone Glaire M. Palama
    BSIT - 261D
    PROGCON
*/
import java.util.Scanner;
public class PositiveNegative {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Asking for a number
        System.out.println("Input a Positive Or Negative Number: ");
        int number = input.nextInt();

        //If the number
        if (number >= 0) {
            //If the number is greater the 0 POSITIVE
            System.out.println("Positive");
        } else {
            //If the number is lower or less than 0 NEGATIVE
            System.out.println("Negative");
        }

        input.close();
    }
}
