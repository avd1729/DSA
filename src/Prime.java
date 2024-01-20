import java.util.ArrayList;

public class Prime {
    public static void main(String[] args) {
        int n = 40;
        //boolean ans = isPrime(n);
        //System.out.println(ans);
        ArrayList<Integer> ans = primerange(n);
        System.out.println(ans);
    }
    static boolean isPrime(int n){

        if (n<=1){
            return false;
        }

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n%i == 0){
                return false;
            }
        }
        return true;
    }

    static ArrayList<Integer> primerange(int n){
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i <= n; i++) {
            if (isPrime(i)){
                arr.add(i);
            }
        }
        return arr;
    }
    // O(n*root(n))
}
