import java.util.HashMap;
import java.util.Scanner;

class TwoSum {
    
    public boolean twoSum(int arr[], int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(target - arr[i])) {
                return true;
            }
            map.put(arr[i], i);
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the number of elements:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        System.out.println("Enter the target sum:");
        int target = sc.nextInt();

        TwoSum solution = new TwoSum();
        boolean result = solution.twoSum(arr, target);
        
        System.out.println("Is there a pair that sums to the target? " + result);
        
        sc.close();
    }
}
