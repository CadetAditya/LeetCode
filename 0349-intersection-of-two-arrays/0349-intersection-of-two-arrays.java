
import java.util.*;

class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        List<Integer> arr = new ArrayList<>();

        Arrays.sort(nums1);
        Arrays.sort(nums2);

        int a1 = 0;
        int a2 = 0;

        while (a1 < nums1.length && a2 < nums2.length) {
            if (nums1[a1] == nums2[a2]) {
                // Add only if it is not a duplicate
                if (arr.isEmpty() || arr.get(arr.size() - 1) != nums1[a1]) {
                    arr.add(nums1[a1]);
                }

                a1++;
                a2++;
            } else if (nums1[a1] < nums2[a2]) {
                a1++;
            } else {
                a2++;
            }
        }

        int[] result = new int[arr.size()];

        for (int i = 0; i < arr.size(); i++) {
            result[i] = arr.get(i);
        }

        return result;
    }
}
