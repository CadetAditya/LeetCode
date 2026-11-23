
class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int left = 0;
        int right = 0;

        for (int w : weights) {
            left = Math.max(left, w);
            right += w;
        }

        int ans = right;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            int d = 1;
            int sum = 0;

            for (int w : weights) {
                if (sum + w > mid) {
                    d++;
                    sum = 0;
                }

                sum += w;
            }

            if (d <= days) {
                ans = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return ans;
    }
}
