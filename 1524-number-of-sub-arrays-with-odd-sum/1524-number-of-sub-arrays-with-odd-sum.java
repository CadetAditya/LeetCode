class Solution {
    public int numOfSubarrays(int[] arr) {
        
        long evenParity=1;
        long oddParity=0;
        long sum=0;
        long ans=0;
        int mod=1000000007;

        for(int x: arr){
            sum+=x;

            if(sum % 2 == 0){
                ans=(ans+oddParity) % mod;
                evenParity++;
            }
            else{
                ans=(ans+evenParity) % mod;
                oddParity++;
            }
        }


        return (int) ans;

    }
}