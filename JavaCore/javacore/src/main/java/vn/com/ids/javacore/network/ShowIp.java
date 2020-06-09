package vn.com.ids.javacore.network;

import java.net.InetAddress;
import java.net.UnknownHostException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ShowIp {
	public static void main(String[] args) throws UnknownHostException {
		Logger logger = LoggerFactory.getLogger(ShowIp.class);
		InetAddress ip = InetAddress.getLocalHost();
		logger.info("System name is := {}", ip.getHostName());
		logger.info("System host is := {}", ip.getHostAddress());
	}
}
