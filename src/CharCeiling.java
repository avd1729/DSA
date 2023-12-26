public class CharCeiling {
    public static void main(String[] args) {
        char[] arr = {'a','b','z'};
        char target = 'x';
        char ans = findCeiling(arr , target);
        System.out.println(ans);
    }
    static char findCeiling(char[] letters , char target){
        int start = 0;
        int end = letters.length -1;
        int ans = -1;
        while (start <= end){
            int mid = start + (end - start)/2;
            if(letters[mid] > target){
                end = mid-1;
            } else if (letters[mid] < target) {
                start = mid+1;
            }

        }
        return letters[start % letters.length];

    }
}
