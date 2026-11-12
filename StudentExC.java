class StudentChained {
    private String name;
    private int age;
    private String studentNumber;

    public StudentChained() {
        this("Unknown", 0, "N/A");
    }

    public StudentChained(String name, int age, String studentNumber) {
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
        }
    }

    public void introduce() {
        System.out.println("Name: " + name + ", Age: " + age + ", Student No: " + studentNumber);
    }
}

public class StudentExC {
    public static void main(String[] args) {
        StudentChained defaultStudent = new StudentChained();
        StudentChained customStudent = new StudentChained("Diana", 19, "S103");

        System.out.println("--- Default Constructor Object ---");
        defaultStudent.introduce();

        System.out.println("\n--- Parameterized Constructor Object ---");
        customStudent.introduce();
    }
}
