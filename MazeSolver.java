public class MazeSolver {

    public static void allDirectionPathPrint(String p, boolean[][] maze, int row, int col) {
        // Base condition: reached bottom-right corner
        if (row == maze.length - 1 && col == maze[0].length - 1) {
            System.out.println(p);
            return;
        }
    
        // Hurdle condition: if already visited or not allowed
        if (!maze[row][col]) {
            return;
        }
    
        // Mark the cell as visited
        maze[row][col] = false;
    
        // Explore Down
        if (row < maze.length - 1) {
            allDirectionPathPrint(p + 'D', maze, row + 1, col);
        }
    
        // Explore Right
        if (col < maze[0].length - 1) {
            allDirectionPathPrint(p + 'R', maze, row, col + 1);
        }
    
        // Explore Up
        if (row > 0) {
            allDirectionPathPrint(p + 'U', maze, row - 1, col);
        }
    
        // Explore Left
        if (col > 0) {
            allDirectionPathPrint(p + 'L', maze, row, col - 1);
        }
    
        // Backtrack: mark the cell as unvisited again
        maze[row][col] = true;
    }      
    public static void main(String[] args) {
    boolean[][] maze = {
        {true, true, true},
        {true, true, true},
        {true, true, true}
    };
    allDirectionPathPrint("", maze, 0, 0);
    }
}       