class Car extends Vehicle {
    private int doors;

    public Car(String name, int year, int doors) {
        super(name, year); // Call the base class constructor using super
        this.doors = doors;
    }


 
    public void start() {
        super.start(); // Use super to access the base class start method
        System.out.println("Car with " + doors + " doors is starting.");
    }
}