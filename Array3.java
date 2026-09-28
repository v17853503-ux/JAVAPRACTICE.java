import java.util.Scanner;

public class Array3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] marks = new int[5];

        for (int i = 0; i < marks.length; i++) {
            System.out.print("Enter mark " + (i + 1) + ": ");
            marks[i] = scanner.nextInt();
        }

        int total = 0;
        int passes = 0;
        int failures = 0;
        int highest = marks[0];
        int lowest = marks[0];

        for (int i = 0; i < marks.length; i++) {
            total += marks[i];

            // Pass/Fail count
            if (marks[i] >= 50) {
                passes++;
            } else {
                failures++;
            }

            // High/Low evaluation
            if (marks[i] > highest) {
                highest = marks[i];
            }
            if (marks[i] < lowest) {
                lowest = marks[i];
            }
        }

        // Casting total to double prevents integer division truncation
        double average = (double) total / marks.length;

        System.out.println("\n--- Summary ---");
        System.out.println("Total Marks: " + total);
        System.out.println("Average Mark: " + average);
        System.out.println("Passes: " + passes);
        System.out.println("Failures: " + failures);
        System.out.println("Highest Mark: " + highest);
        System.out.println("Lowest Mark: " + lowest);

        scanner.close();
    }
}