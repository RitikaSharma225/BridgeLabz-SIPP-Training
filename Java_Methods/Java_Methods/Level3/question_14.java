import java.util.*;

public class question_14 {

    public static int[][] generateRandomMatrix(int rows, int cols) {
        int[][] matrix = new int[rows][cols];
        Random rand = new Random();
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                matrix[i][j] = rand.nextInt(10); // Random 0-9
        return matrix;
    }

    public static int[][] addMatrices(int[][] A, int[][] B) {
        int rows = A.length;
        int cols = A[0].length;
        int[][] sum = new int[rows][cols];
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                sum[i][j] = A[i][j] + B[i][j];
        return sum;
    }

    public static int[][] subtractMatrices(int[][] A, int[][] B) {
        int rows = A.length;
        int cols = A[0].length;
        int[][] diff = new int[rows][cols];
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                diff[i][j] = A[i][j] - B[i][j];
        return diff;
    }

    public static int[][] multiplyMatrices(int[][] A, int[][] B) {
        int rowsA = A.length;
        int colsA = A[0].length;
        int colsB = B[0].length;
        int[][] product = new int[rowsA][colsB];
        for (int i = 0; i < rowsA; i++)
            for (int j = 0; j < colsB; j++)
                for (int k = 0; k < colsA; k++)
                    product[i][j] += A[i][k] * B[k][j];
        return product;
    }

    public static void displayMatrix(int[][] matrix, String title) {
        System.out.println(title);
        for (int[] row : matrix) {
            for (int val : row)
                System.out.print(val + "\t");
            System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter rows and columns for Matrix A: ");
        int rowsA = sc.nextInt();
        int colsA = sc.nextInt();
        System.out.print("Enter rows and columns for Matrix B: ");
        int rowsB = sc.nextInt();
        int colsB = sc.nextInt();

        if (rowsA != rowsB || colsA != colsB)
            System.out.println("Addition/Subtraction not possible due to dimension mismatch");

        int[][] A = generateRandomMatrix(rowsA, colsA);
        int[][] B = generateRandomMatrix(rowsB, colsB);

        displayMatrix(A, "Matrix A:");
        displayMatrix(B, "Matrix B:");

        if (rowsA == rowsB && colsA == colsB) {
            displayMatrix(addMatrices(A, B), "Addition Result:");
            displayMatrix(subtractMatrices(A, B), "Subtraction Result:");
        }

        if (colsA == rowsB) {
            displayMatrix(multiplyMatrices(A, B), "Multiplication Result (A x B):");
        } else {
            System.out.println("Multiplication not possible due to dimension mismatch");
        }

        sc.close();
    }
}
