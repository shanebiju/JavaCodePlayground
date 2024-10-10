import java.util.Scanner;

class MaxSubArray {
    public int maxSubArray(int[] nums) {
        int prefixSum = 0;
        int sol = Integer.MIN_VALUE;
        for (int num : nums) {
            prefixSum += num;
            sol = Math.max(sol, prefixSum);
            if (prefixSum < 0) {
                prefixSum = 0;
            }
        }
        return sol;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the number of elements:");
        int n = sc.nextInt();
        
        int[] nums = new int[n];
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        MaxSubArray solution = new MaxSubArray();
        System.out.println("Maximum subarray sum is: " + solution.maxSubArray(nums));

        sc.close();
    }
}
