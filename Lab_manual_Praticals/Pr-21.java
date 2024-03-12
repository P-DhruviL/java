// Final class
final class FinalClass {
    void display() {
        System.out.println("This is a final class.");
    }
}

// Trying to inherit from FinalClass will result in a compilation error
// class SubClass extends FinalClass {} 

public class FinalClassDemo {
    public static void main(String[] args) {
        // Creating an instance of FinalClass
        FinalClass finalObj = new FinalClass();
        // Calling display method of FinalClass
        finalObj.display();
    }
}
. 
