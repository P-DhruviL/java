public class StaticDemo {
    // Static variable
    static int count = 0;

    // Static method
    static void incrementCount() {
        count++;
    }

    public static void main(String[] args) {
        // Accessing static variable and method using class name
        System.out.println("Initial value of count: " + StaticDemo.count);
        StaticDemo.incrementCount();
        System.out.println("Value of count after increment: " + StaticDemo.count);
    }
}
