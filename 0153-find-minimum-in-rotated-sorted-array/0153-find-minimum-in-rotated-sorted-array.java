class Solution {
    public int findMin(int[] nums) {
        int left=0;
        int right=nums.length-1;

        if(right==1){
            if(nums[right] < nums[left]) return nums[right];
        }

        if(nums[left] <= nums[right]) return nums[left];
        if(nums[right]<nums[right-1]) return nums[right];

        left++;
        right--;

        while(left <= right){
            if(nums[left] < nums[left-1]) return nums[left];
            if(nums[right] < nums[right-1]) return nums[right];

            left++;
            right--;
        }


        return 0;
    }
}