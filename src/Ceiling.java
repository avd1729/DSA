public class Ceiling {
    public static void main(String[] args) {
        int[] arr = {-4,-3,-1,0,2,3,5,6,7,9,10,11};
        int target = 4;
        int ans = findCeiling(arr , target);
        System.out.println(ans);
    }
    static int findCeiling(int[] arr , int target){
        int start = 0;
        int end = arr.length -1;
        int ans = -1;
        while (start <= end){
            int mid = start + (end - start)/2;
            if(arr[mid] > target){
                end = mid-1;
            } else if (arr[mid] < target) {
                start = mid+1;
            }
            else{
                return mid;
            }
            ans = mid;
        }
        return ans;
    }
}
