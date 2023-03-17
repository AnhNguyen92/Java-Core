package javacore.file;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ReadFileUtil {
	private static final Logger log = LoggerFactory.getLogger(ReadFileUtil.class);

	private ReadFileUtil() {
		throw new IllegalStateException("Utility class");
	}

	public static InputStream getFileFromResourceAsStream(String fileName) {
		ClassLoader classLoader = ReadFileUtil.class.getClassLoader();
		InputStream inputStream = classLoader.getResourceAsStream(fileName);
		if (inputStream == null) {
			throw new IllegalArgumentException("file not found! " + fileName);
		} else {
			return inputStream;
		}

	}

	public static void printInputStream(InputStream is) {

		try (InputStreamReader streamReader = new InputStreamReader(is, StandardCharsets.UTF_8);
				BufferedReader reader = new BufferedReader(streamReader)) {

			String line;
			while ((line = reader.readLine()) != null) {
				log.info("{}", line);
			}

		} catch (IOException e) {
			log.error("{}", e.getMessage());
		}

	}

	public static File getFileFromResource(String fileName) throws URISyntaxException {
		ReadFileUtil readFileUtil = new ReadFileUtil();
		ClassLoader classLoader = readFileUtil.getClass().getClassLoader();
		URL resource = classLoader.getResource(fileName);
		if (resource == null) {
			throw new IllegalArgumentException("file not found! " + fileName);
		}
		return new File(resource.toURI());
	}

	public static List<String> printFile(File file) {
		List<String> lines = new ArrayList<>();
		try {
			lines = Files.readAllLines(file.toPath(), StandardCharsets.UTF_8);
		} catch (IOException e) {
			log.error("{}", e.getMessage());
		}
		return lines;
	}
}
