package ClientSocket;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        MyClient myClient = new MyClient();
        myClient.startConnection("192.168.1.6",6437);
        System.out.println(myClient.sendMessage("hello server"));
    }
}