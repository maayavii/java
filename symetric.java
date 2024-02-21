// Online Java Compiler
// Use this editor to write, compile and run your Java code onlin
import java.util.Scanner;

public class SymmetricMatrixChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();
        System.out.print("Enter the number of columns: ");
        int cols = scanner.nextInt();

        int[][] matrix = new int[rows][cols];

        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        // Check if the matrix is symmetric
        boolean symmetric = isSymmetric(matrix, rows, cols);

        if (symmetric) {
            System.out.println("The matrix is symmetric.");
        } else {
            System.out.println("The matrix is not symmetric.");
            System.out.println("amal manoj");
        System.out.println("21/02/2024");
        }
    }

    // Function to check if the matrix is symmetric
    public static boolean isSymmetric(int[][] matrix, int rows, int cols) {
        if (rows != cols) {
            return false; // If number of rows and columns are not equal, matrix cannot be symmetric
        }

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < i; j++) {
                if (matrix[i][j] != matrix[j][i]) {
                    return false; // If corresponding elements are not equal, matrix is not symmetric
                }
            }
        }
        return true; // If no non-matching elements found, matrix is symmetric
    }
        