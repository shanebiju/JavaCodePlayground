import java.util.Scanner;

public class RemoveDuplicates {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();

        int[] nums = new int[n];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        RemoveDuplicates solution = new RemoveDuplicates();
        int result = solution.removeDuplicates(nums);

        System.out.println("The length of the array after removing duplicates is: " + result);

        System.out.println("Array after removing duplicates:");
        for (int i = 0; i < result; i++) {
            System.out.print(nums[i] + " ");
        }
        sc.close();
    }

    public int removeDuplicates(int[] nums) {
        int i = 0;
        int j = 0;
        while (j < nums.length) {
            if (nums[i] != nums[j]) {
                nums[i + 1] = nums[j];
                i++;
            }
            j++;
        }
        return i + 1;
    }
}
