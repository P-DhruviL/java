public class FinalDemo {
    // Final variable
    final int MAX_VALUE = 100;

    // Final method
    final void display() {
        System.out.println("This is a final method.");
    }

    public static void main(String[] args) {
        FinalDemo obj = new FinalDemo();
        System.out.println("Maximum value: " + obj.MAX_VALUE);
        obj.display();
    }
}
