import java.util.*;

class PairWithMaxSum {
    // Function to find pair with maximum sum
    public int pairWithMaxSum(List<Integer> arr) {
        int maxSum = arr.get(0) + arr.get(1);
        for (int i = 0; i < arr.size() - 1; i++) {
            maxSum = Math.max(maxSum, arr.get(i) + arr.get(i + 1));
        }
        return maxSum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the number of elements in the list:");
        int n = sc.nextInt();
        
        List<Integer> arr = new ArrayList<>();
        System.out.println("Enter the elements of the list:");
        for (int i = 0; i < n; i++) {
            arr.add(sc.nextInt());
        }
        
        PairWithMaxSum solution = new PairWithMaxSum();
        int result = solution.pairWithMaxSum(arr);
        
        System.out.println("Pair with maximum sum is: " + result);
        
        sc.close();
    }
}
