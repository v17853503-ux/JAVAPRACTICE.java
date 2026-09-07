import java.util.Scanner;

public class AGECHECK {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter student age: ");
        int age = scanner.nextInt();

        if (age >= 18) {
            System.out.println("Eligible to register");
        } else {
            System.out.println("Guardian approval required");
        }
        scanner.close();
    }
}