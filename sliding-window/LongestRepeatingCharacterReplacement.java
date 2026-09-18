

/*
 * @lc app=leetcode id=424 lang=java
 *
 * [424] Longest Repeating Character Replacement
 */


// @lc code=start
class LongestRepeatingCharacterReplacement {
    public int characterReplacement(String s, int k) {
        int swaps = k;
        int l = 0;
        int maxSubstring = 1;
        char cur = s.charAt(l);
        for(int r = 1; r< s.length(); r++){
            char c = s.charAt(r);
            if( cur != c && swaps > 0){
                swaps--;
            }else if ( cur != c && swaps== 0){
               l = r; 
               cur = c;
               swaps = k;
            }
            maxSubstring = Math.max(maxSubstring, r-l +1);
        }
        System.out.println(maxSubstring);
        return maxSubstring;
    }
    public static void main(String[] args) {
        // Add a test case, then Run/Debug this file
        new LongestRepeatingCharacterReplacement().characterReplacement("AAABABB", 1);
    }
}
// @lc code=end

