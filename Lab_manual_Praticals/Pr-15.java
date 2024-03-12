// Parent class
class A {
    void displayA() {
        System.out.println("This is class A");
    }
}

// Child class inheriting from class A
class B extends A {
    void displayB() {
        System.out.println("This is class B");
    }
}

// Grandchild class inheriting from class B
class C extends B {
    public static void main(String[] args) {
        C obj = new C();
        obj.displayA(); // Accessing method from class A
        obj.displayB(); // Accessing method from class B
    }
}
