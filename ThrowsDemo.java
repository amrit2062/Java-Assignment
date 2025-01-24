public class ThrowsDemo {
    public static void main(String[] args) throws ArithmeticException {
        divide(10, 0);
    }

    public static void divide(int a, int b) throws ArithmeticException {
        System.out.println(a / b);
    }
}
