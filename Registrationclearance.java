import java.util.Scanner;

public class Registrationclearance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter amount paid (ZMW): ");
        double amount = scanner.nextDouble();

        if (amount >= 5000.00) {
            System.out.println("Fully Cleared");
        } else if (amount >= 2500.00) {
            System.out.println("Partially Cleared");
        } else {
            System.out.println("Payment Required");
        }
        scanner.close();
    }
}