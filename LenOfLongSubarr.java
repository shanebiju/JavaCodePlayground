import java.util.HashMap;
import java.util.Scanner;

class LenOfLongSubarr {
    public int LenOfLongSubarr(int[] arr, int n, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int prefixSum = 0;
        int maxLength = 0;
        
        for (int i = 0; i < arr.length; i++) {
            prefixSum += arr[i];
            
            if (prefixSum == k) {
                maxLength = Math.max(maxLength, i + 1);
            } else if (map.containsKey(prefixSum - k)) {
                maxLength = Math.max(maxLength, i - map.get(prefixSum - k));
            }
            
            if (!map.containsKey(prefixSum)) {
                map.put(prefixSum, i);
            }
        }
        return maxLength;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int n = sc.nextInt();
        System.out.println("Enter the target sum (k):");
        int k = sc.nextInt();
        
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        LenOfLongSubarr solution = new LenOfLongSubarr();
        int result = solution.LenOfLongSubarr(arr, n, k);
        System.out.println("Length of longest subarray with sum " + k + ": " + result);
        sc.close();
    }
}
