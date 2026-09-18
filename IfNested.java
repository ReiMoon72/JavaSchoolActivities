import java.util.Scanner;

public class IfNested {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        
        //Asking for the user to input the account Balance
        System.out.println("What is your balance?");
        int accountBalance = inputScanner.nextInt();

        inputScanner.nextLine();

        System.out.println("How much you want to withdraw");
        int withdrawNumber = inputScanner.nextInt();

        if (withdrawNumber < accountBalance) {
            if (withdrawNumber % 100 == 0) {
                System.out.println("Withdraw Successfull");
            } else{
                System.out.println("Amount must be in multiples of 100.");
            }
        } else {
            System.out.println("Insufficient balance.");
        }
        inputScanner.close();
    }
}