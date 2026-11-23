class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> hs=new HashSet<>();

        for(int x: nums){
            hs.add(x);
        }

        int ans=0;

        for(int x : hs){
            if(hs.contains(x-1)) continue;

            int lcs=1;
            x++;
            while(hs.contains(x++)) lcs++;

            ans=Math.max(ans,lcs);
        }


        return ans;
    }
}