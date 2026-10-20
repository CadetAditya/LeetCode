class Solution {
    public void setZeroes(int[][] matrix) {

        boolean firstRow = false;
        boolean firstColumn = false;

        // Check first column
        for(int i = 0; i < matrix.length; i++) {
            if(matrix[i][0] == 0) {
                firstColumn = true;
            }
        }

        // Check first row
        for(int i = 0; i < matrix[0].length; i++) {
            if(matrix[0][i] == 0) {
                firstRow = true;
            }
        }

        // Create markers
        for(int i = 1; i < matrix.length; i++) {
            for(int j = 1; j < matrix[0].length; j++) {

                if(matrix[i][j] == 0) {
                    matrix[0][j] = 0;
                    matrix[i][0] = 0;
                }
            }
        }

        // Zero marked columns
        for(int j = 1; j < matrix[0].length; j++) {

            if(matrix[0][j] == 0) {
                for(int i = 1; i < matrix.length; i++) {
                    matrix[i][j] = 0;
                }
            }
        }

        // Zero marked rows
        for(int i = 1; i < matrix.length; i++) {

            if(matrix[i][0] == 0) {
                for(int j = 1; j < matrix[0].length; j++) {
                    matrix[i][j] = 0;
                }
            }
        }

        // Zero first row
        if(firstRow) {
            for(int j = 0; j < matrix[0].length; j++) {
                matrix[0][j] = 0;
            }
        }

        // Zero first column
        if(firstColumn) {
            for(int i = 0; i < matrix.length; i++) {
                matrix[i][0] = 0;
            }
        }
    }
}