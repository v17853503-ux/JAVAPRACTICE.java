class StudentEncapsulated {
    private String name;
    private int age;
    private String studentNumber;

    public StudentEncapsulated(String name, int age, String studentNumber) {
        this.name = name;
        setAge(age);
        this.studentNumber = studentNumber;
    }

    public String getName() { return name; }
    public int getAge() { return age; }
    public String getStudentNumber() { return studentNumber; }

    public void setAge(int age) {
        if (age >= 0 && age <= 120) {
            this.age = age;
        } else {
            System.out.println("Error: Age must be between 0 and 120. Age not updated.");
        }
    }

    public void introduce() {
        System.out.println("Hello, my name is " + name + ", I am " + age + " years old, and my student number is " + studentNumber + ".");
    }
}

public class StudentExA {
    public static void main(String[] args) {
        StudentEncapsulated s1 = new StudentEncapsulated("Alice", 20, "S101");
        StudentEncapsulated s2 = new StudentEncapsulated("Bob", 22, "S102");

        s1.introduce();
        s2.introduce();

        System.out.println("\nTesting invalid age update:");
        s1.setAge(150);
    }
}
