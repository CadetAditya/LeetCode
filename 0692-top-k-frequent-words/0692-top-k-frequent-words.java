
import java.util.*;

class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        HashMap<String, Integer> hm = new HashMap<>();

        for (String str : words) {
            hm.put(str, hm.getOrDefault(str, 0) + 1);
        }

        PriorityQueue<String> pq = new PriorityQueue<>((a, b) -> {
            if (hm.get(a).equals(hm.get(b))) {
                return b.compareTo(a);
            }
            return Integer.compare(hm.get(a), hm.get(b));
        });

        for (String str : hm.keySet()) {
            pq.offer(str);

            if (pq.size() > k) {
                pq.poll();
            }
        }

        List<String> ans = new ArrayList<>();

        while (!pq.isEmpty()) {
            ans.add(pq.poll());
        }

        Collections.reverse(ans);

        return ans;
    }
}
