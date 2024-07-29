class Solution {
    public int[][] generateMatrix(int n) {
        int[][] ans = new int[n][n];
        int rowBegin = 0;
        int rowEnd = n - 1;
        int colBegin = 0;
        int colEnd = n - 1; 
        int num = 1;

        while (rowBegin <= rowEnd && colBegin <= colEnd) {
            // Traverse from left to right
            for (int i = colBegin; i <= colEnd; i++) {
                ans[rowBegin][i] = num++;
            }
            rowBegin++;

            // Traverse from top to bottom
            for (int i = rowBegin; i <= rowEnd; i++) {
                ans[i][colEnd] = num++;
            }
            colEnd--;

            // Check if there are rows remaining
            if (rowBegin <= rowEnd) {
                // Traverse from right to left
                for (int i = colEnd; i >= colBegin; i--) {
                    ans[rowEnd][i] = num++;
                }
                rowEnd--;
            }

            // Check if there are columns remaining
            if (colBegin <= colEnd) {
                // Traverse from bottom to top
                for (int i = rowEnd; i >= rowBegin; i--) {
                    ans[i][colBegin] = num++;
                }
                colBegin++;
            }
        }

        return ans; 
    }
}
