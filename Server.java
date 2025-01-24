// Server
import java.io.*;
import java.net.*;

public class Server {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(5000);
        Socket socket = serverSocket.accept();
        BufferedReader input = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        System.out.println("Received: " + input.readLine());
        serverSocket.close();
    }
}

// Client
import java.io.*;
        import java.net.*;

public class Client {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("localhost", 5000);
        PrintWriter output = new PrintWriter(socket.getOutputStream(), true);
        output.println("Hello Server!");
        socket.close();
    }
}
