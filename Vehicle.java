class Vehicle {
    private String name;
    private int year;

    public Vehicle(String name, int year) {
        this.name = name;
        this.year = year;
    }

    public void start() {
        System.out.println("Vehicle " + name + " is starting.");
    }

    public void stop() {
        System.out.println("Vehicle " + name + " is stopping.");
    }
}




