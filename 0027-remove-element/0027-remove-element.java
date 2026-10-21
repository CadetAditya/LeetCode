class Solution {
    public int removeElement(int[] nums, int val) {
        int res=0;
        int n=nums.length-1;
        int i=0;

        while(i<=n){
            if(nums[i]==val){
                // res++;

                int temp=nums[i];
                nums[i]=nums[n];
                nums[n]=temp;

                n--;
            }
            else {
                i++;
                res++;
            }

        }

        return res;
    }
}