import java.util.Scanner;

public class Array2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] marks = new int[5];

        // Loop 1: Collect marks
        for (int i = 0; i < marks.length; i++) {
            System.out.print("Enter mark " + (i + 1) + ": ");
            marks[i] = scanner.nextInt();
        }

        // Loop 2: Display marks
        System.out.println("\nStored Marks:");
        for (int i = 0; i < marks.length; i++) {
            System.out.println("Mark at index " + i + ": " + marks[i]);
        }

        scanner.close();
    }
}