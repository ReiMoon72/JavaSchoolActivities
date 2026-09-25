import java.util.Scanner;

public class SwitchStatement {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);

        int day = 2;

        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            default:
                System.out.println("Weekends");
                break;
        }

        System.out.println("Enter A Type Of Day");
        int dayToday = inputScanner.nextInt();

        switch (dayToday) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            default:
                System.out.println("Weekends");
                break;
        }

        inputScanner.close();
    }
}