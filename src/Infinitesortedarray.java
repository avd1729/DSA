public class Infinitesortedarray {
    public static void main(String[] args) {
        int arr[] = {
                3,4,5,6,7,8,9,10,14,16
        };
        int target = 6;
        System.out.println(ans(arr,target));
    }
    static int ans(int[] arr , int target){
        // start with a box of size 2
        int start = 0;
        int end = 1;
        while(target > arr[end]){
            int temp = end + 1;
            end = end + 2 * (end - start + 1); // need my old start !!!
            start = temp;
        }
        return search(arr , target , start , end);
    }
    static int search(int[] arr , int target , int start , int end){

        while (start <= end){
            int mid = start + (end - start)/2 ;
            if (target < arr[mid]){
                end = mid-1;
            } else if (target > arr[mid]) {
                start = mid+1;
            }
            else {
                return mid;
            }
        }
        return -1;
    }
}
