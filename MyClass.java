public class MyClass {
    private static int instanceCount = 0;

    public MyClass() {
        instanceCount++;
    }

    public static int getInstanceCount() {
        return instanceCount;
    }

    public static void main(String[] args) {
        MyClass obj1 = new MyClass();
        MyClass obj2 = new MyClass();
        MyClass obj3 = new MyClass();


        System.out.println("Number of instances: " + MyClass.getInstanceCount());


        MyClass obj4 = new MyClass();

        System.out.println("Number of instances after creating one more: " + MyClass.getInstanceCount());
    }
}
