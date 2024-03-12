public class Person {
    private String name;
    private int age;

    // Constructor
    public Person(String name, int age) {
        this.name = name;  // "this" keyword is used to refer to the instance variable
        this.age = age;    // "this" keyword is used to refer to the instance variable
    }

    // Method to display information about the person
    public void displayInfo() {
        System.out.println("Name: " + this.name);  // "this" keyword is used to refer to the instance variable
        System.out.println("Age: " + this.age);    // "this" keyword is used to refer to the instance variable
    }

    // Method to update age
    public void updateAge(int age) {
        this.age = age;  // "this" keyword is used to refer to the instance variable
    }

    public static void main(String[] args) {
        Person person1 = new Person("John", 30);
        Person person2 = new Person("Alice", 25);

        person1.displayInfo();
        person2.displayInfo();

        person1.updateAge(35);
        System.out.println("After updating age for person1:");
        person1.displayInfo();
    }
}
