
class Solution {
    public long minimumCost(int cost1, int cost2, int costBoth,
                            int need1, int need2) {

        int n = Math.min(need1, need2);

        long cost = (long) n * Math.min((long) cost1 + cost2, costBoth);

        if (need1 > n) {
            int remaining = need1 - n;
            cost += (long) remaining * Math.min(cost1, costBoth);
        } else if (need2 > n) {
            int remaining = need2 - n;
            cost += (long) remaining * Math.min(cost2, costBoth);
        }

        return cost;
    }
}
