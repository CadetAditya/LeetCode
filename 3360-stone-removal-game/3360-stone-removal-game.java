class Solution {
    public boolean canAliceWin(int n) {
        int i=10;
        int x=0;
        while(n >= i){
            n-=i;
            i--;
            if(i%2==1) x=1;
            else x=0;
        }

        if(x==1) return true;
        return false;
    }
}