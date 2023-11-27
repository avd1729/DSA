public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        int idx = find(arr,5);
        System.out.println(idx);
    }
    static int find(int[] arr , int element){
        for (int i=0 ; i < arr.length ; i++){
            if(arr[i] == element){
                return i;
            }
        }
        return -1;
    }

}
