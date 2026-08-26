class Solution {
    public String shortestBeautifulSubstring(String s, int k) {

        ArrayList<Integer> ones = new ArrayList<>();

        // Store positions of every '1'
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '1') {
                ones.add(i);
            }
        }

        // Not enough 1s
        if (ones.size() < k) {
            return "";
        }

        String best = "";

        // Sliding window over the 1s
        for (int i = 0; i <= ones.size() - k; i++) {

            int f1 = ones.get(i);
            int f3 = ones.get(i + k - 1);

            String current = s.substring(f1, f3 + 1);

            if (best.equals("")
                    || current.length() < best.length()
                    || (current.length() == best.length()
                        && current.compareTo(best) < 0)) {

                best = current;
            }
        }

        return best;
    }
}