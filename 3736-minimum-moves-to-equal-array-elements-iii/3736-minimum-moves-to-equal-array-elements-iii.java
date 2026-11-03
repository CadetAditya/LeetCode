class Solution {
    public int minMoves(int[] nums) {

        Arrays.sort(nums);

        int max=nums[nums.length-1];
        int count=0;

        for(int x : nums){
            int i=Math.abs(x-max);

            count+=i;
        }
        
        return count;
    }
}