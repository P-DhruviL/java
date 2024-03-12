public class Rectangle {
    private double height;
    private double width;

    // Constructor to initialize height and width
    public Rectangle(double height, double width) {
        this.height = height;
        this.width = width;
    }

    // Getter method for height
    public double getHeight() {
        return height;
    }

    // Getter method for width
    public double getWidth() {
        return width;
    }

    // Method to calculate area of the rectangle
    public double calculateArea() {
        return height * width;
    }

    public static void main(String[] args) {
        // Creating a Rectangle object with height 5 and width 10
        Rectangle rectangle = new Rectangle(5, 10);

        // Printing the height and width of the rectangle
        System.out.println("Height: " + rectangle.getHeight());
        System.out.println("Width: " + rectangle.getWidth());

        // Calculating and printing the area of the rectangle
        System.out.println("Area: " + rectangle.calculateArea());
    }
}

