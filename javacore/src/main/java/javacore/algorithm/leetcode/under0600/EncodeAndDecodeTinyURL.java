package javacore.algorithm.leetcode.under0600;

import java.util.HashMap;
import java.util.Map;

/*
 * LeetCode 535. Encode and Decode TinyURL
 */
public class EncodeAndDecodeTinyURL {
	private int index = 1;
    private Map<String, String> map = new HashMap<>();

    // Encodes a URL to a shortened URL.
    public String encode(String longUrl) {
        int lastSlashPos = longUrl.lastIndexOf("\\/");
        String baseUrl = longUrl.substring(0, lastSlashPos + 1);
        String shortUrl = baseUrl + "a" + (index++);
        map.put(shortUrl, longUrl);
        return shortUrl;
    }

    // Decodes a shortened URL to its original URL.
    public String decode(String shortUrl) {
        return map.get(shortUrl);
    }
}

// Your Codec object will be instantiated and called as such:
// Codec codec = new Codec();
// codec.decode(codec.encode(url));