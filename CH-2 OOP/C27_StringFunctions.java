public class C27_StringFunctions
 {
   
        public static void main(String[] args)
         {
            // Define a sample string
            String str = "Hello, World!";
    
            // Demonstrate charAt
            char charAt = str.charAt(4);
            System.out.println("Character at index 4: " + charAt);
    
            // Demonstrate contains
            boolean contain = str.contains("World");
            System.out.println("string contain : " + contain);
    
            // Demonstrate format
            String f1 = String.format("Value of pi: %.2f", Math.PI);
            System.out.println("Formatted String: " + f1);
    
            // Demonstrate length
            int l1 = str.length();
            System.out.println("Length of the string: " + l1);
    
            // Demonstrate split
            String[] splitArray = str.split(" ");
            System.out.println("Splitting the string:");
            for (String s : splitArray) 
            {
                System.out.println(s.trim());
            }
        }
}
