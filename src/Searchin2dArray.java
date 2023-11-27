import java.util.Arrays;

public class Searchin2dArray {
    public static void main(String[] args) {
        int[][] arr = {
                {1,4,5},
                {56,7},
                {89,9,0,1}
        };
        int x = 7;
        int[] ans = search(arr , x);
        System.out.println(Arrays.toString(ans));
    }
    static int[] search(int[][] arr , int target){
        for(int row=0 ; row < arr.length ; row++){
            for(int col=0 ; col < arr[row].length ;col++){
                if (arr[row][col] == target){
                    return new int[]{row,col};
                }
            }
        }
        return new int[]{-1,-1};
    }
}
