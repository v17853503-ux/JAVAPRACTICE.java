public class Student extends Person {
    private String studentId;

    public Student(String name, String studentId) {
        super(name);
        if (studentId == null || studentId.trim().isEmpty()) {
            throw new IllegalArgumentException("Student ID cannot be null or empty.");
        }
        this.studentId = studentId;
    }

    public String getStudentId() {
        return studentId;
    }

    @Override
    public void describe() {
        System.out.println("Student Name: " + getName() + " | Student ID: " + studentId);
    }
}
