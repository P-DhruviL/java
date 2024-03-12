// Parent class
class A {
    void display() {
        System.out.println("This is class A");
    }
}

// Child class inheriting from class A
class B extends A {
    public static void main(String[] args) {
        B obj = new B();
        obj.display();
    }
}
