public class C25_StaticDemo {

    static int a=10;
     int b=5;

    static void aincr(){
        
        a++;
        System.out.println("a: "+ a);


     }
     void binr()
     {
        b++;
        System.out.println("b: "+ b);
     }
public static void main(String args[]) 
{
    aincr();
    aincr();
    aincr();

    C25_StaticDemo s1 = new C25_StaticDemo();
    C25_StaticDemo s2 = new C25_StaticDemo();
    C25_StaticDemo s3 = new C25_StaticDemo();
    
    s1.binr();
    s2.binr();
    s3.binr();

}    

}
