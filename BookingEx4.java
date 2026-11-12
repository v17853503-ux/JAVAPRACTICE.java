class Booking {
    String bookingId;
    String customerName;
    double amount;
    boolean isConfirmed = false;

    void confirmBooking() {
        isConfirmed = true;
        System.out.println("Booking " + bookingId + " has been confirmed.");
    }

    void displayBookingDetails() {
        System.out.println("ID: " + bookingId + " | Customer: " + customerName + " | Amount: $" + amount + " | Confirmed: " + isConfirmed);
    }
}

public class BookingEx4 {
    public static void main(String[] args) {
        Booking booking1 = new Booking();
        booking1.bookingId = "B001";
        booking1.customerName = "Sarah Connor";
        booking1.amount = 150.00;

        Booking booking2 = new Booking();
        booking2.bookingId = "B002";
        booking2.customerName = "John Doe";
        booking2.amount = 300.50;

        booking1.confirmBooking();
        
        System.out.println("\n--- Booking Summary ---");
        booking1.displayBookingDetails();
        booking2.displayBookingDetails();
    }
}
