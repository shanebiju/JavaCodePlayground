import java.util.Scanner;

public class CheckArrayRotation {

    public boolean check(int[] nums) {
        if (nums.length == 1) {
            return true;
        }
        int splitPos = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > nums[(i + 1) % nums.length]) {
                splitPos += 1;
            }
        }
        return splitPos <= 1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int size = scanner.nextInt();

        int[] nums = new int[size];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            nums[i] = scanner.nextInt();
        }

        CheckArrayRotation solution = new CheckArrayRotation();
        boolean result = solution.check(nums);
        System.out.println("Is the array sorted and rotated? " + result);
        scanner.close();
    }
}
