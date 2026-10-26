class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int n=matrix.length;
        int m=matrix[0].length;

        for(int i=0; i<m; i++){
            if(matrix[0][i] <= target && matrix[n-1][i] >= target){
                int left=0;
                int right=n-1;

                while(left <= right){
                    int mid=left+(right-left)/2;

                    if(matrix[mid][i] == target) return true;
                    else if(matrix[mid][i] > target) right = mid-1;
                    else left = mid+1;
                }
            }
        }

        return false;
    }
}