import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

class LongestConseqSubseq {

    public int findLongestConseqSubseq(int[] arr) {
        Set<Integer> set = new HashSet<>();
        int cnt = 1;
        int sol = 1;

        for (int num : arr) {
            set.add(num);
        }

        for (int num : set) {
            int number = num;
            cnt = 1;
            while (set.contains(number - 1)) {
                number--;
                cnt++;
            }
            sol = Math.max(cnt, sol);
        }

        return sol;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        LongestConseqSubseq solution = new LongestConseqSubseq();
        int result = solution.findLongestConseqSubseq(arr);

        System.out.println("Length of longest consecutive subsequence: " + result);
        scanner.close();
    }
}
