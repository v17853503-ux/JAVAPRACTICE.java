import java.util.Scanner;

public class Array4 {

    public static void displayMarks(int[] marks) {
        System.out.println("\nAll Stored Marks:");
        for (int i = 0; i < marks.length; i++) {
            System.out.println("Mark " + (i + 1) + ": " + marks[i]);
        }
    }

    public static double calculateAverage(int[] marks) {
        int total = 0;
        for (int mark : marks) {
            total += mark;
        }
        return (double) total / marks.length;
    }

    public static int countPasses(int[] marks) {
        int passes = 0;
        for (int mark : marks) {
            if (mark >= 50) {
                passes++;
            }
        }
        return passes;
    }

    public static int findHighest(int[] marks) {
        int highest = marks[0];
        for (int mark : marks) {
            if (mark > highest) {
                highest = mark;
            }
        }
        return highest;
    }

    public static int findLowest(int[] marks) {
        int lowest = marks[0];
        for (int mark : marks) {
            if (mark < lowest) {
                lowest = mark;
            }
        }
        return lowest;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] marks = new int[5];

        for (int i = 0; i < marks.length; i++) {
            System.out.print("Enter mark " + (i + 1) + ": ");
            marks[i] = scanner.nextInt();
        }

        displayMarks(marks);
        System.out.println("Average: " + calculateAverage(marks));
        System.out.println("Passes: " + countPasses(marks));
        System.out.println("Highest: " + findHighest(marks));
        System.out.println("Lowest: " + findLowest(marks));

        scanner.close();
    }
}