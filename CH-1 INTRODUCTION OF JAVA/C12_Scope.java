public class C12_Scope
{
    static int a = 10;  // class level but only for static level control 
    int b = 30;         // class level,accessible by all, but not for static,that is Instance-level Variables any method or function
    
    void display()
    {
        int d = 40; // Local variable for the display method
        System.out.println(d);
        System.out.println(b);
      
    }

    public static void main(String[] args) {
        // Creating an object of scope
        C12_Scope s1 = new C12_Scope();
        System.out.println(a);
        s1.display();
    }
}

