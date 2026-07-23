package Collection_AND_DSA.Recursion_Backtracking;
public class LogPatternMatcher {

    public boolean findAnomalyPattern(char[][] logGrid, String pattern) {
        int rows = logGrid.length;
        int cols = logGrid[0].length;

        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                if (logGrid[r][c] == pattern.charAt(0)) {
                    if (searchPattern(logGrid, pattern, r, c, 0)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    private boolean searchPattern(char[][] grid, String pattern, int r, int c, int index) {
        if (index == pattern.length()) {
            return true;
        }

        if (r < 0 || r >= grid.length || c < 0 || c >= grid[0].length || grid[r][c] != pattern.charAt(index)) {
            return false;
        }

        char temp = grid[r][c];
        grid[r][c] = '#'; 

        int[] dRow = {-1, 1, 0, 0};
        int[] dCol = {0, 0, -1, 1};

        for (int i = 0; i < 4; i++) {
            if (searchPattern(grid, pattern, r + dRow[i], c + dCol[i], index + 1)) {
                grid[r][c] = temp; 
                return true;
            }
        }

        grid[r][c] = temp;
        return false;
    }
}