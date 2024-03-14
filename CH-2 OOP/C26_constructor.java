public class C26_constructor {
    int var1;
    int var2;

    // Default constructor
    C26_constructor() {
        System.out.println("default constructor");
    }

    // Constructor with one parameter
    C26_constructor(int x) {
        var1 = x;
    }

    // Constructor with two parameters
    C26_constructor(int x, int y) {
        var1 = x;
        var2 = y;
    }

    // Copy constructor
    C26_constructor(C26_constructor v) {
        var1 = v.var1;
        var2 = v.var2;
    }

    // Method to display values
    void display() {
        System.out.println(var1);
        System.out.println(var2);
    }

    public static void main(String args[]) {
      
        C26_constructor c1 = new C26_constructor(25, 60);
        C26_constructor c2 = new C26_constructor(c1); // Using copy constructor
     // Using copy constructor
        
        c1.display();
        c2.display();
    
    }
}
