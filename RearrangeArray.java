import java.util.Scanner;

public class RearrangeArray {
    
    public int[] rearrangeArray(int[] nums) {
        int positivePos = 0;
        int negativePos = 1;
        if (nums.length == 0) {
            return nums;
        }
        int[] sol = new int[nums.length];
        for (int num : nums) {
            if (num >= 0) {
                sol[positivePos] = num;
                positivePos += 2;
            } else {
                sol[negativePos] = num;
                negativePos += 2;
            }
        }
        return sol;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();
        int[] nums = new int[n];
        
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        
        RearrangeArray obj = new RearrangeArray();
        int[] result = obj.rearrangeArray(nums);
        
        System.out.println("Rearranged array:");
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
        sc.close();
    }
}
