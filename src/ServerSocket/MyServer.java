package ServerSocket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class MyServer {
    private ServerSocket serverSocket;
    private Socket clientSocket;
    private PrintWriter out;
    private BufferedReader in;

    public void start(int port) throws IOException {
        serverSocket = new ServerSocket(port);
        clientSocket = serverSocket.accept();

        out = new PrintWriter(clientSocket.getOutputStream(), true); // სერვერი წერს ამ ნაკადში
        in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream())); // სერვერი კითხულობოს ამ ნაკადიდან

        String message = in.readLine();

        if (message.equals("hello server")){
            out.println("some text to write from Server to Client ... ");
        }else {
            System.out.println("error");
        }

    }

    public void close() throws IOException {
        serverSocket.close();
        clientSocket.close();
        out.close();
        in.close();
    }

}
