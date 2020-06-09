package vn.com.ids.javacore.Network;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Server {
	public static void main(String[] args) throws Exception {
		Logger logger = LoggerFactory.getLogger(Client.class); 

		try (ServerSocket serversock = new ServerSocket(6530)) {
			logger.info("Máy chủ sẵn sàng :");
			Socket socket = serversock.accept();

			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

			OutputStream outputstream = socket.getOutputStream();
			PrintWriter printwrite = new PrintWriter(outputstream, true);

			InputStream inputstream = socket.getInputStream();
			BufferedReader receiveRead = new BufferedReader(new InputStreamReader(inputstream));

			String receiveMessage;
			String sendMessage;
			while (true) {
				receiveMessage = receiveRead.readLine();
				if (receiveMessage != null) {
					logger.info("client: {}", receiveMessage);
				}
				sendMessage = reader.readLine();
				printwrite.println(sendMessage);
				printwrite.flush();
			}

		}
	}
}
