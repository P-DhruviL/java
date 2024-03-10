
public class OPRATORS
{
   static int a = 10;
   static int b = 5;
   static  int c = 10;
   static int d = 7;    
   static int k = 9;
   
    public static void main(String[] args)
    {

        // Arithmetic Operators
        int addition = a + b;
        int subtraction = a - b;
        int multiplication = a * b;
        int division = a / b;
        int modulus = a % b;
        int aIncrement = k++; // Increment a
        int bDecrement = d--; // Decrement b

        // Bitwise Operators
        int bitwiseAnd = a & b;
        int bitwiseOr = a | b;
        int bitwiseXor = a ^ b;
        int bitwiseComplementA = ~a;
        int leftShift = a << 1;
        int rightShift = a >> 1;

        // Relational Operators
        boolean isEqual = a == c;
        boolean isNotEqual = a != b;
        boolean isGreaterThan = a > b;
        boolean isLessThan = b < c;
        boolean isGreaterOrEqual = a >= c;
        boolean isLessOrEqual = b <= c;

        // Logical Operators
        boolean logicalAnd = (a > b) && (b < c);
        boolean logicalOr = (a > b) || (b == c);
        boolean logicalNot = !(a == c);

        // Assignment Operators
        a += 5; // Equivalent to a = a + 5
        b -= 3; // Equivalent to b = b - 3
        c *= 2; // Equivalent to c = c * 2
        c /= 4; // Equivalent to c = c / 4
        c %= 3; // Equivalent to c = c % 3

        // Conditional Operator (Ternary Operator)
        int max = (a > b) ? a : b;

        // Displaying Results
        System.out.println("Arithmetic: " + addition + ", " + subtraction + ", " + multiplication + ", " + division + ",  " + modulus);
        System.out.println("Bitwise: " + bitwiseAnd + ", " + bitwiseOr + ", " + bitwiseXor + ", " + bitwiseComplementA + ", " + leftShift + ", " + rightShift);
        System.out.println("Relational: " + isEqual + ", " + isNotEqual + ", " + isGreaterThan + ", " + isLessThan + ", " + isGreaterOrEqual + ", " + isLessOrEqual);
        System.out.println("Logical: " + logicalAnd + ", " + logicalOr + ", " + logicalNot);
        System.out.println("Assignment: a=" + a + ", b=" + b + ", c=" + c);
        System.out.println("Conditional: Max value is " + max);
        System.out.println("a increament: "+ aIncrement  + "\n" + "b decrement: " + bDecrement);
        System.out.println("----------------------------------------------------");

        // Displaying Results in Table Format
        System.out.println("--------------------------------------------------------");
        System.out.printf("| %-20s | %-20s | %-20s |\n", "Arithmetic", "Bitwise", "Relational");
        System.out.println("--------------------------------------------------------");
        System.out.printf("| %-20s | %-20s | %-20s |\n", addition, bitwiseAnd, isEqual);
        System.out.printf("| %-20s | %-20s | %-20s |\n", subtraction, bitwiseOr, isNotEqual);
        System.out.printf("| %-20s | %-20s | %-20s |\n", multiplication, bitwiseXor, isGreaterThan);
        System.out.printf("| %-20s | %-20s | %-20s |\n", division, bitwiseComplementA, isLessThan);
        System.out.printf("+ %-20s | %-20s | %-20s |\n", "++a", rightShift, isLessOrEqual);
        System.out.println("--------------------------------------------------------");

        // Displaying Logical and Assignment Operators
        System.out.printf("| %-20s | %-20s |\n", "Logical", "Assignment");
        System.out.println("--------------------------------------------------------");
        System.out.printf("| %-20s | %-20s |\n", logicalAnd, "a += 5");
        System.out.printf("| %-20s | %-20s |\n", logicalOr, "b -= 3");
        System.out.printf("| %-20s | %-20s |\n", logicalNot, "c *= 2");
        System.out.println("--------------------------------------------------------");

        // Displaying Conditional Operator Result
        System.out.println("Conditional: Max value is " + max);
    }
}
