// Parent class
class Animal {
    // Method to make sound
    void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

// Child class inheriting from class Animal
class Dog extends Animal {
    // Overriding the makeSound method of the parent class
    @Override
    void makeSound() {
        System.out.println("Dog barks");
    }
}

// Child class inheriting from class Animal
class Cat extends Animal {
    // Overriding the makeSound method of the parent class
    @Override
    void makeSound() {
        System.out.println("Cat meows");
    }
}

public class MethodOverridingDemo {
    public static void main(String[] args) {
        Animal animal1 = new Dog(); // Creating object of Dog class
        animal1.makeSound(); // Calls makeSound method of Dog class

        Animal animal2 = new Cat(); // Creating object of Cat class
        animal2.makeSound(); // Calls makeSound method of Cat class
    }
}
