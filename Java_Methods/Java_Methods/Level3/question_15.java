import java.util.*;

public class question_15 {

    public static int[][] generateRandomMatrix(int rows, int cols) {
        Random rand = new Random();
        int[][] matrix = new int[rows][cols];
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                matrix[i][j] = rand.nextInt(10); // 0 to 9
        return matrix;
    }

    public static int[][] transpose(int[][] matrix) {
        int rows = matrix.length, cols = matrix[0].length;
        int[][] transposed = new int[cols][rows];
        for (int i = 0; i < cols; i++)
            for (int j = 0; j < rows; j++)
                transposed[i][j] = matrix[j][i];
        return transposed;
    }

    public static int determinant2x2(int[][] m) {
        return m[0][0] * m[1][1] - m[0][1] * m[1][0];
    }

    public static int determinant3x3(int[][] m) {
        int a = m[0][0], b = m[0][1], c = m[0][2];
        int d = m[1][0], e = m[1][1], f = m[1][2];
        int g = m[2][0], h = m[2][1], i = m[2][2];
        return a * (e * i - f * h)
             - b * (d * i - f * g)
             + c * (d * h - e * g);
    }

    public static double[][] inverse2x2(int[][] m) {
        int det = determinant2x2(m);
        if (det == 0) return null;
        double[][] inv = new double[2][2];
        inv[0][0] = m[1][1] / (double) det;
        inv[0][1] = -m[0][1] / (double) det;
        inv[1][0] = -m[1][0] / (double) det;
        inv[1][1] = m[0][0] / (double) det;
        return inv;
    }

    public static double[][] inverse3x3(int[][] m) {
        int det = determinant3x3(m);
        if (det == 0) return null;

        double[][] inv = new double[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                int[][] minor = new int[2][2];
                for (int mi = 0, ii = 0; mi < 3; mi++) {
                    if (mi == i) continue;
                    for (int mj = 0, jj = 0; mj < 3; mj++) {
                        if (mj == j) continue;
                        minor[ii][jj++] = m[mi][mj];
                    }
                    ii++;
                }
                double cofactor = determinant2x2(minor);
                inv[j][i] = Math.pow(-1, i + j) * cofactor / det;
            }
        }
        return inv;
    }

    public static void displayMatrix(int[][] matrix, String label) {
        System.out.println(label);
        for (int[] row : matrix) {
            for (int val : row) System.out.printf("%4d", val);
            System.out.println();
        }
        System.out.println();
    }

    public static void displayMatrix(double[][] matrix, String label) {
        System.out.println(label);
        for (double[] row : matrix) {
            for (double val : row) System.out.printf("%8.3f", val);
            System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1. For 2x2 Matrix");
        System.out.println("2. For 3x3 Matrix");
        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();

        if (choice == 1) {
            int[][] matrix2x2 = generateRandomMatrix(2, 2);
            displayMatrix(matrix2x2, "2x2 Matrix:");
            displayMatrix(transpose(matrix2x2), "Transpose:");
            int det = determinant2x2(matrix2x2);
            System.out.println("Determinant: " + det);
            double[][] inv = inverse2x2(matrix2x2);
            if (inv != null)
                displayMatrix(inv, "Inverse:");
            else
                System.out.println("Inverse not possible (Determinant is 0)");
        } else if (choice == 2) {
            int[][] matrix3x3 = generateRandomMatrix(3, 3);
            displayMatrix(matrix3x3, "3x3 Matrix:");
            displayMatrix(transpose(matrix3x3), "Transpose:");
            int det = determinant3x3(matrix3x3);
            System.out.println("Determinant: " + det);
            double[][] inv = inverse3x3(matrix3x3);
            if (inv != null)
                displayMatrix(inv, "Inverse:");
            else
                System.out.println("Inverse not possible (Determinant is 0)");
        } else {
            System.out.println("Invalid input");
        }

        sc.close();
    }
}
