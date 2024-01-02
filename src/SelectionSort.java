import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {2,6,3,1,8,9,7};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void sort(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            // find the max element and swap
            int last = arr.length - i - 1;
            int maxIndex = getMaxIndex(arr , 0 , last);
            swap(arr , maxIndex , last);
        }
    }

    static int getMaxIndex(int[] arr , int start , int end) {
        int max = start;

        for (int i = start; i <= end ; i++) {
            if(arr[max] < arr[i]){
                max = i;
            }
        }
        return max;
    }

    static void swap(int[] arr , int first , int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
