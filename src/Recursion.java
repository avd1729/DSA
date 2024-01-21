public class Recursion {
    public static void main(String[] args) {
        nto1(5);
        nto1Rev(5);
        System.out.println(factorial(5));
        System.out.println(sum(10));
        System.out.println(sumofdigits(135444));
        System.out.println(prodofdigits(512));
        reverse(12345);
        reverse2(862,0);
        System.out.println(reverse3(763));
    }
    static void nto1(int n){
        if (n==0){
            return;
        }
        System.out.println(n);
        nto1(n-1);
    }
    static void nto1Rev(int n){
        if (n==0){
            return;
        }
        nto1Rev(n-1);
        System.out.println(n);
    }
    static int factorial(int n){
        if (n >= 0) {
            if (n==1){
                return 1;
            }
            else return n * factorial(n - 1);
        }
        return -1;
    }

    static int sum(int n){
        if (n >= 0) {
            if (n==1){
                return 1;
            }
            else return n + sum(n - 1);
        }
        return -1;
    }

    static int sumofdigits(int n){

        if (n>0){
            if (n < 10){
                return n;
            }
            else{
                int temp = n%10;
                n/=10;
                return temp + sumofdigits(n);
            }
        }
        return -1;
    }

    static int prodofdigits(int n){

        if (n>0){
            if (n < 10){
                return n;
            }
            else{
                int temp = n%10;
                n/=10;
                return temp * prodofdigits(n);
            }
        }
        return -1;
    }
    static int res = 0;
    static void reverse(int n){

        if (n == 0){
            System.out.println(res);
        }
        else{
            int num = n%10;
            n /= 10;
            res = res * 10 + num;
            reverse(n);
        }
    }

    static void reverse2(int n , int ans){

        //int base = (int)(Math.log10(n))+1;

        if (n == 0){
            System.out.println(ans);
        }
        else{
            int num = n%10;
            n /= 10;
            ans = ans * 10 + num;
            reverse2(n , ans);
        }
    }

    static int reverse3(int n){

        int digits = (int)(Math.log10(n))+1;
        
        return helper(n,digits);

    }

    private static int helper(int n, int digits) {
        if (n%10 == n){
            return n;
        }
        int num = n%10;
        return num * (int)(Math.pow(10 , digits-1)) + helper(n/10 , digits-1);
    }

}
