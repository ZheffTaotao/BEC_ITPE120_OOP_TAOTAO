public class Main {
    public static void main(String[] args) {
        Car myCar = new Car("Toyota", 2022, 4);

        myCar.start(); // Calls the overridden start method in Car
        myCar.stop();  // Calls the base class stop method
    }
}