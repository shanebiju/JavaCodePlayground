import java.util.Scanner;

public class SecondLargest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int size = scanner.nextInt();

        int[] array = new int[size];

        System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        int secondLargest=-1;
        int largest=array[0];
        for(int i=0;i<size;i++){
            if(array[i]>largest){
                largest=array[i];
            }
            if(array[i]!=largest && array[i]>secondLargest){
                secondLargest=array[i];
            }
        }
        for(int i=0;i<size;i++){
            if(array[i]!=largest && array[i]>secondLargest){
                secondLargest=array[i];
            }
        }
        System.out.printf("Second Largest is %d",secondLargest);
        scanner.close();
    }
}
