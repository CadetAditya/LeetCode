
import java.util.*;

class Solution {
    public int longestSubstring(String s, int k) {
        int n = s.length();
        int maxLen = 0;

        for (int left = 0; left < n; left++) {
            HashMap<Character, Integer> hm = new HashMap<>();

            for (int right = left; right < n; right++) {
                char ch = s.charAt(right);

                hm.put(ch, hm.getOrDefault(ch, 0) + 1);

                boolean flag = true;

                for (char c : hm.keySet()) {
                    if (hm.get(c) < k) {
                        flag = false;
                        break;
                    }
                }

                if (flag) {
                    maxLen = Math.max(maxLen, right - left + 1);
                }
            }
        }

        return maxLen;
    }
}
