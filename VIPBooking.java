public class VIPBooking extends ProjectBooking {
    private double discountRate; // e.g., 0.15 for 15% discount

    public VIPBooking(String bookingId, String customerName, double amount, double discountRate) {
        super(bookingId, customerName, amount);
        if (discountRate < 0 || discountRate > 1.0) {
            throw new IllegalArgumentException("Discount rate must be between 0.0 and 1.0.");
        }
        this.discountRate = discountRate;
    }

    public double getDiscountedAmount() {
        return getAmount() * (1 - discountRate);
    }

    @Override
    public void displaySummary() {
        System.out.println("[VIP BOOKING]");
        super.displaySummary();
        System.out.println("VIP Discount: " + (discountRate * 100) + "% | Final Price: $" + getDiscountedAmount());
    }
}
