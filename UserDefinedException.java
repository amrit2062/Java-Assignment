class CustomException extends Exception {
    public CustomException(String message) {
        super(message);
    }
}

public class UserDefinedException {
    public static void main(String[] args) {
        try {
            throw new CustomException("This is a custom exception.");
        } catch (CustomException e) {
            System.out.println(e.getMessage());
        }
    }
}

