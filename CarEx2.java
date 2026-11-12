class Car {
    String brand;
    String model;
    int speed = 0; 

    void accelerate() {
        speed += 10;
    }

    void displayInfo() {
        System.out.println("Car: " + brand + " " + model + " | Current Speed: " + speed + " km/h");
    }
}

public class CarEx2 {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.brand = "Toyota";
        car1.model = "Corolla";

        Car car2 = new Car();
        car2.brand = "Honda";
        car2.model = "Civic";

        car1.accelerate();
        car1.accelerate();

        car2.accelerate();
        car2.accelerate();
        car2.accelerate();
        car2.accelerate();

        System.out.println("--- Car Details ---");
        car1.displayInfo();
        car2.displayInfo();
    }
}
