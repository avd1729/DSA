public class DuplicateNumber {
    public static void main(String[] args) {

        int[] arr = {1,2,4,6,5,3,3};

        int ans = finder(arr);
        System.out.println(ans);

    }

    static int finder(int[] arr){
        sort(arr);
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != i+1 ){
                return arr[i];
            }
        }
        return -1;
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
