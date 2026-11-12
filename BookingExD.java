class ProjectBooking {
    private String bookingId;
    private String customerName;
    private double amount;
    private int numberOfGuests;
    private boolean isConfirmed;

    public ProjectBooking(String bookingId, String customerName, double amount, int numberOfGuests) {
        if (bookingId == null || bookingId.trim().isEmpty()) {
            throw new IllegalArgumentException("Booking ID cannot be empty.");
        }
        if (amount <= 0) {
            throw new IllegalArgumentException("Booking amount must be greater than zero.");
        }
        if (numberOfGuests <= 0) {
            throw new IllegalArgumentException("Number of guests must be at least 1.");
        }

        this.bookingId = bookingId;
        this.customerName = customerName;
        this.amount = amount;
        this.numberOfGuests = numberOfGuests;
        this.isConfirmed = false;
    }

    public void confirmBooking() {
        isConfirmed = true;
        System.out.println("Booking " + bookingId + " for " + customerName + " has been confirmed.");
    }

    public void updateGuests(int newGuests) {
        if (newGuests <= 0) {
            System.out.println("Update failed: Guest count must be at least 1.");
            return;
        }
        this.numberOfGuests = newGuests;
        System.out.println("Booking " + bookingId + " guest count updated to " + numberOfGuests + ".");
    }

    public void displayDetails() {
        System.out.println("Booking [" + bookingId + "] | Guest: " + customerName + " | Total: $" + amount + " | Guests: " + numberOfGuests + " | Confirmed: " + isConfirmed);
    }
}

public class BookingExD {
    public static void main(String[] args) {
        System.out.println("--- Demonstrating Valid Actions ---");
        ProjectBooking b1 = new ProjectBooking("BK-501", "Emma Watson", 240.0, 2);
        b1.displayDetails();
        b1.confirmBooking();
        b1.updateGuests(4);
        b1.displayDetails();

        System.out.println("\n--- Demonstrating Invalid Actions & Validation ---");
        b1.updateGuests(0);

        try {
            ProjectBooking invalidBooking = new ProjectBooking("BK-502", "Invalid User", -50.0, 1);
        } catch (IllegalArgumentException e) {
            System.out.println("Caught Expected Exception: " + e.getMessage());
        }
    }
}
