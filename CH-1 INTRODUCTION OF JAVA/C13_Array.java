public class C13_Array {
    public static void main(String[] args) 
    {
        ArrayDemo(); 

        int[][] m1 = { { 2, 2, 2 },
                       { 2, 2, 2 },
                       { 2, 2, 2 }
        };
        int[][] m2 = { { 2, 2, 2 },
                       { 2, 2, 2 },
                       { 2, 2, 2 }
        };

        int[][] sum = addMatrices(m1, m2);

        System.out.println("\n" + "Matrix 1:");
        printMatrix(m1);

        System.out.println("Matrix 2:");
        printMatrix(m2);

        System.out.println("Sum of the matrices:");
        printMatrix(sum);
    }

    public static void ArrayDemo() 
    {

        int[] Arrayx = { 10, 14, 17 };   
        String[] Arrayn = { "Hello", "World" };

        System.out.println("Integer Array:");   
        for (int i : Arrayx) // (array's datatype + variable(custom) : array name)
        {
            System.out.print(i + " ");
        } 
        
        System.out.println("\nString Array:");
        for (String s : Arrayn) // (array's datatype + variable(custom) : array name)
        {
            System.out.print(s + " ");
        }
    
    }

    
    public static int[][] addMatrices(int[][] m1, int[][] m2)
     {
        int[][] result = new int[m1.length][m1[0].length];
        for (int i = 0; i < m1.length; i++)
         {
            for (int j = 0; j < m1[0].length; j++) 
            {
                result[i][j] = m1[i][j] + m2[i][j];
            }
        }
        return result;
    }

    public static void printMatrix(int[][] matrix) 
    {
        for (int i = 0; i < matrix.length; i++) 
        {
            for (int j = 0; j < matrix[0].length; j++) 
            {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
// Array demonstrating


  

