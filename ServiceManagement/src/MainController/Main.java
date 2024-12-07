package MainController;
import java.util.*;
import Pages.Login;
import Pages.UserRegister;

public class Main {

    public static void main(String[] args) {
        System.out.println("Welcome to our Services");
        System.out.println("Already Registered Users Press 1 For Login");
        System.out.println("New Users Press 2 for Registration");
        System.out.println("Press 6 to Exit");

        Scanner sc = new Scanner(System.in);
        Login Lg = new Login();
        UserRegister Ug = new UserRegister();
        int k = 0;

        while (k != 6) {
            System.out.println("Enter query number (1: Login, 2: Register, 6: Exit):");

            if (!sc.hasNextInt()) {
                System.out.println("Invalid input. Please enter a valid number.");
                sc.next();
                continue;
            }

            int inp = sc.nextInt();
            sc.nextLine();
            if (inp == 1) {
                Lg.UserLogin();
            } else if (inp == 2) {
                Ug.createUser();
            } else if (inp == 6) {
                k = 6;
                System.out.println("Thank you for using our services. Goodbye!");
            } else {
                System.out.println("Invalid choice. Please select 1, 2, or 6.");
            }
        }

        sc.close();
    }
}
