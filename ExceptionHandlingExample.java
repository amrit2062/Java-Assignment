public class ExceptionHandlingExample {
    public static void main(String[] args) {
        try {
            // Code that might throw an exception
            int[] numbers = {1, 2, 3};
            System.out.println("Accessing element at index 5: " + numbers[5]); // Will throw ArrayIndexOutOfBoundsException
        } catch (ArrayIndexOutOfBoundsException e) {
            // Handling the specific exception
            System.out.println("Exception caught: " + e.getMessage());
        } catch (Exception e) {
            // Handling other exceptions
            System.out.println("A general exception occurred: " + e.getMessage());
        } finally {
            // Code that will execute no matter what
            System.out.println("Finally block executed.");
        }

        System.out.println("Program continues after exception handling.");
    }
}
