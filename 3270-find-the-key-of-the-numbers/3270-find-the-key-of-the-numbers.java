class Solution {
    public int generateKey(int num1, int num2, int num3) {
        int l1=String.valueOf(num1).length();
        int l2=String.valueOf(num2).length();
        int l3=String.valueOf(num3).length();

        int min=Math.min(l1,l2);
        min=Math.min(min,l3);

        int res=0;
        int k=10;
        while(min!=0){
            int x=num1 % 10;
            int y=num2 % 10;
            int z=num3 % 10;

            num1/=10;
            num2/=10;
            num3/=10;

            int m=Math.min(x,y);
            m=Math.min(m,z);

            res=(m*k)+res;
            k*=10;
            min--;
        }
        return res/10;
    }
}