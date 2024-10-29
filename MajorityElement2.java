import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class MajorityElement2 {
    // Function to find the majority elements in the array
    public List<Integer> findMajority(List<Integer> nums) {
        List<Integer> sol = new ArrayList<>();
        int n = nums.size();
        int count1 = 0, count2 = 0;
        int element1 = -1, element2 = -1;

        // Finding potential candidates for majority elements
        for (Integer num : nums) {
            if (count1 == 0 && num != element2) {
                count1++;
                element1 = num;
            } else if (count2 == 0 && num != element1) {
                count2++;
                element2 = num;
            } else if (element1 == num) {
                count1++;
            } else if (element2 == num) {
                count2++;
            } else {
                count1--;
                count2--;
            }
        }

        // Verifying if the candidates are majority elements
        count1 = 0;
        count2 = 0;
        for (Integer num : nums) {
            if (num == element1) {
                count1++;
            } else if (num == element2) {
                count2++;
            }
        }

        if (count1 > n / 3) {
            sol.add(element1);
        }
        if (count2 > n / 3) {
            sol.add(element2);
        }
        if (sol.isEmpty()) {
            sol.add(-1);
        }
        
        return sol;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MajorityElement2 solution = new MajorityElement2();

        // Input list of integers
        System.out.println("Enter the number of elements:");
        int n = scanner.nextInt();
        List<Integer> nums = new ArrayList<>();

        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            nums.add(scanner.nextInt());
        }

        // Find and print the majority elements
        List<Integer> result = solution.findMajority(nums);
        System.out.println("Majority elements (if any): " + result);
        
        scanner.close();
    }
}
