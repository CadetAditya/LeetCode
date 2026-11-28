
class Solution {
    public int[][] spiralMatrixIII(int rows, int cols,int rStart, int cStart) {

        int total = rows * cols;
        int[][] ans = new int[total][2];

        int index = 0;
        int r = rStart;
        int c = cStart;

        ans[index++] = new int[]{r, c};

        int[][] directions = {
            {0, 1},   // East
            {1, 0},   // South
            {0, -1},  // West
            {-1, 0}   // North
        };

        int steps = 1;
        int dir = 0;

        while (index < total) {

            for (int turn = 0; turn < 2; turn++) {

                int dr = directions[dir][0];
                int dc = directions[dir][1];

                for (int i = 0; i < steps; i++) {
                    r += dr;
                    c += dc;

                    if (r >= 0 && r < rows &&
                        c >= 0 && c < cols) {

                        ans[index++] = new int[]{r, c};

                        if (index == total) {
                            return ans;
                        }
                    }
                }

                dir = (dir + 1) % 4;
            }

            steps++;
        }

        return ans;
    }
}
