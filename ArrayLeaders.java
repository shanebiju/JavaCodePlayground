import java.util.ArrayList;
import java.util.Scanner;

public class ArrayLeaders {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the number of elements in the array: ");
        int n = sc.nextInt();
        
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        ArrayList<Integer> result = leaders(arr);
        

        System.out.println("Leaders in the array: " + result);
        
        sc.close();
    }
    
    static ArrayList<Integer> leaders(int arr[]) {
        int i = arr.length - 1;
        int maximum = arr[i];
        ArrayList<Integer> sol = new ArrayList<>();
        while (i >= 0) {
            if (arr[i] >= maximum) {
                sol.add(0, arr[i]);
                maximum = arr[i];
            }
            i--;
        }
        return sol;
    }
}
