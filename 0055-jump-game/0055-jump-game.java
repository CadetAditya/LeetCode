class Solution {
    public boolean canJump(int[] nums) {
        int currEnd=0;
        int farthest=0;

        if(nums.length==1) return true;
        // if(nums[0]==0) return false;

        for(int i=0;i<nums.length-1;i++){
            farthest=Math.max(farthest,i+nums[i]);
            if(i==farthest){
                if(nums[i]==0) return false;
                farthest=nums[i];
            }
        }

        if(farthest >= nums.length-1) return true;
        return false;
    }
}