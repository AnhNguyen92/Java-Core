package javacore.algorithm.leetcode.under0400;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
 * LeetCode 355. Design Twitter
*/
public class DesignTwitter {
	private Map<Integer, List<Integer>> followed;
    private Map<Integer, List<Integer>> tweets;
    private List<Integer> newsFeeds = new ArrayList<>();

    public DesignTwitter() {
        followed = new HashMap<>();
        tweets = new HashMap<>();
        newsFeeds = new ArrayList<>();
    }
    
    public void postTweet(int userId, int tweetId) {
        tweets.computeIfAbsent(userId, k -> new ArrayList<>());
        tweets.get(userId).add(tweetId);
        newsFeeds.add(0, tweetId);
    }
    
    public List<Integer> getNewsFeed(int userId) {
        List<Integer> newsFeed = new ArrayList<>(tweets.getOrDefault(userId, new ArrayList<>()));
        List<Integer> followee = followed.getOrDefault(userId, new ArrayList<>());
        for (Integer id : followee) {
            newsFeed.addAll(tweets.getOrDefault(id, new ArrayList<>()));
        }
        List<Integer> ans = new ArrayList<>();
        ans.addAll(newsFeeds);
        ans.retainAll(newsFeed);
        if (ans.size() > 10) {
            return ans.subList(0, 10);
        }
        return ans;
    }
    
    public void follow(int followerId, int followeeId) {
        followed.computeIfAbsent(followerId, k -> new ArrayList<>());
        followed.get(followerId).add(followeeId);
    }
    
    public void unfollow(int followerId, int followeeId) {
        List<Integer> followee = followed.get(followerId);
        if (followee != null && !followee.isEmpty()) {
            followee.remove((Integer) followeeId);
        }
    }
}
