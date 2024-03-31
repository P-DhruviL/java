public class C23_This  
{
    
    int rollno;  
    String name;

    /* C23_This(int rollno, String name) 
    {
     rollno=rollno;
     name=name;
 
          // outpout 0 null  
    }*/ 

    C23_This(int rollno, String name) // when same name of var and arg_name then we use this keyword 
    {
     this.rollno=rollno;
     this.name=name;
 
    } // acutall 7150,dhruv

    @SuppressWarnings("unused") // if you dont use object it will give warning but still it can complie so in oder to remove warning statment we use this statement
    public static void main(String args[])
     {    
        C23_This t1 = new C23_This(7150, "dhruv");
        System.out.println(t1.rollno + " "); // " \n " both ae same
        System.out.println(t1.name + " ");
    //---------------------------------------------------------------------
             A b=new A();  // own with to parameterized constructor
             A a=new A(10); // own with defualt constructor
              
        }  
}
//--------------------------
class A
{  
    A()
    {
        this(25, 25);    // Calling parameterized constructor from default constructor: 
        System.out.println(" this is defulat constructor");
    } 

    A(int x)  // Calling default constructor from parameterized constructor: 
    {  
    this();
    System.out.println(x); 
    System.out.println("this is single parameterized constructor"); 

    // this();   // Rule: Call to this() must be the first statement in constructor.
    } 
    A(int x, int y)
    {
        System.out.println("this is two parameterized constructor"); 
        System.out.println(x); 
        System.out.println(y);   
    }            
}   
