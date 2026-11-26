class Solution {
    public int minFallingPathSum(int[][] matrix) {
        int r=matrix.length;
        int c=matrix[0].length;

        int dp[][]=new int[r][c];

        for(int i=0; i<c; i++){
            dp[0][i]=matrix[0][i];
        }

        for(int i=1; i<r; i++){
            for(int j=0; j<c; j++){
                int m=Integer.MAX_VALUE;
                if(j-1 >= 0){
                    m=Math.min(m,dp[i-1][j-1]);
                }
                if(j >= 0){
                    m=Math.min(m,dp[i-1][j]);
                }
                if(j+1 < c){
                    m=Math.min(m,dp[i-1][j+1]);
                }

                dp[i][j]=m+matrix[i][j];
            }
        }

        int ans=Integer.MAX_VALUE;

        for(int i=0; i<c; i++){
            ans=Math.min(ans,dp[r-1][i]);
        }

        return ans;
    }
}