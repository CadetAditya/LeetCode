class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int left=1;
        int right=0;

        

        for(int n : nums){
            right=Math.max(n,right);
        }

        int ans=right;

        while(left <= right){
            int mid = left +(right-left)/2;

            int th=0;

            for(int n : nums){
                th+=(Math.ceilDiv(n,mid));
            }

            if(th <= threshold){
                ans=mid;
                right=mid-1;
            }
            else left=mid+1;
        }

        return ans;
    }
}