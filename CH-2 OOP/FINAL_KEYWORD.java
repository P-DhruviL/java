
public class FINAL_KEYWORD {

	public static void main(String[] args) {
		K f1 = new K();
	
		f1.fsum();

	}

}
class P // we can't do class E extends f
{
		protected int e2=1;
		protected int e1=1;	
}
final class K extends P
{
    void fsum() 
    {
	   final int f1=100;
	   final int f2=10;
	   final int sumf;
	   sumf=f1+f2;
	   System.out.println("fsum="+ sumf);
		System.out.println("esum="+(e1+e2));
     }
}

/*  class J extends K
{
	
	 void displayA()
		{
			System.out.println("hello");
		}
}
*/


