import java.util.Scanner;

public class CodePractive {
    public static void main(String[] args) {
        Scanner scannerNumber = new Scanner(System.in);

        int inputNumber = 0;
        int targetNumber = 5;

        while (inputNumber != -1) {
            System.out.println("Enter Number: ");
             inputNumber = scannerNumber.nextInt();

             if (inputNumber == targetNumber) {
                System.out.println("You Enter The " + targetNumber + " Please Print Again");
             } else {
                System.out.println("You Enter The: " + inputNumber);
             }
        }
        scannerNumber.close();
    }
}
