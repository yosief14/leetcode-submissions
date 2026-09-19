
import java.util.HashMap;

/*
 * @lc app=leetcode id=424 lang=java
 *
 * [424] Longest Repeating Character Replacement
 */

// @lc code=start
class LongestRepeatingCharacterReplacementOptimal {
    public int characterReplacement(String s, int k) {
        HashMap<Character, Integer> count = new HashMap<>();
        int l = 0;
        int maxSubstring = 0;
        int maxFreq = 0;
        for (int r = 0; r < s.length(); r++) {
            char c = s.charAt(r);
            // count.merge(c, 1, Integer::sum);
            count.put(c, count.getOrDefault(c, 0) + 1);
            maxFreq = Math.max(maxFreq, count.get(c));
            // While
            while ((r - l + 1) - maxFreq > k) {
                count.merge(s.charAt(l), -1, Integer::sum);
                // count.put(s.charAt(l), count.get(s.charAt(l)) - 1);
                l++;
            }
            maxSubstring = Math.max(maxSubstring, r - l + 1);
        }
        // System.out.println(maxSubstring);
        return maxSubstring;
    }

    public static void main(String[] args) {
        // Add a test case, then Run/Debug this file
        new LongestRepeatingCharacterReplacementOptimal().characterReplacement("AABABBA", 1);
        new LongestRepeatingCharacterReplacementOptimal().characterReplacement("AAABABB", 1);
        new LongestRepeatingCharacterReplacementOptimal().characterReplacement("ABBB", 2);
    }
}
// @lc code=end

/*
 *
 * 
 * Widnow si valid when windowsize-most frequent char <= k because chars that
 * aren't freq are the ones we need to replace which we can do k times
 * 
 * What do i do when a window is invalid
 * 
 * 
 */