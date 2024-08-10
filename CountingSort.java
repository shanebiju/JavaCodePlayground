import java.util.Scanner;

public class CountingSort {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int size = scanner.nextInt();

        int[] numbers = new int[size];
        int[] output = new int[size];

        System.out.println("Enter " + size + " integers:");
        for (int i = 0; i < size; i++) {
            numbers[i] = scanner.nextInt();
        }

        int maximum = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > maximum) {
                maximum = numbers[i];
            }
        }

        int[] cumulativeSum = new int[maximum + 1];

        for (int i = 0; i < cumulativeSum.length; i++) {
            cumulativeSum[i] = 0;
        }
        for (int i = 0; i < numbers.length; i++) {
            cumulativeSum[numbers[i]] = cumulativeSum[numbers[i]] + 1;
        }

        for (int i = 1; i < maximum + 1; i++) {
            cumulativeSum[i] = cumulativeSum[i - 1] + cumulativeSum[i];
        }

        for (int i = size - 1; i >= 0; i--) {
            output[cumulativeSum[numbers[i]] - 1] = numbers[i];
            cumulativeSum[numbers[i]] = cumulativeSum[numbers[i]] - 1;
        }
        for (int i = 0; i < size; i++) {
            System.out.print(output[i] + " ");
        }

        scanner.close();
    }
}