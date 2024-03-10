

public class primenum {
    public static void main(String[] args) {
        int n = 5; // Number of prime numbers to find
        int count = 0; // Counter for prime numbers found
        int a = 2; // Start with the first prime number

        System.out.println("First " + n + " prime numbers:");

        while (count < n) {
            int flg = 1; // Flag initialized as 1

            // Change the loop condition to iterate from 2 to a-1
            for (int i = 2; i < a; i++) {
                if (a % i == 0) {
                    flg = 0; // If number is divisible, flag set to 0
                    break;
                }
            }

            if (flg == 1) {
                System.out.print(a + " ");
                count++;
            }
            a++;
        }
    }
}
