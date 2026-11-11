
class Solution {
    public int minSubArrayLen(int target, int[] nums) {

        int i = 0;
        int sum = 0;
        int minLen = Integer.MAX_VALUE;

        while (i < nums.length && sum < target) {
            sum += nums[i++];
        }

        if (sum < target) return 0;

        minLen = i;

        int left = 0;
        int right = i;

        while (left < nums.length) {

            sum -= nums[left++];

            while (sum < target && right < nums.length) {
                sum += nums[right++];
            }

            if (sum >= target) {
                minLen = Math.min(minLen, right - left);
            } else {
                break;
            }
        }

        return minLen;
    }
}
