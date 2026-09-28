import java.util.Scanner;

public class Exercise4 {

    // Task 1: Display menu options (No parameters, no return)
    public static void displayMenu() {
        System.out.println("=== SYSTEM MENU ===");
        System.out.println("1. Check Age Eligibility");
        System.out.println("2. Exit");
        System.out.println("===================");
    }

    // Task 2: Check eligibility logic (Requires parameter, returns boolean)
    public static boolean isEligible(int age) {
        return age >= 18;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Coordination by main()
        displayMenu();

        System.out.print("Enter your age: ");
        int userAge = scanner.nextInt();

        if (isEligible(userAge)) {
            System.out.println("Access granted: You are eligible!");
        } else {
            System.out.println("Access denied: You must be 18 or older.");
        }

        scanner.close();
    }
}