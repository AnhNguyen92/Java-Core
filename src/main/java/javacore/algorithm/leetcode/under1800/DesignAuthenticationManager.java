package javacore.algorithm.leetcode.under1800;

import java.util.HashMap;
import java.util.Map;

/*
 * LeetCode 1797. Design Authentication Manager
 */
public class DesignAuthenticationManager {
	private int timeToLive;
    private Map<String, Integer> map = new HashMap<>();

    public DesignAuthenticationManager(int timeToLive) {
        this.timeToLive = timeToLive;
    }
    
    public void generate(String tokenId, int currentTime) {
        map.put(tokenId, currentTime + timeToLive);
    }
    
    public void renew(String tokenId, int currentTime) {
        if (map.get(tokenId) != null && map.get(tokenId) > currentTime) {
            generate(tokenId, currentTime);
        }
    }
    
    public int countUnexpiredTokens(int currentTime) {
        int count = 0;
        for (int v : map.values()) {
            if (v > currentTime) {
                count++;
            }
        }
        return count;
    }
}
