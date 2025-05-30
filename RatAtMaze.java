import java.util.*;

public class RatAtMaze {
    // To store all valid paths
    static ArrayList<String> allPaths = new ArrayList<>();

    public static void ratAtmaze(int maze[][], int r, int c, String path, boolean[][] vis) { 
        int n = maze.length;

        // Base Cases
        if(r < 0 || c < 0 || r >= n || c >= n || maze[r][c] == 0 || vis[r][c] == true) {
            return;
        }

        // Destination reached
        if (r == n-1 && c == n-1) {
            allPaths.add(path);
            return;
        }

        // Mark current cell visited
        vis[r][c] = true;
        
        // Recursion call (Move in all four directions)
        ratAtmaze(maze, r+1, c, path+"D",  vis);  // down
        ratAtmaze(maze, r-1, c, path+"U",  vis);  // up
        ratAtmaze(maze, r, c-1, path+"L",  vis);  // left
        ratAtmaze(maze, r, c+1, path+"R",  vis);  // right
        
        // Backtrack
        vis[r][c] = false;
    }

    public static List<String> findPath(int maze[][]) {

        int n = maze.length;
        boolean vis[][] = new boolean[n][n];
        allPaths.clear(); // Clear in case reused
        ratAtmaze(maze, 0, 0, "", vis);

        return allPaths;
    }

    public static void main(String[] args) {
        int maze[][] = {{1,0,0,0},
                        {1,1,0,0},
                        {0,1,0,0},
                        {1,1,1,1}};
        
        List<String> result = findPath(maze);
        if(result.size() == 0) {
            System.out.println("No path found.");
        }
        else {
            System.out.print("Paths : ");
            for(String path : result) {
                System.out.println(path);
            }
        }
    }
}
