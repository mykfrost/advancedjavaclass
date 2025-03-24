import java.io.*;
import java.net.*;

public class ChatServer {
    public static void main(String[] args) {
        int port = 12345; // Port number for communication

        try (ServerSocket serverSocket = new ServerSocket(port)) {
            System.out.println("Server is waiting for a client...");

            Socket clientSocket = serverSocket.accept(); // Accept client connection
            System.out.println("Client connected!");

            // Set up input and output streams
            BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
            PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);

            // Read and send messages
            BufferedReader consoleInput = new BufferedReader(new InputStreamReader(System.in));
            String message;

            while (true) {
                // Read message from client
                message = in.readLine();
                if (message == null || message.equalsIgnoreCase("exit")) break;
                System.out.println("Client: " + message);

                // Send response to client
                System.out.print("Server: ");
                message = consoleInput.readLine();
                out.println(message);
            }

            System.out.println("Chat ended.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
