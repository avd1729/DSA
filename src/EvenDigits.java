import java.util.Scanner;

public class EvenDigits {
    public static void main(String[] args) {
        int[] n = {22,34,5667,12,345};
        int ans = findNumbers(n);
        System.out.println(ans);
    }
    static int findNumbers(int[] arr){
        int ans = 0;
        for (int num:arr){
            if(even(num)){
                ans++;
            }
        }
        return ans;
    }
    static boolean even(int i){
        int count = 0;
        if (i > 0) {
            do {
                count++;
                i = i / 10;
            } while (i > 0);
        }
        return count % 2 == 0;
    }
}
