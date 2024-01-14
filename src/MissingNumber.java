// [0 , n] , O(1) space complexity and O(n) time complexity

import java.util.Arrays;
public class MissingNumber {
    public static void main(String[] args) {
        int[] arr = {1,2,0,4};
        //System.out.println(Arrays.toString(arr));
        int ans = finder(arr);
        System.out.println(ans);
    }

    static int finder(int[] arr){
        sort(arr);
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != i){
                return i;
            }
        }
        return arr.length; // n is not found
    }

    static void sort(int[] arr){

        int i = 0;

        while (i < arr.length){
            if (arr[i] < arr.length && arr[i] != arr[arr[i]]){
                swap(arr , i , arr[i]);
            }
            else{
                i++;
            }
        }

    }

    static void swap(int[] arr , int first , int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

}
