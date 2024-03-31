public class Rectangle {
    int height;
    int weight;

    Rectangle(int h, int w)
    {
        height = h;
        weight = w;
        System.out.println("value of height:" + h);
        System.out.println("value of weight:" +w );
        System.out.println("area of retangle:" + ( h*w ));
    }
    @SuppressWarnings("unused")
     public static void main(String[] args) 
     {
        Rectangle r1 = new Rectangle(10, 10);
     }
}
