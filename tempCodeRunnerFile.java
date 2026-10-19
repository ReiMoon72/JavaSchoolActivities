import java.util.*;

public class CodeReviewPart2 {
    public static void main(String[] args) {
        Scanner inputsScanner = new Scanner(System.in);

        double accountBalance = 5000.00;
        int userAttempt = 0;
        final int maxAttempt = 3;
        int userInput;
        int correctPassword = 1234;
        double interesrateIncrease;

        while (userAttempt < maxAttempt) {
            System.out.println("========== Enter PIN ==========");
            System.out.println("Enter PIN:");

            int pinAttempt = inputsScanner.nextInt();
            userAttempt++;

            if (pinAttempt == correctPassword) {
                System.out.println("Access Granted");
                break;
            } else {
                System.out.println("Wrong PIN!");

                if (userAttempt == maxAttempt) {
                    System.out.println("Maximum attempts reached.");
                    System.out.println("Card blocked!");
                    return;
                } else {
                    System.out.println("You have " + (maxAttempt - userAttempt) + " attempts remaining.");
                }
            }
        }

        System.out.println("========== Welcome ==========");
        do {
            System.out.println("======== ATM Machine ========");
            System.out.println("[1] Check Balance");
            System.out.println("[2] Deposit");
            System.out.println("[3] Withdraw");
            System.out.println("[4] Interest Projection");
            System.out.println("[5] Exit");

            System.out.println("\nEnter Choice: ");
            userInput = inputsScanner.nextInt();

            switch (userInput) {
                case 1:
                    System.out.println("========== Current Balance ==========");
                    System.out.printf("Balance: ₱%.2f%n", accountBalance);

                    System.out.println("Press Enter To Exit");
                    inputsScanner.nextLine();
                    inputsScanner.nextLine();
                    break;
                case 2:
                    System.out.println("========== Deposit ==========");

                    System.out.println("Enter The Amount you want to Deposit");
                    int addBalance = inputsScanner.nextInt();

                    if (addBalance <= 0 || addBalance <= -1) {
                        System.out.println("Invalid amount");
                    } else {
                        accountBalance += addBalance;
                        System.out.printf("Deposit successful. New balance: ₱%.2f%n", accountBalance);
                    }

                    System.out.println("Press Enter To Exit");
                    inputsScanner.nextLine();
                    inputsScanner.nextLine();
                    break;
                case 3:
                    System.out.println("========== Withdraw ==========");
                    System.out.println("\nEnter Number You To Withdraw: ");
                    int withdrawAmmount = inputsScanner.nextInt();

                    if (withdrawAmmount <= 0 || withdrawAmmount <= -1) {
                        System.out.println("Invalid amount");
                    } else if (withdrawAmmount > accountBalance) {
                        System.out.println("Insufficient funds.");
                    } else if (withdrawAmmount % 100 != 0) {
                        System.out.println("Amount must be in multiples of 100.");
                    } else if (withdrawAmmount > 10000) {
                        System.out.println("Exceeds daily withdrawal limit.");
                    } else {
                        accountBalance -= withdrawAmmount;
                        System.out.printf("Withdraw successful. Remaining balance: ₱%.2f%n", accountBalance);
                    }
                    System.out.println("Press Enter To Exit");
                    inputsScanner.nextLine();
                    inputsScanner.nextLine();
                    break;
                case 4:
                    System.out.println("========== Interest Rate ========");
                    System.out.println("Enter The Years Of Project (1-10)");
                    interesrateIncrease = inputsScanner.nextInt();

                    if (interesrateIncrease < 1 || interesrateIncrease > 10) {
                        System.out.println("Invalid Years");
                    } else {
                        double projctedBalance = accountBalance;
                        for (int year = 1; year <= interesrateIncrease; year++) {
                            double interestRate;
                            if (accountBalance < 10000) {
                                interestRate = 0.02;
                            } else if (accountBalance < 50000) {
                                interestRate = 0.03;
                            } else {
                                interestRate = 0.04;
                            }
                            projctedBalance += projctedBalance * interestRate;
                            System.out.printf("Year %d: ₱%.2f%n", year, projctedBalance);
                        }
                    }
                    System.out.println("Press Enter To Exit");
                    inputsScanner.nextLine();
                    inputsScanner.nextLine();
                    break;
                case 5:
                    System.out.println("Thank you for banking with us! ");
                    break;
                default:
                    System.out.println("Invalid choice");
                    break;
            }
        } while (userInput != 5);
        inputsScanner.close();
    }
}
