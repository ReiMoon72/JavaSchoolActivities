import java.util.Scanner;

public class SchoolActivity {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter Your Age");
        int age = input.nextInt();

        if (age >= 18 && age <= 60) {
            System.out.println("You can vote!!");
        } else if(age >= 10 && age <=1) {
            System.out.println("You're Just a kid");
        } else if(age >=100){
            System.out.println("How are you still alive?");
        } else if(age <= 0 && age >=-100) {
            System.out.println("Uhm... HOW?");
        } else if(age >= 61 && age <= 99){
            System.out.println("You can't vote unc");
        } else {
            System.out.println("You're a Mnor");
        }
        input.close();
    }
}
