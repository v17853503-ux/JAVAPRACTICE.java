import java.util.Scanner;

public class StudentMenu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n--- Student Registration Helper ---");
            System.out.println("1. Register Student");
            System.out.println("2. View Student");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Registering student...");
                    break;
                case 2:
                    System.out.println("Viewing student details...");
                    break;
                case 3:
                    System.out.println("Exiting application.");
                    break;
                default:
                    System.out.println("Invalid option. Please choose between 1 and 3.");
            }
        } while (choice != 3);

        scanner.close();
    }
} 
    

