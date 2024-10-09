import java.util.Scanner;

class MajorityElement {

    public int majorityElement(int[] nums) {
        int element = nums[0];
        int cnt = 0;
        for (int num : nums) {
            if (cnt == 0) {
                element = num;
                cnt = 1;
            } else if (element == num) {
                cnt++;
            } else {
                cnt--;
            }
        }
        return element;
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

        MajorityElement solution = new MajorityElement();
        int result = solution.majorityElement(nums);
        
        System.out.println("The majority element is: " + result);

        sc.close();
    }
}
