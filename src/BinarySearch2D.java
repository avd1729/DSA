public class BinarySearch2D {
    public static void main(String[] args) {
        int[][] arr = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        int target = 5;
        int[] ans = Searchin2D(arr,target);
        System.out.println(ans[0]);
        System.out.println(ans[1]);

    }

    static int[] Searchin2D(int[][] arr , int target){
        int[] ans = {-1,-1};
        for(int i = 0 ; i < arr[0].length ; i++){
            int idx = BinarySearch(arr[i] , target);
            if (idx != -1){
                ans[0] = i;
                ans[1] = idx;
                return ans;
            }
        }
        return ans;

    }
    static int BinarySearch(int[] arr , int target){
        int start = 0;
        int end = arr.length - 1;

        while(start <= end){
            int mid = start + (end - start)/2;
            if (arr[mid] > target){
                end = mid - 1;
            } else if (arr[mid] < target) {
                start = mid + 1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
}

// O(nlogn) time complexity