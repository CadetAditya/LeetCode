
import java.util.*;

class Solution {
    public List<String> generateParenthesis(int n) {
        List<List<String>> dp = new ArrayList<>();

        for (int i = 0; i <= n; i++) {
            dp.add(new ArrayList<>());
        }

        dp.get(0).add("");

        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++) {

                List<String> inside = dp.get(j);
                List<String> after = dp.get(i - 1 - j);

                for (String a : inside) {
                    for (String b : after) {
                        dp.get(i).add("(" + a + ")" + b);
                    }
                }
            }
        }

        return dp.get(n);
    }
}
