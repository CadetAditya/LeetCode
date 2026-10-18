class Solution {
    public int lengthOfLastWord(String s) {
        s=s.trim();
        s=new StringBuilder(s).reverse().toString();

        int count=0;

    for(char ch : s.toCharArray()){
        if(ch==' ') break;

        count++;
    }

    return count;
    }

    
}