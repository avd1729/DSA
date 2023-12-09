public class OrderAgnosticBinarySearch {
    public static void main(String[] args) {
        int[] arr = {23,22,17,16,5,2};
        int target = 5;
        int ans = search(arr , target);
        System.out.println(ans);
    }
    static int search(int[] arr , int target){
        int start = 0;
        int end = arr.length - 1;
        boolean isAsc = arr[start] < arr[end];
        if(isAsc){
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
        }
        else {
            while (start <= end){
                int mid = start + (end - start)/2 ;
                if (target > arr[mid]){
                    end = mid-1;
                } else if (target < arr[mid]) {
                    start = mid+1;
                }
                else {
                    return mid;
                }
            }
        }
        return -1;
    }
}
