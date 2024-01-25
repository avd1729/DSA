import java.util.ArrayList;

public class Maze {
    public static void main(String[] args) {

        System.out.println(count(3,3));

        path1(3,3,"");

        System.out.println(path2(3,3,""));

        System.out.println(path3(3,3,""));

        boolean[][] board = {
                {true , true , true},
                {true , false , true},
                {true , true , true}
        };
        System.out.println(path4(board,0,0,""));
    }
    static int count(int r , int c){

        if (r == 1 || c == 1){
            return 1;
        }

        int right = count(r , c-1 );
        int down = count(r-1,c);

        return right + down;
    }

    static void path1 (int r , int c , String p){

        if (r == 1 && c == 1){
            System.out.println(p);
        }
        // Down
        if (r > 1){
            path1(r-1,c , p+"D");
        }
        // Right
        if (c > 1){
            path1(r , c-1 ,p+"R");
        }

    }

    static ArrayList<String> path2 (int r , int c , String p){

        ArrayList<String> list = new ArrayList<>();

        if (r == 1 && c == 1){
            list.add(p);
            return list;

        }

        ArrayList<String> ans = new ArrayList<>();

        // Right
        if (c > 1){
            ans.addAll(path2(r , c-1 , p+"R"));
        }
        // Down
        if (r > 1){
            ans.addAll(path2(r-1 , c , p+"D"));
        }

        list.addAll(ans);
        return list;
    }


    static ArrayList<String> path3 (int r , int c , String p){

        ArrayList<String> list = new ArrayList<>();

        if (r == 1 && c == 1){
            list.add(p);
            return list;

        }

        ArrayList<String> ans = new ArrayList<>();

        // Right - horizontal
        if (c > 1){
            ans.addAll(path3(r , c-1 , p+"H"));
        }
        // Down - vertical
        if (r > 1){
            ans.addAll(path3(r-1 , c , p+"V"));
        }
        // Diagonal
        if (c > 1 && r > 1){
            ans.addAll(path3(r-1 , c-1 , p+"D"));
        }

        list.addAll(ans);
        return list;
    }

    // Maze with obstacles
    static ArrayList<String> path4 (boolean[][] maze , int r , int c , String p){

        ArrayList<String> list = new ArrayList<>();

        if (r == maze.length-1 && c == maze[0].length-1){
            list.add(p);
            return list;

        }

        if (!maze[r][c]){
            return list;
        }

        ArrayList<String> ans = new ArrayList<>();

        // Right
        if (c < maze.length-1){
            ans.addAll(path4(maze ,r , c+1 , p+"R"));
        }
        // Down
        if (r < maze[0].length-1){
            ans.addAll(path4(maze ,r+1 , c , p+"D"));
        }

        list.addAll(ans);
        return list;
    }

}
