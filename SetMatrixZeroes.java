import java.util.Scanner;

class SetMatrixZeroes {
    public void setMatrixZeroes(int[][] arr) {
        int col1 = 1;
        int row = arr.length;
        int col = arr[0].length;

        for (int i = 0; i < row; i++) {
            if (arr[i][0] == 0) {
                col1 = 0;
            }
            for (int j = 1; j < col; j++) {
                if (arr[i][j] == 0) {
                    arr[i][0] = 0;
                    arr[0][j] = 0;
                }
            }
        }

        for (int i = 1; i < row; i++) {
            for (int j = 1; j < col; j++) {
                if (arr[i][0] == 0 || arr[0][j] == 0) {
                    arr[i][j] = 0;
                }
            }
        }

        if (arr[0][0] == 0) {
            for (int j = 1; j < col; j++) {
                arr[0][j] = 0;
            }
        }

        if (col1 == 0) {
            for (int i = 0; i < row; i++) {
                arr[i][0] = 0;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows and columns: ");
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        int[][] arr = new int[rows][cols];

        System.out.println("Enter matrix elements:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        SetMatrixZeroes obj = new SetMatrixZeroes();
        obj.setMatrixZeroes(arr);

        System.out.println("Matrix after setting zeroes:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
