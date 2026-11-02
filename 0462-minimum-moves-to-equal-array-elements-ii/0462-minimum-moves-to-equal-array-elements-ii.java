class Solution {
    public int minMoves2(int[] nums) {
        Arrays.sort(nums);

        int medi= nums[nums.length/2];

        int sum=0;

        for(int x : nums){
            int i=Math.abs(x-medi);

            sum+=i;
        }

        return sum;
    }
}