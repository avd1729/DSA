import java.util.ArrayList;

public class FirstMissingPositive {
    public static void main(String[] args) {
        int[] arr = {3,4,-1,1};
        int[] arr_processed = removingnegatives(arr);
        ArrayList<Integer> ans = finder(arr_processed);
        System.out.println(ans);
    }

    static int[] removingnegatives(int[] arr){
        int[] arr2 = new int[arr.length];
        int temp = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0){
                arr2[temp] = arr[i];
                temp++;
            }
        }
        return arr2;
    }
    static ArrayList<Integer> finder(int[] arr){
        sort(arr);
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != i){
                list.add(i);
            }
        }
        return list;
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
