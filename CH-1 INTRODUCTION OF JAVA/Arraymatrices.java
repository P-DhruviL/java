public class Arraymatrices {
    public static void main(String[] args) {
        int[][] m1 = { { 2, 2, 2 }, { 3, 4, 5 }, { 7, 8, 9 } };
        int[][] m2 = { { 1, 2, 3 }, { 6, 7, 8 }, { 1, 1, 2 } };

        int[][] sum = addMatrices(m1, m2);

        System.out.println("Matrix 1:");
        printMatrix(m1);

        System.out.println("Matrix 2:");
        printMatrix(m2);

        System.out.println("Sum of the matrices:");
        printMatrix(sum);
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
