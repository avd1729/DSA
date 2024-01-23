import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {2,3,5,1,4};
        sort(arr , 0 , arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    static void sort(int[] arr , int low , int high){
        if (low >= high){
            return;
        }
        int s = low;
        int e = high;
        int pivot = findPivot(arr , s , e);

        // it is already sorted it will not swap
        while (s <= e){
            while (arr[s] < pivot){
                s++;
            }
            while (arr[e] > pivot){
                e--;
            }
            if (s <= e){
                swap(arr , s , e);
                s++;
                e--;
            }
        }

        sort(arr , low , e);
        sort(arr , s , high);
    }

    static void swap(int[] arr , int first , int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    // best case - O(NlogN) for pivot as middle element

    static int findPivot(int[] arr , int s , int e){
        int m = s + (e - s)/2;
        return arr[m];
    }

}
