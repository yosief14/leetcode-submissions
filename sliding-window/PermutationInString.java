
import java.util.HashMap;

/*
 * @lc app=leetcode id=567 lang=java
 *
 * [567] Permutation in String
 */

public class PermutationInString {
    public boolean checkInclusion(String s1, String s2) {

        String base = s1.length() < s2.length() ? s1 : s2;
        String searchString = s1.length() < s2.length() ? s2 : s1;
        HashMap<Character, Integer> count = new HashMap<>();

        for (char c : base.toCharArray()) {
            count.put(c, 0);
        }

        int l = 0, maxPermutation = 0;

        for (int r = 0; r < searchString.length(); r++) {
            char c = searchString.charAt(r);
            if (maxPermutation > base.length()) {
                return true;
            }
            // condition to set r
            if (!count.containsKey(c)) {
                l = r;
                continue;
            } else {
                count.merge(c, 1, Integer::sum);
            }

            while (count.get(c) > 1 && l <= r) {
                count.merge(searchString.charAt(l), -1, Integer::sum);
                l++;
            }
            maxPermutation = (r - l + 1);
        }

        int overOrEqualToOne = (int) count.values().stream()
                .filter(val -> val >= 1)
                .count();
        return overOrEqualToOne == base.length();

    }

    public static void main(String[] args) {
        // Add a test case, then Run/Debug this fil
        System.out.println(new PermutationInString().checkInclusion("abc", "lecabee"));
        System.out.println(new PermutationInString().checkInclusion("abc", "lecaabee"));
        System.out.println(new PermutationInString().checkInclusion("cav", "lecaabee"));
    }
}

// @lc code=start
// @lc code=end
