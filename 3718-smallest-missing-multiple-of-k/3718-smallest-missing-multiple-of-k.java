class Solution {
    public int missingMultiple(int[] nums, int k) {
        int arr[]=new int[101];
        Arrays.fill(arr,-1);

        for(int i=0;i<nums.length;i++){
            if(nums[i]%k==0){
                arr[(nums[i]/k)-1]=1;
            }
        }

        for(int i=0;i<arr.length;i++){
            if(arr[i]==-1){
                return k*(i+1);
            }
        }

        return 0;

    }
}