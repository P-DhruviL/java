public class Car {
    private int topSpeed;
    private String name;

    // Constructor to initialize topSpeed and name
    public Car(int topSpeed, String name) {
        this.topSpeed = topSpeed;
        this.name = name;
    }

    // Override toString() method to print car details
    @Override
    public String toString() {
        return "Car{" +
                "topSpeed=" + topSpeed +
                ", name='" + name + '\'' +
                '}';
    }

    public static void main(String[] args) {
        // Creating 5 instances of Car class
        Car car1 = new Car(200, "Toyota");
        Car car2 = new Car(220, "Honda");
        Car car3 = new Car(180, "Ford");
        Car car4 = new Car(240, "BMW");
        Car car5 = new Car(190, "Tesla");

        // Printing the instances of Car class
        System.out.println("Car 1: " + car1);
        System.out.println("Car 2: " + car2);
        System.out.println("Car 3: " + car3);
        System.out.println("Car 4: " + car4);
        System.out.println("Car 5: " + car5);
    }
}
