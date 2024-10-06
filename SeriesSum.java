import java.util.Scanner;

class SeriesSum {
    public static long seriesSum(int n) {
        return ((long) n * (n + 1)) / 2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n:");
        int n = sc.nextInt();
        long result = seriesSum(n);
        System.out.println("The sum of the series is: " + result);
        sc.close();
    }
}
