public class Exercise2 {

    public static void displayStudent(String name, int age) {
        System.out.println("Student: " + name + " | Age: " + age);
    }

    public static void main(String[] args) {
        // Calling with two different sets of arguments
        displayStudent("Alice", 20);
        displayStudent("Bob", 22);
    }
}