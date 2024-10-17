import java.util.*;

class TwoSwaps {

    public boolean checkSorted(List<Integer> arr) {
        int i = 0;
        int swapCnt = 0;
        while (i < arr.size() && swapCnt < 2) {
            if (arr.get(i) != i + 1) {
                swapCnt++;
                int swapItem = arr.get(i);
                int temp = arr.get(swapItem - 1);
                arr.set(i, temp);
                arr.set(swapItem - 1, swapItem);
            } else {
                i++;
            }
        }
        if ((swapCnt == 2 && i == arr.size()) || (swapCnt == 0 && i == arr.size())) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n = sc.nextInt();
        
        List<Integer> arr = new ArrayList<>();
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr.add(sc.nextInt());
        }

        TwoSwaps obj = new TwoSwaps();
        boolean result = obj.checkSorted(arr);
        System.out.println("Can the array be sorted in exactly two swaps? " + result);
        sc.close();
    }
}
