
class Solution {
    public int maxDistance(List<List<Integer>> arrays) {

        int mini = arrays.get(0).get(0);
        int maxim = arrays.get(0).get(arrays.get(0).size() - 1);

        int ans = 0;

        for (int i = 1; i < arrays.size(); i++) {

            List<Integer> arr = arrays.get(i);

            int l = arr.get(0);
            int r = arr.get(arr.size() - 1);

            ans = Math.max(ans, Math.max(
                Math.abs(r - mini),
                Math.abs(maxim - l)
            ));

            mini = Math.min(mini, l);
            maxim = Math.max(maxim, r);
        }

        return ans;
    }
}
