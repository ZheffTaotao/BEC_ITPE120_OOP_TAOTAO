class Car extends Vehicle {
    private int year;

    // Parameterized constructor in the derived class
    public Car(String brand, int year) {
        // Use super to call the base class constructor
        super(brand);
        this.year = year;
    }

    // Override the start method from the base class
    @Override
    public void start() {
        System.out.println("Car is starting.");
    }

    // Access a base class method using super
    public void displayCarInfo() {
        super.displayBrand();
        System.out.println("Year: " + year);
    }
}