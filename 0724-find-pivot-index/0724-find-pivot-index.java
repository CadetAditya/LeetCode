class Solution {
    public int pivotIndex(int[] nums) {
        int[] prefixSum=new int[nums.length];

        int sum=0;

        for(int i=0; i<nums.length; i++){
            sum+=nums[i];

            prefixSum[i]=sum;
        }

        for(int i=0;i<nums.length; i++){
            if(i==0){
                if(prefixSum[nums.length-1] - prefixSum[0] == 0 ) return 0;
            }
            else if(i==nums.length-1){
                if(prefixSum[nums.length-2]==0) return i;
            }

            else{
                if(prefixSum[i-1] == prefixSum[nums.length-1] - prefixSum[i]) return i;
            }
        }

        return -1;
    }
}