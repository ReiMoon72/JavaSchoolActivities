import java.util.Scanner;

public class RandomOperators {
    public static void main(String[] args) {
        Scanner inputValue = new Scanner(System.in);

        int num1;
        int num2;
        int finalAnswer;

        // Start This is just the decoration
        System.out.println("=========== START ===========");

        // Input The First Number
        System.out.println("Input The First Number: ");
        num1 = inputValue.nextInt();

        inputValue.nextLine();

        // Input The Operators
        System.out.println("Input The Operator You Want: ");
        String opertors = inputValue.nextLine();

        // Input The Second Number
        System.out.println("Input The Second Number: ");
        num2 = inputValue.nextInt();

        //When the user input the valid operator which is + - * /
        switch (opertors) {
            //When the user input the + it will add
            case "+":
                finalAnswer = num1 + num2;
                System.out.println("The Answer is: " + finalAnswer);
                break;
                //When the user input the - it will Minus
            case "-":
                finalAnswer = num1 - num2;
                System.out.println("The Answer is: " + finalAnswer);
                break;
                //When the user input the * it will Multiply
            case "*":
                finalAnswer = num1 * num2;
                System.out.println("The Answer is: " + finalAnswer);
                break;
                //When the user input the / it will Divide
            case "/":
                finalAnswer = num1 / num2;
                System.out.println("The Answer is: " + finalAnswer);
                break;
                //When the user input the invalid operator
            default:
                System.out.println("Invalid Operator");
                break;
        }

        inputValue.close();
        System.out.println("=========== End ===========");
    }
}
