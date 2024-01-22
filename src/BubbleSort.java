import java.util.Arrays;

public class BubbleSort {
    // aka sinking sort or exchange sort
    public static void main(String[] args) {
        int[] arr1 = {2,6,3,1,8,9,7};
        int[] arr2 = {2,6,3,1,8,9,7};
        sort(arr1);
        System.out.println(Arrays.toString(arr1));
        recursivesort(arr2,arr2.length-1,0);
        System.out.println(Arrays.toString(arr2));

    }
    // in-place sort
    static void sort(int[] arr){
        boolean swapped;
        // for each step , max item will come at the last respective index.
        for (int i = 0; i < arr.length; i++) {
            swapped = false;
            for (int j = 1; j < arr.length - i ; j++) {
                if (arr[j] < arr[j-1]){
                    // swap
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    swapped = true;
                }
            }
            // if you did not swap for a particular value of i , it means the array is sorted , hence stop the program
            if(!swapped){
                break;
            }
        }
    }

    static void recursivesort(int[] arr , int r , int c){

        if (r == 0){
            return;
        }

        if (c < r){

            if (arr[c] > arr[c+1]){

                int temp = arr[c];
                arr[c] = arr[c+1];
                arr[c+1] = temp;
            }
            recursivesort(arr , r,c+1);
        }
        else{
            recursivesort(arr , r-1 , 0);
        }

    }
}
