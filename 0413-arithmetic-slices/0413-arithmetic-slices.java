class Solution {
    public int numberOfArithmeticSlices(int[] nums) {
        int n=nums.length;

        if(n<3) return 0;

        int count=0;

        for(int i=0; i<= n-3; i++){
            int diff=nums[i]-nums[i+1];

            for(int j=i+1; j<n-1; j++){
                int ndiff=nums[j]-nums[j+1];
                if(diff == ndiff)count++;
                else break;
            }
        }

        return count;

    }
}