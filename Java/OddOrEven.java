/*  Reimone Glaire M. Palama
    BSIT - 261D
    PROGCON
*/

import java.util.Scanner;
public class OddOrEven {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);

        //Asking for a Number
        System.out.println("Input a Number: ");
        int num = inputScanner.nextInt();

        //Checking if the Number is Even or Odd
        if (num % 2 == 0) {
            //If the number is Even this will print
            System.out.println("Even");
        } else {
            //If the number is Odd this will print
            System.out.println("Odd");
        }

        inputScanner.close();
    }
}
