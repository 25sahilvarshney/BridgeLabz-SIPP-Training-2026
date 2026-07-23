package Collection_AND_DSA.Recursion_Backtracking;
public class WarehouseGridCoverage {

    public boolean canReachDestination(int[][] grid, int startX, int startY, int targetX, int targetY) {
        int rows = grid.length;
        int cols = grid[0].length;
        boolean[][] visited = new boolean[rows][cols];

        return dfs(grid, startX, startY, targetX, targetY, visited);
    }

    private boolean dfs(int[][] grid, int r, int c, int targetX, int targetY, boolean[][] visited) {
        
        if (r < 0 || r >= grid.length || c < 0 || c >= grid[0].length || grid[r][c] == 1 || visited[r][c]) {
            return false;
        }

        if (r == targetX && c == targetY) {
            return true;
        }

        visited[r][c] = true; 

    
        int[] dRow = {-1, 1, 0, 0};
        int[] dCol = {0, 0, -1, 1};

        for (int i = 0; i < 4; i++) {
            if (dfs(grid, r + dRow[i], c + dCol[i], targetX, targetY, visited)) {
                return true;
            }
        }

        visited[r][c] = false; 
        return false;
    }
}