class Solution {
    public int[][] generateMatrix(int n) {
        int top=0;
        int left=0;
        int bottom=n-1;
        int right=n-1;

        int nums=1;
        int[][] matrix=new int[n][n];

        while(top <= bottom && left <= right){

            for(int i=left ; i<=right ; i++){
                matrix[top][i]=nums++;
            }

            top++;

            for(int i= top ;i<=bottom; i++){
                matrix[i][right]=nums++;
            }
            right--;


            if(top <= bottom){
            for(int i=right; i>=left; i--){
                matrix[bottom][i]=nums++;
            }
            bottom--;
            }


            if(left <= right){
            for(int i=bottom; i>=top ;i--){
                matrix[i][left]=nums++;
            }
            left++;
            }

        }

        return matrix;
    }
}