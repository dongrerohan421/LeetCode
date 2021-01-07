package length_of_longest_substring;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    // Sliding window solution
    public int lengthOfLongestSubstring(String s) {
        int strlen = s.length();
        int left = 0;
        int right = 0;
        int ans = 0;

        if (strlen == 0) {
            return 0;
        }

        Map<Character, Integer> map = new HashMap<>();
        while (right < strlen) {
            char rchar = s.charAt(right);

            if (!map.containsKey(rchar)) {
                map.put(rchar, 1);
                ans = Math.max(ans, right - left + 1);
                right++;
            } else {
                char lchar = s.charAt(left);
                map.remove(lchar);
                left++;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        System.out.println("length of abcabcbb:" + solution.lengthOfLongestSubstring("abcabcbb"));
        System.out.println("length of bbbbb:" + solution.lengthOfLongestSubstring("bbbbb"));
        System.out.println("length of pwwkew:" + solution.lengthOfLongestSubstring("pwwkew"));
        System.out.println("length of empty string:" + solution.lengthOfLongestSubstring(""));
    }
}
