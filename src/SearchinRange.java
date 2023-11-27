public class SearchinRange {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        int idx = range(arr , 4 , 1,2);
        System.out.println(idx);
    }
    static int range(int[] arr , int target,int start , int end){
        if(arr.length == 0){
            return -1;
        }
        for(int index = start; index <= end ; index++){
            if (target == arr[index]){
                return index;
            }
        }
        return -1;
    }
}
