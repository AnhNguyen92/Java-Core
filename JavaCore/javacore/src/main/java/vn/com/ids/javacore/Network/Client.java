package vn.com.ids.javacore.Network;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Client {
	public static void main(String[] args) throws Exception {
		Logger logger = LoggerFactory.getLogger(Client.class); 
		
		try (Socket socket = new Socket("127.0.0.1", 6530)) {
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

			OutputStream outputtream = socket.getOutputStream();
			PrintWriter printwrite = new PrintWriter(outputtream, true);

			InputStream inputstream = socket.getInputStream();
			BufferedReader receiveRead = new BufferedReader(new InputStreamReader(inputstream));

			logger.info("Đã kết nối đến server");

			String receiveMessage, sendMessage;
			while (true) {
				sendMessage = reader.readLine();
				printwrite.println(sendMessage);
				printwrite.flush();
				if ((receiveMessage = receiveRead.readLine()) != null) {
					logger.info("server:" + receiveMessage);
				}
			}
		}
	}
}
