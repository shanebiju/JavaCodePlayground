import java.util.*;

public class RotateMatrix {
    public void rotate(int[][] matrix) {
        int row = matrix.length;
        int column = row;
        for (int i = 0; i < row; i++) {
            for (int j = i + 1; j < column; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        for (int i = 0; i < row; i++) {
            int m = 0;
            int n = column - 1;
            while (m < n) {
                int temp = matrix[i][m];
                matrix[i][m] = matrix[i][n];
                matrix[i][n] = temp;
                m++;
                n--;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the matrix:");
        int n = sc.nextInt();
        int[][] matrix = new int[n][n];
        
        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        
        RotateMatrix sol = new RotateMatrix();
        sol.rotate(matrix);
        
        System.out.println("Rotated Matrix:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        
        sc.close();
    }
}
