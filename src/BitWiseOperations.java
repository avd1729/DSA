public class BitWiseOperations {
    public static void main(String[] args) {
        int n = 79;
        //System.out.println(isOdd(n));
        int[] arr = {2,3,3,4,2,6,4};
        //System.out.println(duplicates(arr));
    }
    static boolean isOdd(int n){
        return (n & 1) == 1;
    }

    static int duplicates(int[] arr){
        int unique = 0;
        for (int i = 0; i < arr.length; i++) {
            unique ^= arr[i];
        }
        return unique;
    }

}
