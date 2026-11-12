public class ProjectBooking {
    private String bookingId;
    private String customerName;
    private double amount;

    public ProjectBooking(String bookingId, String customerName, double amount) {
        if (bookingId == null || bookingId.trim().isEmpty()) {
            throw new IllegalArgumentException("Booking ID cannot be empty.");
        }
        if (customerName == null || customerName.trim().isEmpty()) {
            throw new IllegalArgumentException("Customer name cannot be empty.");
        }
        if (amount <= 0) {
            throw new IllegalArgumentException("Amount must be positive.");
        }
        this.bookingId = bookingId;
        this.customerName = customerName;
        this.amount = amount;
    }

    public String getBookingId() { return bookingId; }
    public String getCustomerName() { return customerName; }
    public double getAmount() { return amount; }

    public void displaySummary() {
        System.out.println("Booking Ref: " + bookingId + " | Customer: " + customerName + " | Total: $" + amount);
    }
}
