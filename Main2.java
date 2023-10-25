public class Main2 {
    public static void main(String[] args) {
        Car myCar = new Car("Toyota", 2022);

        // Call overridden start method in the derived class
        myCar.start();

        // Access and override base class methods
        myCar.displayCarInfo();
    }
}

