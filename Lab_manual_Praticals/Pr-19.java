// Interface for Vehicle
interface Vehicle {
    void drive();
}

// Interface for MusicPlayer
interface MusicPlayer {
    void playMusic();
}

// Class Car implementing both Vehicle and MusicPlayer interfaces
class Car implements Vehicle, MusicPlayer {
    @Override
    public void drive() {
        System.out.println("Car is being driven");
    }

    @Override
    public void playMusic() {
        System.out.println("Music is being played in the car");
    }
}

public class MultipleInheritanceDemo {
    public static void main(String[] args) {
        Car car = new Car();
        car.drive(); // Call drive method from Vehicle interface
        car.playMusic(); // Call playMusic method from MusicPlayer interface
    }
}
