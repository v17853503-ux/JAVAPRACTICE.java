class Student {
    String name;
    String studentNumber;
    String programme;

    void displayDetails() {
        System.out.println("Name: " + name + ", Student Number: " + studentNumber + ", Programme: " + programme);
    }
}

public class StudentEx1 {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.name = "Alice Smith";
        student1.studentNumber = "S1001";
        student1.programme = "Computer Science";

        Student student2 = new Student();
        student2.name = "Bob Jones";
        student2.studentNumber = "S1002";
        student2.programme = "Information Technology";

        System.out.println("--- Initial Student Details ---");
        student1.displayDetails();
        student2.displayDetails();

        student1.name = "Alice Wonderland";
        System.out.println("\n--- After changing student1.name ---");
        System.out.println("student1 name: " + student1.name);
        System.out.println("student2 name: " + student2.name);
    }
}
