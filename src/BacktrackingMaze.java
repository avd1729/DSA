import java.util.ArrayList;
import java.util.Arrays;

public class BacktrackingMaze {
    public static void main(String[] args) {

        boolean[][] board = {
                {true , true , true},
                {true , true , true},
                {true , true , true}
        };

        //System.out.println(path(board,0,0,""));
        pathPrint(board,0,0,"",new int[board.length][board[0].length],1);
    }
    static ArrayList<String> path (boolean[][] maze , int r , int c , String p){

        ArrayList<String> list = new ArrayList<>();

        if (r == maze.length-1 && c == maze[0].length-1){
            list.add(p);
            return list;

        }

        if (!maze[r][c]){
            return list;
        }

        ArrayList<String> ans = new ArrayList<>();

        maze[r][c] = false; // Setting the path followed as false

        // Left
        if (c > 1){
            ans.addAll(path(maze ,r , c-1 , p+"L"));
        }
        // Right
        if (c < maze.length-1){
            ans.addAll(path(maze ,r , c+1 , p+"R"));
        }
        // Up
        if (r > 1){
            ans.addAll(path(maze ,r-1 , c , p+"U"));
        }
        // Down
        if (r < maze[0].length-1){
            ans.addAll(path(maze ,r+1 , c , p+"D"));
        }

        maze[r][c] = true; // Resetting the path
        list.addAll(ans);

        return list;
    }

    static void pathPrint (boolean[][] maze , int r , int c , String p , int[][] path , int step){


        if (r == maze.length-1 && c == maze[0].length-1){
            path[r][c] = step;
            System.out.println(p);
            printMatrix(path);
            return;

        }

        if (!maze[r][c]){
            return;
        }

        ArrayList<String> ans = new ArrayList<>();

        maze[r][c] = false; // Setting the path followed as false
        path[r][c] = step;

        // Left
        if (c > 1){
            pathPrint(maze ,r , c-1 , p+"L" , path , step+1);
        }
        // Right
        if (c < maze.length-1){
            pathPrint(maze ,r , c+1 , p+"R", path , step+1);
        }
        // Up
        if (r > 1){
            pathPrint(maze ,r-1 , c , p+"U", path , step+1);
        }
        // Down
        if (r < maze[0].length-1){
            pathPrint(maze ,r+1 , c , p+"D", path , step+1);
        }

        maze[r][c] = true; // Resetting the path
        path[r][c] = 0;

    }

    static void printMatrix(int[][] path){
        for(int[] arr:path){
            System.out.println(Arrays.toString(arr));
        }
        System.out.println();
    }
}
