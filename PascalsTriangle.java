import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class PascalsTriangle {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> sol = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            int prev = 1;
            int numerator = i;
            int denominator = 1;
            List<Integer> row = new ArrayList<>();
            for (int j = 0; j <= i; j++) {
                if (j == 0) {
                    row.add(1);
                } else {
                    int num = (prev * numerator) / denominator;
                    row.add(num);
                    prev = num;
                    numerator--;
                    denominator++;
                }
            }
            sol.add(row);
        }
        return sol;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows for Pascal's Triangle: ");
        int numRows = scanner.nextInt(); // Read input from user
        PascalsTriangle solution = new PascalsTriangle();
        List<List<Integer>> result = solution.generate(numRows);
        System.out.println(result);
        scanner.close();
    }
}
