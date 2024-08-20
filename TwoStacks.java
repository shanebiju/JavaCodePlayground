public class TwoStacks {
    private int[] array;
    private int top1, top2;

    public TwoStacks(int size) {
        array = new int[size];
        top1 = -1;
        top2 = size;
    }

    public void push1(int x) throws Exception {
        if (top1 < top2 - 1) {
            array[++top1] = x;
        } else {
            throw new Exception("Stack Overflow: Stack 1");
        }
    }

    public void push2(int x) throws Exception {
        if (top1 < top2 - 1) {
            array[--top2] = x;
        } else {
            throw new Exception("Stack Overflow: Stack 2");
        }
    }

    public int pop1() throws Exception {
        if (top1 >= 0) {
            return array[top1--];
        } else {
            throw new Exception("Stack Underflow: Stack 1 is empty");
        }
    }

    public int pop2() throws Exception {
        if (top2 < array.length) {
            return array[top2++];
        } else {
            throw new Exception("Stack Underflow: Stack 2 is empty");
        }
    }

    public static void main(String[] args) {
        try {
            TwoStacks obj = new TwoStacks(5);
            obj.push1(5);
            obj.push2(10);
            obj.push2(15);
            obj.push1(11);
            obj.push2(7);

            System.out.println("Popped element from stack1: " + obj.pop1());
            System.out.println("Popped element from stack2: " + obj.pop2());

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

