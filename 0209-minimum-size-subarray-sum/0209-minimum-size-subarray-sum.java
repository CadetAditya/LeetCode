class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int left=0;
        int sum=0;
        // int right=0;
        int Len=Integer.MAX_VALUE;

        for(int right=0;right<nums.length;right++){
            sum+=nums[right];

            while(sum >= target){
                // left++;
                Len=Math.min(Len,right-left+1);
                sum-=nums[left++];

            } 
            

        }

        return Len == Integer.MAX_VALUE ? 0 : Len;

    }
}