public class SplitArray {
    public static void main(String[] args) {
        int[] arr = {7,2,4,10,8};
        System.out.println(splitarray(arr , 2));
    }
    public static int splitarray(int[] nums , int m){
        int start = 0;
        int end = nums.length - 1;

        for(int i = 0 ; i < nums.length ; i++){
            start = Math.max(start , nums[i]);
            end += nums[i];
        }

        while (start < end){

            int mid = start + (end - start)/2;

            int sum = 0;
            int pieces = 1;
            for(int num:nums){
                if (sum + num > mid){
                    // you cannot add the element in subarray , make new array
                    sum = num;
                    pieces++;
                }
                else{
                    sum += num;
                }
            }
            if (pieces > m){
                start = mid + 1;
            }
            else{
                end = mid;
            }

        }
        return end;
    }
}
