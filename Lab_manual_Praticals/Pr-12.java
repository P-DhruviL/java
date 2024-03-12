public class ConstructorOverloadingDemo {
    private String name;
    private int age;

    // Constructor with no parameters
    public ConstructorOverloadingDemo() {
        name = "Unknown";
        age = 0;
    }

    // Constructor with one parameter
    public ConstructorOverloadingDemo(String name) {
        this.name = name;
        this.age = 0;
    }

    // Constructor with two parameters
    public ConstructorOverloadingDemo(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to display name and age
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {
        // Creating objects using different constructors
        ConstructorOverloadingDemo obj1 = new ConstructorOverloadingDemo();
        ConstructorOverloadingDemo obj2 = new ConstructorOverloadingDemo("John");
        ConstructorOverloadingDemo obj3 = new ConstructorOverloadingDemo("Alice", 25);

        // Displaying information using displayInfo method
        System.out.println("Object 1:");
        obj1.displayInfo();
        System.out.println("Object 2:");
        obj2.displayInfo();
        System.out.println("Object 3:");
        obj3.displayInfo();
    }
}
