public class SwapNumber {
    public static void main(String[] args) {
        int a = 10, b = 20;
        System.out.println("Before Swap: a = " + a + ", b = " + b);

        // With third variable
        int temp = a;
        a = b;
        b = temp;
        System.out.println("After Swap (with temp): a = " + a + ", b = " + b);

        // Without third variable
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("After Swap (without temp): a = " + a + ", b = " + b);
    }
}
