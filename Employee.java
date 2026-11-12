public class Employee extends Person {
    private String department;

    public Employee(String name, String department) {
        super(name);
        if (department == null || department.trim().isEmpty()) {
            throw new IllegalArgumentException("Department cannot be null or empty.");
        }
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    @Override
    public void describe() {
        super.describe();
        System.out.println("Department: " + department);
    }
}
