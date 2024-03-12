// Parent class
class A {
    void display() {
        System.out.println("This is class A");
    }
}

// Child class 1 inheriting from class A
class B extends A {
    void displayB() {
        System.out.println("This is class B");
    }
}

// Child class 2 inheriting from class A
class C extends A {
    void displayC() {
        System.out.println("This is class C");
    }
}

// Main method to demonstrate hierarchical inheritance
class Main {
    public static void main(String[] args) {
        B objB = new B();
        objB.display(); // Accessing method from class A through object of class B

        C objC = new C();
        objC.display(); // Accessing method from class A through object of class C
    }
}
