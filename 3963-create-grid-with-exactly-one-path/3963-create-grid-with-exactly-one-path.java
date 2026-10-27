import java.util.Arrays;

class Solution {
    public String[] createGrid(int m, int n) {
        char[][] arr = new char[m][n];

        for (int i = 0; i < m; i++) {
            Arrays.fill(arr[i], '#');
        }

        // Open the entire first row
        Arrays.fill(arr[0], '.');

        // Open the last column
        for (int i = 0; i < m; i++) {
            arr[i][n - 1] = '.';
        }

        String[] ans = new String[m];

        for (int i = 0; i < m; i++) {
            ans[i] = new String(arr[i]);
        }

        return ans;
    }
}