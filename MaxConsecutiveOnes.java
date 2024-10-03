import java.util.Scanner;

class MaxConsecutiveOnes {

    public int findMaxConsecutiveOnes(int[] nums) {
        int count = 0;
        int maxCount = 0;
        for (int num : nums) {
            if (num == 1) {
                count++;
            } else {
                maxCount = Math.max(maxCount, count);
                count = 0;
            }
        }
        maxCount = Math.max(maxCount, count);
        return maxCount;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();

        int[] nums = new int[n];
        System.out.println("Enter the elements of the array (0 or 1):");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        MaxConsecutiveOnes sol=new MaxConsecutiveOnes();
        int result = sol.findMaxConsecutiveOnes(nums);
        System.out.println("Maximum consecutive ones: " + result);
        sc.close();
    }
}
