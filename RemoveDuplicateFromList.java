import java.util.ArrayList;
import java.util.Scanner;

public class RemoveDuplicateFromList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of elements:");
        int n = scanner.nextInt();

        ArrayList<Integer> arrayList = new ArrayList<>();
        System.out.println("Enter the elements:");

        for (int i = 0; i < n; i++) {
            arrayList.add(scanner.nextInt());
        }

        ArrayList<Integer> result = new ArrayList<>();
        for (Integer item : arrayList) {
            if (!result.contains(item)) {
                result.add(item);
            }
        }

        System.out.println("List after removing duplicates:");
        System.out.println(result.toString());

        scanner.close();
    }
}
