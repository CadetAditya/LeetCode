class Solution {
    public int longestConsecutive(int[] nums) {

        HashSet<Integer> arr=new HashSet<>();
    
        for(int x :nums){
            arr.add(x);
        }

        int ans=0;

        for(int x: arr){
            if(arr.contains(x-1)) continue;
            
            int lcs=1;
            x++;
            while(arr.contains(x++)) lcs++;

            ans=Math.max(lcs,ans);
        }

        return ans; 
        
    }
}