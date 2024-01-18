public class BinarySearch {
    public static void main(String[] args) {

        int[] arr = {-4, -3, -1, 0, 2, 3, 5, 6, 7, 9, 10, 11};
        int target = 6;
        int ans1 = BinarySearchIterative(arr, target);
        System.out.println(ans1);
        int ans2 = BinarySearchRecursive(arr, 0, arr.length - 1, target);
        System.out.println(ans2);
    }

    static int BinarySearchIterative(int[] arr, int target) {

        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < arr[mid]) {
                end = mid - 1;
            }
            else if (target > arr[mid]) {
                start = mid + 1;
            }
            else {
                return mid;
            }
        }
        return -1;
    }

    static int BinarySearchRecursive(int[] arr, int start, int end, int target) {

        if (start > end) {
            return -1;
        }

        int mid = start + (end - start) / 2;

        if (target < arr[mid]) {
            return BinarySearchRecursive(arr, start, mid - 1, target);
        }
        else if (target > arr[mid]) {
            return BinarySearchRecursive(arr, mid + 1, end, target);
        }
        else {
            return mid;
        }
    }

}
