import java.util.Stack;
import java.util.Scanner;

public class ReverseStack { 
    static void insertAtBottom(Stack<Integer> s, Integer num) {
        if (s.isEmpty()) {
            s.push(num);
        } else {
            Integer top = s.pop();
            insertAtBottom(s, num);
            s.push(top);
        }
    }
    
    static void reverse(Stack<Integer> s) {
        if (!s.isEmpty()) {
            Integer temp = s.pop();
            reverse(s);
            insertAtBottom(s, temp);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of elements in the stack: ");
        int n = scanner.nextInt();
        
        Stack<Integer> stack = new Stack<>();
        
        System.out.println("Enter elements of the stack:");
        for (int i = 0; i < n; i++) {
            stack.push(scanner.nextInt());
        }
        
        reverse(stack);
        
        System.out.println("Reversed stack:");
        while (!stack.isEmpty()) {
            System.out.print(stack.pop() + " ");
        }
        
        scanner.close();
    }
}
