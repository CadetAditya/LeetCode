class Solution {
    public boolean checkString(String s) {
        int fb=-1;

        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == 'a' && fb == -1) continue;
            else if(s.charAt(i) == 'b' && fb == -1) fb=i;
            else if(s.charAt(i) == 'a' && fb != -1) return false;
        }


        return true;
    }
}