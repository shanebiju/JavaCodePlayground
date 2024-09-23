import java.util.Scanner;

public class NextPermutation {
    
    public void reverseArray(int[] nums, int l, int r) {
        while (l < r) {
            int temp = nums[l];
            nums[l] = nums[r];
            nums[r] = temp;
            l += 1;
            r -= 1;
        }
    }
    
    public void computeNextPermutation(int[] nums) {
        int idx = -1;
        for (int i = nums.length - 2; i >= 0; i--) {
            if (nums[i] < nums[i + 1]) {
                idx = i;
                break;
            }
        }
        if (idx == -1) {
            reverseArray(nums, 0, nums.length - 1);
        } else {
            int minimum = idx + 1;
            for (int i = idx + 1; i < nums.length; i++) {
                if (nums[minimum] >= nums[i] && nums[idx] < nums[i] && nums[i] != 0) {
                    minimum = i;
                }
            }
            int temp = nums[idx];
            nums[idx] = nums[minimum];
            nums[minimum] = temp;
            reverseArray(nums, idx + 1, nums.length - 1);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        int[] nums = new int[size];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            nums[i] = scanner.nextInt();
        }
        
        NextPermutation np = new NextPermutation();
        np.computeNextPermutation(nums);

        System.out.println("Next permutation:");
        for (int num : nums) {
            System.out.print(num + " ");
        }
        scanner.close();
    }
}
