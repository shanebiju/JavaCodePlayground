import java.util.Scanner;

class SingleNumber {

    public int singleNumber(int[] nums) {
        int sol = 0;
        for (int num : nums) {
            sol ^= num;
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

        SingleNumber solution = new SingleNumber();
        int result = solution.singleNumber(nums);
        System.out.println("The single number is: " + result);
        sc.close();
    }
}
