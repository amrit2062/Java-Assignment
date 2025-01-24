import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class DatagramClient {
    public static void main(String[] args) {
        int port = 9876;
        String serverAddress = "localhost";
        try {
            // Create a DatagramSocket
            DatagramSocket clientSocket = new DatagramSocket();

            // Message to send
            String message = "Hello, Server!";
            byte[] sendBuffer = message.getBytes();

            // Server address and port
            InetAddress serverInetAddress = InetAddress.getByName(serverAddress);

            // Create a packet to send
            DatagramPacket sendPacket = new DatagramPacket(
                    sendBuffer,
                    sendBuffer.length,
                    serverInetAddress,
                    port
            );
            clientSocket.send(sendPacket);

            // Buffer for server response
            byte[] receiveBuffer = new byte[1024];

            // Receive response from the server
            DatagramPacket receivePacket = new DatagramPacket(receiveBuffer, receiveBuffer.length);
            clientSocket.receive(receivePacket);

            // Display server response
            String serverResponse = new String(receivePacket.getData(), 0, receivePacket.getLength());
            System.out.println("Server response: " + serverResponse);

            // Close the socket
            clientSocket.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
