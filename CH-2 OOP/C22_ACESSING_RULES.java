public class C22_ACESSING_RULES
{

    public static void main(String[] args) 
    {
    	 A a1 = new A();
         a1.main();
       
        C.sum();  // static 
   
      // abstrac and final  
        D d1 = new D();
        d1.displayD();
        
        F f1 = new F();
        f1.displayE();
    

 
    }
}

class A {
    protected int a1=15;
    protected int b1=1;
    private int sum=0;
    private int a=5;
    private int b=1;

  
    private void displayA() {
        System.out.println("This is display A");
        sum=a+b;
        System.out.println("sum="+ sum);
        
    }
    void main()
    {
    	A a1 = new A();
    	a1.displayA();
    	 B b1 = new B();  
         b1.displayB();
    }
}

class B extends A {

    public void displayB() {
        System.out.println("This is display B");
        int sum =a1+b1;
        System.out.println("sum=" + sum);
    }
}
 class C {
	 static private int s1=26;
	 static private int s2=1;
	 static public int sum=0;
	  static void sum()
	  {
		  sum=s1+s2;
		  System.out.println("Static sum= "+ sum);
	  
	  }
 }
 
 final class D {
	    void displayD() {
	        System.out.println("This is class D");
	    }
	}
 
 
 abstract class E {
	    // Abstract method without a body
	    abstract void displayE();
	}
  
 class  F extends E {
	    // Implementation of the abstract method from the superclass
	    void displayE() 
	    {
	        System.out.println("This is class F WITH EXTENDS E");
	    
	    }
	 
	    
	    
	}
 