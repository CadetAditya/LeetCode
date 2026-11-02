class Solution {
    public int minMoves(int[] nums) {
        Arrays.sort(nums);

        int mini=nums[0];

        int steps=0;

        for(int x: nums){
            int i=Math.abs(x-mini);
            steps+=i;
        }


        return steps;
    }
}