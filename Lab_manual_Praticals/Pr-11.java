public class Shape {
    // Method to calculate the area of a circle
    public float area(float radius) {
        return (float) (Math.PI * radius * radius);
    }

    // Method to calculate the area of a rectangle
    public float area(float length, float width) {
        return length * width;
    }

    public static void main(String[] args) {
        Shape shape = new Shape();

        // Calculate and display area of a circle
        float circleRadius = 5.0f;
        System.out.println("Area of circle with radius " + circleRadius + ": " + shape.area(circleRadius));

        // Calculate and display area of a rectangle
        float rectangleLength = 4.0f;
        float rectangleWidth = 6.0f;
        System.out.println("Area of rectangle with length " + rectangleLength + " and width " + rectangleWidth + ": "
                + shape.area(rectangleLength, rectangleWidth));
    }
}
