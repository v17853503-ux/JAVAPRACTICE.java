import java.util.Scanner;

public class ProcessStudents {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 1; i <= 5; i++) {
            System.out.print("Enter age for student " + i + ": ");
            int age = scanner.nextInt();

            if (age >= 18) {
                System.out.println("Eligible to register");
            } else {
                System.out.println("Guardian approval required");
            }
        }
        scanner.close();
    }
} 
    

