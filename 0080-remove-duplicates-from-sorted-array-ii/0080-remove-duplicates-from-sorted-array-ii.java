class Solution {
    public int removeDuplicates(int[] nums) {
        int n=nums.length;
        int larEle=nums[n-1]+1;

        int k=1;
        int count=1;

        int prev=nums[0];
        for(int i=1; i<n ; i++){
            if(nums[i]==prev) count++;
            else {
                count=1;
            }

            prev=nums[i];

            if(count > 2){
                nums[i]=larEle;
                k++;
            } 
        }

        Arrays.sort(nums);
        return n-k+1;


    }
}