class Solution {
    public int leastInterval(char[] tasks, int n) {

        HashMap<Character, Integer> hm = new HashMap<>();

        for (char ch : tasks) {
            hm.put(ch, hm.getOrDefault(ch, 0) + 1);
        }

        int maxFreq = 0;
        int countMax = 0;

        for (int freq : hm.values()) {
            if (freq > maxFreq) {
                maxFreq = freq;
                countMax = 1;
            } else if (freq == maxFreq) {
                countMax++;
            }
        }

        int result = (maxFreq - 1) * (n + 1) + countMax;

        return Math.max(tasks.length, result);
    }
}