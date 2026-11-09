import java.util.Scanner;

public class SwtichStatementActivity {
    public static void main(String[] args) {
        Scanner orderInput = new Scanner(System.in);

        System.out.println("===== FOOD MENU =====");
        System.out.println("1. Burger P80 \n" + "2. Fries P50 \n" + "3. Spaghetti P70 \n" + "4. Chicken P120 \n"
                + "5. Exit");
        System.out.println("====================");
        System.out.println("Enter Order Number");
        int orderChoose = orderInput.nextInt();

        switch (orderChoose) {
            case 1:
                System.out.println("Input Order Quantity");
                int orderQuantity = orderInput.nextInt();
                System.out.println("Burger P80");
                System.out.println("Total: " + 80 * orderQuantity);
                break;
            case 2:
                System.out.println("Input Order Quantity");
                int orderQuantity1 = orderInput.nextInt();
                System.out.println("Fried P50");
                System.out.println("Total: " + 50 * orderQuantity1);
                break;
            case 3:
                System.out.println("Input Order Quantity");
                int orderQuantity2 = orderInput.nextInt();
                System.out.println("Spaghetti P70");
                System.out.println("Total: " + 70 * orderQuantity2);
                break;
            case 4:
                System.out.println("Input Order Quantity");
                int orderQuantity3 = orderInput.nextInt();
                System.out.println("Chicken P120");
                System.out.println("Total: " + 120 * orderQuantity3);
                break;
            case 5:
                System.out.println("Thank you for using the Food Ordering System!");
                break;
            default:
                System.out.println("Invalid choice");
                break;
        }

        orderInput.close();
    }
}
