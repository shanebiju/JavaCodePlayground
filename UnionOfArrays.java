import java.util.ArrayList;

public class UnionOfArrays {
    
    private static int addToSolution(ArrayList<Integer> sol, int value, int end) {
        if (end != value) {
            sol.add(value);
            end = value;
        }
        return end;
    }
    
    public static ArrayList<Integer> findUnion(int arr1[], int arr2[], int n, int m) {
        if (n > m) {
            return findUnion(arr2, arr1, m, n);
        }
        
        ArrayList<Integer> sol = new ArrayList<>();
        int i = 0;
        int j = 0;
        int end = Integer.MAX_VALUE;
        
        while (i < n && j < m) {
            if (arr1[i] < arr2[j]) {
                end = addToSolution(sol, arr1[i], end);
                i++;
            } else if (arr2[j] < arr1[i]) {
                end = addToSolution(sol, arr2[j], end);
                j++;
            } else {
                end = addToSolution(sol, arr2[j], end);
                i++;
                j++;
            }
        }
        
        while (i < n) {
            end = addToSolution(sol, arr1[i], end);
            i++;
        }
        
        while (j < m) {
            end = addToSolution(sol, arr2[j], end);
            j++;
        }
        
        return sol;
    }

    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        
        System.out.print("Enter the number of elements in the first array: ");
        int n = sc.nextInt();
        System.out.print("Enter the number of elements in the second array: ");
        int m = sc.nextInt();
        
        int[] arr1 = new int[n];
        int[] arr2 = new int[m];
        
        System.out.println("Enter the elements of the first array:");
        for (int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
        }
        
        System.out.println("Enter the elements of the second array:");
        for (int i = 0; i < m; i++) {
            arr2[i] = sc.nextInt();
        }
        
        ArrayList<Integer> result = findUnion(arr1, arr2, n, m);
        
        System.out.println("The union of the two arrays is:");
        for (int num : result) {
            System.out.print(num + " ");
        }
        
        sc.close();
    }
}
