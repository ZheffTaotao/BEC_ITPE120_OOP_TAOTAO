class Vehicle {
    private String brand;

    // Parameterized constructor in the base class
    public Vehicle(String brand) {
        this.brand = brand;
    }

    public void start() {
        System.out.println("Vehicle is starting.");
    }

    public void displayBrand() {
        System.out.println("Brand: " + brand);
    }
}