class Solution {
    public String longestPalindrome(String s) {

        int start=0;
        int len=1;

        for(int i=0;i<s.length();i++){

            int odd=expand(s,i,i);
            int even=expand(s,i,i+1);

            int  x=Math.max(odd,even);

            if(x>len){
                len=x;
                start=i-(x-1)/2;     
            }
        }

        return s.substring(start,start+len);

        
    }

    private int expand(String str,int left,int right){
        while((left>=0 && right < str.length()) && (str.charAt(left) == str.charAt(right)) ){
            left--;
            right++;
        }

        return right-left-1;
    }
}