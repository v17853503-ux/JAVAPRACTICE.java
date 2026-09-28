import java.util.Scanner;

public class Array5 {

    public static boolean searchMark(int[] marks, int target) {
        for (int mark : marks) {
            if (mark == target) {
                return true; // Stop early upon finding match
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] marks = {65, 72, 58, 81, 90};
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a mark to search for: ");
        int target = scanner.nextInt();

        if (searchMark(marks, target)) {
            System.out.println("Mark " + target + " was found in the array!");
        } else {
            System.out.println("Mark " + target + " was not found.");
        }

        scanner.close();
    }
}
    

