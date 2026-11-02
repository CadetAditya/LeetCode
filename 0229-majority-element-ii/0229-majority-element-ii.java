
class Solution {
    public List<Integer> majorityElement(int[] nums) {

        HashMap<Integer, Integer> hm = new HashMap<>();

        for (int x : nums) {
            if (hm.containsKey(x)) {
                hm.put(x, hm.get(x) + 1);
            } else {
                hm.put(x, 1);
            }
        }

        int n = nums.length / 3;
        List<Integer> ans = new ArrayList<>();

        for (int x : hm.keySet()) {
            if (hm.get(x) > n) {
                ans.add(x);
            }
        }

        return ans;
    }
}
