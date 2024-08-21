public class Swapper {

    public static <T> void doSwap(T first, T second) {
        System.out.println("Before Swap:");
        System.out.println("First: " + first + ", Second: " + second);

        T temp = first;
        first = second;
        second = temp;

        System.out.println("After Swap:");
        System.out.println("First: " + first + ", Second: " + second);
    }

    public static void main(String[] args) {
        Integer a = 10;
        Integer b = 20;

        doSwap(a, b);

        String x = "Hello";
        String y = "World";

        doSwap(x, y);
    }
}
