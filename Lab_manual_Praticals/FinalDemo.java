final public class FinalDemo {
    final int x = 10; // cant be change once declare
    final int y = 20; // cant be change once declare
   
    final void sum(){
        int sum=x+y;
        System.out.println("sum: "+ sum);
    }
    public static void main(String[] args) 
    {
        FinalDemo f1 = new FinalDemo();
        f1.sum();  
    }
    
}

class A // cant be inheritate class FinalDemo
{
  // final method cant be overridden by subclasses.
}
