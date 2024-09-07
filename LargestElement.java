import java.util.Scanner;

public class LargestElement {
    public static int largest(int[] arr) {
        int length = arr.length;
        int largest = arr[0];
        for (int i = 1; i < length; i++) {
            if (largest < arr[i]) {
                largest = arr[i];
            }
        }
        return largest;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of elements in the array:");
        int n = scanner.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        int result = largest(arr);
        System.out.println("The largest element in the array is: " + result);
        scanner.close();
    }
}
