public class Exercise3 {

    public static double calculateBalance(double income, double expenses) {
        return income - expenses;
    }

    public static void main(String[] args) {
        double income = 2000.0;
        double expenses = 750.0;

        // Store and display the returned result
        double balance = calculateBalance(income, expenses);
        System.out.println("Remaining Balance: $" + balance);
    }
}