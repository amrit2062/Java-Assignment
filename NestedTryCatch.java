public class NestedTryCatch {
    public static void main(String[] args) {
        try {
            int[] numbers = {1, 2, 3};
            try {
                System.out.println(numbers[5]);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Index out of bounds.");
            }
            int result = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero.");
        }
    }
}
