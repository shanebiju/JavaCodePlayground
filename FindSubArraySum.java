import java.util.HashMap;
import java.util.Scanner;

class FindSubArraySum {

    public int findSubArraySum(int k, int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int currSum = 0;
        int count = 0;
        for (int num : arr) {
            currSum += num;
            if (currSum == k) {
                count++;
            }
            if (map.containsKey(currSum - k)) {
                count += map.get(currSum - k);
            }
            map.put(currSum, map.getOrDefault(currSum, 0) + 1);
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        FindSubArraySum solution = new FindSubArraySum();

        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter the value of k: ");
        int k = sc.nextInt();

        int result = solution.findSubArraySum(k, arr);
        System.out.println("The count of subarrays with sum " + k + " is: " + result);
        sc.close();
    }
}
