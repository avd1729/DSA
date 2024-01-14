import java.util.ArrayList;
public class AllMissingNumbers {
    public static void main(String[] args) {
        int[] arr = {2,2,2,4};
        ArrayList<Integer> ans = finder(arr);
        System.out.println(ans);
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

