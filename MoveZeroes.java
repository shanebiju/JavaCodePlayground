import java.util.Scanner;

public class MoveZeroes {
    public void moveZeroes(int[] nums) {
        int idx = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[idx] = nums[i];
                idx++;
            }
        }
        while (idx < nums.length) {
            nums[idx] = 0;
            idx++;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of elements in the array:");
        int n = scanner.nextInt();
        int[] nums = new int[n];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }

        MoveZeroes solution = new MoveZeroes();
        solution.moveZeroes(nums);

        System.out.println("Array after moving zeroes:");
        for (int num : nums) {
            System.out.print(num + " ");
        }
        scanner.close();
    }
}
