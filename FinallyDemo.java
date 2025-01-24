import java.io.*;

public class FinallyDemo {
    public static void main(String[] args) {
        FileReader reader = null;
        try {
            reader = new FileReader("test.txt");
        } catch (IOException e) {
            System.out.println("File not found.");
        } finally {
            try {
                if (reader != null) {
                    reader.close();
                }
            } catch (IOException e) {
                System.out.println("Error closing file.");
            }
        }
    }
}

