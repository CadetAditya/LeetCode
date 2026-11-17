
import java.util.Arrays;

class Solution {
    public int[] advantageCount(int[] nums1, int[] nums2) {
        int n = nums1.length;

        Arrays.sort(nums1);

        
        Integer[] indices = new Integer[n];
        for (int i = 0; i < n; i++) {
            indices[i] = i;
        }

        Arrays.sort(indices,
            (a, b) -> Integer.compare(nums2[a], nums2[b]));

        int[] ans = new int[n];
        int left = 0;
        int right = n - 1;

        for (int num : nums1) {
            if (num > nums2[indices[left]]) {
                ans[indices[left]] = num;
                left++;
            } else {
                ans[indices[right]] = num;
                right--;
            }
        }

        return ans;
    }
}
