import java.util.Arrays;
import java.util.Scanner;

class MeetingRooms {
    static boolean canAttend(int[][] arr) {
        Arrays.sort(arr, (a, b) -> Integer.compare(a[0], b[0]));
        int length = arr.length;
        int i = 0;
        while (i < length - 1) {
            if (arr[i][1] > arr[i + 1][0]) {
                return false;
            }
            i++;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of intervals: ");
        int n = scanner.nextInt();
        int[][] intervals = new int[n][2];
        
        for (int i = 0; i < n; i++) {
            System.out.print("Enter start and end time for interval " + (i + 1) + ": ");
            intervals[i][0] = scanner.nextInt();
            intervals[i][1] = scanner.nextInt();
        }
        
        boolean result = canAttend(intervals);
        System.out.println("Can attend all intervals: " + result);
        scanner.close();
    }
}
