import java.util.*;

public class MissingNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of elements in the array:");
        int length = sc.nextInt();

        int[] nums = new int[length];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < length; i++) {
            nums[i] = sc.nextInt();
        }

        Solution solution = new Solution();
        int missingNumber = solution.missingNumber(nums);

        System.out.println("The missing number is: " + missingNumber);
        sc.close();
    }
}

class Solution {
    public int missingNumber(int[] nums) {
        int length = nums.length;
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        return ((length * (length + 1)) / 2) - sum;
    }
}
