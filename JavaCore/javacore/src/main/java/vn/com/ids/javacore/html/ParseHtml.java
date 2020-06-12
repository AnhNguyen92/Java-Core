package vn.com.ids.javacore.html;

import java.io.IOException;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;

public class ParseHtml {
	private static final Logger logger = LoggerFactory.getLogger(ParseHtml.class);

	public void getEmail() {
		OkHttpClient okHttp = new OkHttpClient();
		Request request = new Request.Builder().url("https://hosocongty.vn/cong-ty-tnhh-imex-worldwide-com-200.htm").get().build();
		try {
			Document doc = Jsoup.parse(okHttp.newCall(request).execute().body().string());
			Elements elements = doc.body().select("*");
			
			for (Element element : elements) {
				if (element.ownText().contains("Email:") ) {
					logger.info("true");
					if (logger.isDebugEnabled()) {
						logger.info(element.ownText());
						logger.info(element.toString());
					}
					String emailEncoded = element.childNodes().get(13).toString();
					logger.info("{}", emailEncoded);
					int dataCdfEmailIndx = emailEncoded.indexOf("data-cfemail");
					int firstLargerSign = emailEncoded.indexOf('>');
					String cdfEmailStr = emailEncoded.substring(dataCdfEmailIndx + 14, firstLargerSign - 1);
					logger.info("{}", cdfEmailStr);
					
					
				}
				
			}
			Pattern p = Pattern.compile("[a-zA-Z0-9_.+-]+@[a-zA-Z0-9-]+\\.[a-zA-Z0-9-.]+");
	        Matcher matcher = p.matcher(doc.text());
	        Set<String> emails = new HashSet<>();
	        while (matcher.find()) {
	            emails.add(matcher.group());
	        }

	        Set<String> links = new HashSet<>();

	        Elements elements1 = doc.select("a[href]");
	        for (Element e : elements1) {
	            links.add(e.attr("data-cfemail"));
	        }
	        
	        logger.info("{}", emails);
	        logger.info("{}", links);	        
		} catch (IOException e) {
			logger.error(e.getMessage(), e);
		}

	}
	
	public void decodeString () {
		String emailEncoded = "3d545058454a5e517d5a505c5451135e5250";
		// Holds the final output
		StringBuilder email = new StringBuilder();
		
		// Extract the first 2 letters
		String keyInHex = emailEncoded.substring(0,2);
		
		// Convert the hex-encoded key into decimal
		int key = Integer.parseInt(keyInHex, 16);
		
		// Loop through the remaining encoded characters in steps of 2
		for (int n = 2; n < emailEncoded.length(); n += 2) {
			// Get the next pair of characters
			String charInHex = emailEncoded.substring(n, n + 2);
			
			// Convert hex to decimal
	        int chaInt = Integer.parseInt(charInHex, 16);

	        // XOR the character with the key to get the original character
	        int output = chaInt ^ key;

	        // Append the decoded character to the output
	        email.append(Character.toChars(output));
		}
		
		logger.info("email after decode: {}", email);
	}
	
}
