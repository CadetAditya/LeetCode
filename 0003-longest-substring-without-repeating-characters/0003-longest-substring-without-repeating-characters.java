class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> hs=new HashSet<>();

        int window = 0;

        int left=0;
        int right=0;

        for(int i=0;i<s.length();i++){
        
                while(hs.contains(s.charAt(i)) == true){
                    hs.remove(s.charAt(left));
                    left++;
                }
        
        
                hs.add(s.charAt(i));
                // right++;
                window=Math.max(window, right-left+1);
                right++;
    
        }


        return window;
    }
}