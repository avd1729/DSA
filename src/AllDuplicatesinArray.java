import java.util.ArrayList;

public class AllDuplicatesinArray {
    public static void main(String[] args) {

        int[] arr = {1,1,2,4,6,5,3,3,2};

        ArrayList<Integer> ans = finder(arr);
        System.out.println(ans);

    }

    static ArrayList<Integer> finder(int[] arr){
        sort(arr);
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != i+1 ){
                list.add(arr[i]);
            }
        }
        return list;
    }
    static void sort(int[] arr){
        int i = 0;

        while (i < arr.length){
            int correct = arr[i] - 1;
            if (arr[i] != arr[correct]){
                swap(arr , i , correct);
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
