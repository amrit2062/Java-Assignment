import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class DatagramServer {
    public static void main(String[] args) {
        int port = 9876;
        try {
            // Create a DatagramSocket to listen on the specified port
            DatagramSocket serverSocket = new DatagramSocket(port);

            System.out.println("Server is running on port " + port);

            // Buffer to store incoming data
            byte[] receiveBuffer = new byte[1024];
            byte[] sendBuffer;

            while (true) {
                // Receive packet from client
                DatagramPacket receivePacket = new DatagramPacket(receiveBuffer, receiveBuffer.length);
                serverSocket.receive(receivePacket);

                // Extract message and client info
                String clientMessage = new String(receivePacket.getData(), 0, receivePacket.getLength());
                System.out.println("Received: " + clientMessage);

                // Respond to the client
                String response = "Message received: " + clientMessage;
                sendBuffer = response.getBytes();

                DatagramPacket sendPacket = new DatagramPacket(
                        sendBuffer,
                        sendBuffer.length,
                        receivePacket.getAddress(),
                        receivePacket.getPort()
                );
                serverSocket.send(sendPacket);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

