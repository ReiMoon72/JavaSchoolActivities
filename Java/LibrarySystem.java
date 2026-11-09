import java.util.*;

public class LibrarySystem {
    public static void main(String[] args) {
        Scanner scannerInput = new Scanner(System.in);

        int userchoices = -1;
        int bookCategory;
        int numberBooks;
        int totalFee;
        int discount;
        int finalFee;
        int zeroDuee;

        do {
            System.out.println("=============================");
            System.out.println("Welcome To Library System");
            System.out.println("=============================");

            System.out.println("=============================");
            System.out.println("1. Borrow a Book");
            System.out.println("2. Calculate Late Fee");
            System.out.println("3. Display Summary");
            System.out.println("4. Exit");
            System.out.println("=============================");

            System.out.println("Enter Choices: ");
            userchoices = scannerInput.nextInt();

            switch (userchoices) {
                case 1:
                    System.out.println("Choices      Book Category      Borrowing Fee");
                    System.out.println("1.           Storybook          P10");
                    System.out.println("2.           Science Book       P15");
                    System.out.println("3.           Reference Book     P20");

                    System.out.println("\nEnter Book Category: ");
                    bookCategory = scannerInput.nextInt();
                    System.out.println("Enter Number of books: ");
                    numberBooks = scannerInput.nextInt();

                    switch (bookCategory) {
                        case 1:
                            System.out.println("Category: Storybook");
                            totalFee = numberBooks * 10;
                            System.out.println("Original Fee: " + totalFee);

                            discount = 0;

                            if (totalFee >= 50 && numberBooks >= 3) {
                                if (totalFee >= 50 && numberBooks >= 3) {
                                    discount = totalFee / 10;
                                }
                            } else {
                                System.out.println("No Discount");
                            }
                            System.out.println("Discount: " + discount);
                            finalFee = totalFee - discount;
                            System.out.println("Final Fee: " + finalFee);
                            break;
                        case 2:
                            System.out.println("Category: Science Book");
                            totalFee = numberBooks * 15;
                            System.out.println("Original Fee: " + totalFee);

                            discount = 0;

                            if (totalFee >= 50 && numberBooks >= 3) {
                                if (totalFee >= 50 && numberBooks >= 3) {
                                    discount = totalFee / 10;
                                }
                            } else {
                                System.out.println("No Discount");
                            }
                            System.out.println("Discount: " + discount);
                            finalFee = totalFee - discount;
                            System.out.println("Final Fee: " + finalFee);
                            break;
                        case 3:
                            System.out.println("Category: Reference Book");
                            totalFee = numberBooks * 20;
                            System.out.println("Original Fee: " + totalFee);

                            discount = 0;

                            if (totalFee >= 50 && numberBooks >= 3) {
                                if (totalFee >= 50 && numberBooks >= 3) {
                                    discount = totalFee / 10;
                                }
                            } else {
                                System.out.println("No Discount");
                            }
                            System.out.println("Discount: " + discount + "%");
                            finalFee = totalFee - discount;
                            System.out.println("Final Fee: " + finalFee);
                            break;
                        default:
                            break;
                    }

                    System.out.println("Press Enter To Exit: ");
                    scannerInput.nextLine();
                    scannerInput.nextLine();
                    break;
                case 2:
                    System.out.println("Enter Overdue days: ");
                    int overdueDays = scannerInput.nextInt();

                    if (overdueDays == 0) {
                        zeroDuee = overdueDays * 0;
                        System.out.println("Your OverDue is: " + zeroDuee);
                    } else if (overdueDays >= 2 && overdueDays <= 3) {
                        zeroDuee = overdueDays * 5;
                        System.out.println("Fee Per day: P5");
                        System.out.println("Your OverDue is: " + zeroDuee);
                    } else if (overdueDays >= 4 && overdueDays <= 7) {
                        zeroDuee = overdueDays * 10;
                        System.out.println("Fee Per day: P10");
                        System.out.println("Your OverDue is: " + zeroDuee);
                    } else if (overdueDays >= 7) {
                        zeroDuee = overdueDays * 15;
                        System.out.println("Fee Per day: P15");
                        System.out.println("Your OverDue is: " + zeroDuee);
                    } else {
                        System.out.println("Letter Not Allowed");
                    }
                    System.out.println("Press Enter To Exit: ");
                    scannerInput.nextLine();
                    scannerInput.nextLine();
                    break;
                case 3:

                case 4:
                    System.out.println("Thank you for using the library System!");
                    System.out.println("Exit");
                    break;
                default:
                    System.out.println("Choices Are Not Found");
                    break;
            }
        } while (userchoices != 4);

        scannerInput.close();
    }
}
