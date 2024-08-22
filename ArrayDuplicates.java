import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ArrayDuplicates {

    public static ArrayList<Integer> duplicates(int[] arr) {
        Map<Integer, Integer> myhash = new HashMap<>();
        ArrayList<Integer> mylist = new ArrayList<>();
        
        for (int num : arr) {
            myhash.put(num, myhash.getOrDefault(num, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : myhash.entrySet()) {
            if (entry.getValue() > 1) {
                mylist.add(entry.getKey());
            }
        }

        if (mylist.isEmpty()) {
            mylist.add(-1);
        }

        Collections.sort(mylist);

        return mylist;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();
        
        int[] arr = new int[n];
        
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        
        ArrayList<Integer> result = duplicates(arr);
        
        System.out.println("Duplicates: " + result);
        
        scanner.close();
    }
}
