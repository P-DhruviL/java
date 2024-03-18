public class Shape 
{
    // Method to calculate the area of a circle
     public void area(float radius)
     {
        System.out.println("Area of the circle: " +  (Math.PI * radius * radius));
      
    }
    // Method to calculate the area of a rectangle
    public void area(float length, float width)
     {
        System.out.println("Area of the rectangle: " + (length * width));

    }
    public static void main(String[] args) {
        Shape shape = new Shape();
        shape.area(10);
        shape.area(20,50);
    }
}
