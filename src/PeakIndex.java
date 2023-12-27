public class PeakIndex {
    public static void main(String[] args) {
        int[] arr = {
              1,2,3,4,6,4,3,1
        };
        int ans = search(arr);
        System.out.println(ans);
    }
    static int search(int[] arr){
        int start = 0;
        int end = arr.length - 1;
        while (start <= end){
            int mid = start + (end - start)/2 ;
            if (arr[mid+1] < arr[mid]) {
                end = mid;
            }
            else {
                start = mid + 1;
            }
        }
        return start;
    }
}
