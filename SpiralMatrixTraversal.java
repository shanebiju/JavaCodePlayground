import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SpiralMatrixTraversal {
    public List<Integer> spiralOrder(int[][] matrix) {
        int t = 0;
        int b = matrix.length - 1;
        int l = 0;
        int r = matrix[0].length - 1;
        List<Integer> list = new ArrayList<>();
        
        while (l <= r && t <= b) {
            for (int i = l; i <= r; i++) {
                list.add(matrix[t][i]);
            }
            t++;

            for (int i = t; i <= b; i++) {
                list.add(matrix[i][r]);
            }
            r--;

            if (t <= b) {
                for (int i = r; i >= l; i--) {
                    list.add(matrix[b][i]);
                }
                b--;
            }

            if (l <= r) {
                for (int i = b; i >= t; i--) {
                    list.add(matrix[i][l]);
                }
                l++;
            }
        }
        return list;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();
        System.out.print("Enter the number of columns: ");
        int cols = scanner.nextInt();
        
        int[][] matrix = new int[rows][cols];
        System.out.println("Enter the matrix elements:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }
        
        SpiralMatrixTraversal solution = new SpiralMatrixTraversal();
        List<Integer> result = solution.spiralOrder(matrix);
        
        System.out.println("Spiral Order:");
        for (int num : result) {
            System.out.print(num + " ");
        }
        
        scanner.close();
    }
}
