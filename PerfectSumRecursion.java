import java.util.Scanner;

class PerfectSumRecursion {
    int count = 0;

    public void subset(int idx, int arr[], int sum, int length, int currSum) {
        if (idx == length) {
            if (currSum == sum) {
                count += 1;
            }
            return;
        }

        subset(idx + 1, arr, sum, length, currSum);
        subset(idx + 1, arr, sum, length, currSum + arr[idx]);
    }

    public int perfectSum(int arr[], int n, int sum) {
        subset(0, arr, sum, n, 0);
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the target sum:");
        int sum = sc.nextInt();

        PerfectSumRecursion solution = new PerfectSumRecursion();
        int result = solution.perfectSum(arr, n, sum);

        System.out.println("Number of subsets with the given sum: " + result);
        sc.close();
    }
}
