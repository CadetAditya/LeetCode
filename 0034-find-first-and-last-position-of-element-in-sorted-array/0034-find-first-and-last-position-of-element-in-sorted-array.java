class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] arr=new int[2];
        arr[0]=-1;
        arr[1]=-1;

        if(nums.length == 0) return arr;

        int left=0;
        int right=nums.length-1;

        int ans=-1;

        while(left <= right){
            int mid=left+(right-left)/2;

            if(nums[mid]==target){
                right=mid-1;
                ans=mid;
            }
            else if(nums[mid] < target){
                left=mid+1;
            }
            else right=mid-1;
        }

        if(ans == -1) return arr;

        arr[0]=ans;

        ans=-1;
        left=0;
        right=nums.length-1;

        while(left <= right){
            int mid=left+(right-left)/2;

            if(nums[mid]==target){
                left=mid+1;
                ans=mid;
            }
            else if(nums[mid] < target){
                left=mid+1;
            }
            else right=mid-1;
        }

        arr[1]=ans;

        return arr;


    }
}