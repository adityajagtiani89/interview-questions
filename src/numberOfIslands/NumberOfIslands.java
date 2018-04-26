package numberOfIslands;

/**
 * Created by aditya.jagtiani on 4/26/18.
 */
public class NumberOfIslands {
    private static int ROWS = 0;
    private static int COLUMNS = 0;

    public static int numIslands(char[][] grid) {
        ROWS = grid.length;
        if(ROWS == 0) {
            return 0;
        }

        COLUMNS = grid[0].length;

        boolean [][] visited = new boolean [ROWS][COLUMNS];
        int count = 0;
        for(int i = 0; i < ROWS; i ++) {
            for(int j = 0; j < COLUMNS; j ++) {
                if(!visited[i][j] && grid[i][j] == '1') {
                    search(grid, visited, i, j);
                    count++;
                }
            }
        }
        return count;
    }

    private static void search(char[][] grid, boolean[][] visited, int curRow, int curCol) {
        if (curRow < 0 || curRow >= ROWS || curCol < 0 || curCol >= COLUMNS){
            return;
        }

        if(grid[curRow][curCol] != '1' ||  visited[curRow][curCol]) {
            return;
        }
        visited[curRow][curCol] = true;

        search (grid, visited, curRow+1, curCol); //Right
        search (grid, visited, curRow, curCol+1); //Down
        search (grid, visited, curRow-1, curCol); //Left
        search (grid, visited, curRow, curCol-1); //Up
    }
}
