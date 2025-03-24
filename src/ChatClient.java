import java.io.*;
import java.net.*;

public class ChatClient {
    public static void main(String[] args) {
        String serverAddress = "http://localhost/"; // Server address
        int port = 80; // Must match server port

        try (Socket socket = new Socket(serverAddress, port)) {
            System.out.println("Connected to the server!");

            // Set up input and output streams
            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
            BufferedReader consoleInput = new BufferedReader(new InputStreamReader(System.in));

            String message;
            while (true) {
                // Send message to server
                System.out.print("Client: ");
                message = consoleInput.readLine();
                out.println(message);
                if (message.equalsIgnoreCase("exit")) break;

                // Read server's response
                message = in.readLine();
                if (message == null) break;
                System.out.println("Server: " + message);
            }

            System.out.println("Chat ended.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
