import java.util.Arrays;

public class BinarySearch2DOptimized {
    public static void main(String[] args) {
        int[][] arr = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        int target = 6;
        // O(logn + logm) time complexity
        int[] ans = search(arr,target);
        System.out.println(Arrays.toString(ans));
    }
    static int[] search(int[][] matrix , int target){
        int rows = matrix.length;
        int cols = matrix[0].length;

        if (rows == 1){
            return BinarySearch(matrix , 0 , 0 , cols-1,target);
        }
        int rStart = 0;
        int rEnd = rows - 1;
        int cMid = cols/2;

        while (rStart < (rEnd-1)){
            int mid = rStart + (rEnd - rStart)/2;

            if(matrix[mid][cMid] == target){
                return new int[]{mid,cMid};
            }
            if(matrix[mid][cMid] < target){
                rStart = mid;
            }
            else{
                rEnd = mid;
            }

            // now we have two rows
            // check whether the target is in the col of 2 rows
            if(matrix[rStart][cMid] == target){
                return new int[]{rStart,cMid};
            }
            if(matrix[rStart+1][cMid] == target){
                return new int[]{rStart+1,cMid};
            }
            // first half
            if (target <= matrix[rStart][cMid-1]){
                return BinarySearch(matrix , rStart , 0 , cMid-1 , target);
            }
            // second half
            if (target <= matrix[rStart][cMid+1] && target <= matrix[rStart][cols-1]){
                return BinarySearch(matrix , rStart , cMid+1 , cols-1 , target);
            }
            // third half
            if (target <= matrix[rStart+1][cMid-1]){
                return BinarySearch(matrix , rStart+1 , 0 , cMid-1 , target);
            }
            // fourth half
            else{
                return BinarySearch(matrix , rStart+1 , cMid+1 , cols-1 , target);
            }

        }
        return new int[]{-1,-1};
    }
    static int[] BinarySearch(int[][] matrix , int row , int cStart , int cEnd , int target){

        while(cStart <= cEnd){
            int mid = cStart + (cEnd - cStart)/2;
            if (matrix[row][mid] > target){
                cEnd = mid - 1;
            } else if (matrix[row][mid] < target) {
                cStart = mid + 1;
            }
            else{
                return new int[]{row,mid};
            }
        }
        return new int[]{-1,-1};
    }
}
