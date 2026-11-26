class Solution {
    public int maximalSquare(char[][] matrix) {
        int r=matrix.length;
        int c=matrix[0].length;

        int dp[][]=new int[r][c];
        
        int maxSide=0;

        for(int i=0;i<c;i++){
            if(matrix[0][i]=='1'){
                dp[0][i]=1;
                maxSide=1;
            }

            else dp[0][i]=0;
        }

        for(int i=0;i<r;i++){
            if(matrix[i][0]=='1'){
                dp[i][0]=1;
                maxSide=1;
            }

            else dp[i][0]=0;
        }


        for(int i=1; i<r; i++){
            for(int j=1; j<c; j++){
                if(matrix[i][j]=='1'){
                    int x=Math.min(Math.min(dp[i-1][j-1],dp[i-1][j]),dp[i][j-1]);
                    dp[i][j]=x+1;

                    maxSide=Math.max(maxSide,dp[i][j]);
                }

                else dp[i][j]=0;
            }
        }

        return maxSide*maxSide;
    }
}