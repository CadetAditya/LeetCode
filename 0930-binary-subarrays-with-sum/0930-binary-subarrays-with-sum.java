
import java.util.HashMap;
import java.util.Map;

class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        Map<Integer, Integer> map = new HashMap<>();

        map.put(0, 1);

        int currentSum = 0;
        int count = 0;

        for (int num : nums) {
            currentSum += num;

            int required = currentSum - goal;

            count += map.getOrDefault(required, 0);

            map.put(
                currentSum,
                map.getOrDefault(currentSum, 0) + 1
            );
        }

        return count;
    }
}
