import java.util.Scanner;

public class StudentInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);//Scanner object to read input from the console.
       
        System.out.print("Enter your name: ");//prompt for the stuents name.
        String name = input.nextLine();

        System.out.print("Enter your age: ");// rompt for thr stuents age.
        int age = input.nextInt();
        input.nextLine(); 

        // Prompt for and read programme
        System.out.print("Enter your programme: ");
        String programme = input.nextLine();

        // Display the greeting personalised for the student.
        System.out.println("\nHello " + name + "!");
        System.out.println("You are " + age + " years old.");
        System.out.println("You are studying " + programme + ".");
        System.out.println("Welcome to CS350.");

        // Close the scanner resource
        input.close();
    }
}