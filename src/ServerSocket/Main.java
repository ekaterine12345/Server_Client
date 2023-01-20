package ServerSocket;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        MyServer myServer = new MyServer();
        myServer.start(6437);

    }
}