package vn.com.ids.javacore.network;

import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class Bai8 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Moi nhap dia chi server");
        String serverDomain = scanner.nextLine();
        try (Socket socket = new Socket(serverDomain, 80)) {
            System.out.println("Connected to " + socket.getInetAddress() + " on port " + socket.getPort() + " from port " + socket.getLocalPort() + " of "
                    + socket.getLocalAddress());
        }
        scanner.close();
    }
}
