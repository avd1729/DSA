import java.util.Arrays;

public class ImageFlipping {
    public static void main(String[] args) {
        int[][] arr = {
            {1,1,0},
            {1,0,1},
            {0,0,0}
        };
        System.out.println(Arrays.toString(arr[0]));
        int[][] ans =  flipninvert(arr);
        System.out.println(Arrays.toString(ans[0]));
    }
    static int[][] flipninvert(int[][] arr){
        for (int i = 0; i < arr.length; i++) {
            arr[i] = reverse(arr[i]);
        }

        return arr;
    }
    static void swap(int[] arr , int index1 ,int index2){
        int temp = arr[index1] ^ 1;
        arr[index1] = arr[index2] ^ 1;
        arr[index2] = temp;
        //System.out.println(Arrays.toString(arr));
    }
    static int[] reverse(int[] arr){
        int start = 0;
        int end = arr.length - 1;
        // row[i] = row[row.length-i-1]

        while(start < end){
            swap(arr , start , end);
            start++;
            end--;
        }
        return arr;

    }
}
