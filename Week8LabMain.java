public class Week8LabMain {
    public static void main(String[] args) {
        System.out.println("=== PART A: Person & Student Test ===");
        Student s1 = new Student("Alice Smith", "ST-1001");
        Student s2 = new Student("Bob Johnson", "ST-1002");
        s1.describe();
        s2.describe();

        System.out.println("\n=== PART B: Employee Subclass Test ===");
        Employee emp = new Employee("Carlos Ray", "Software Engineering");
        emp.describe();

        System.out.println("\n=== PART D: Project Connection (VIPBooking IS-A ProjectBooking) ===");
        VIPBooking vip = new VIPBooking("BK-9901", "Diana Prince", 500.0, 0.20);
        vip.displaySummary();
    }
}
