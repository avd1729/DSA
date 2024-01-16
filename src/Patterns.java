public class Patterns {
    public static void main(String[] args) {
        int n = 5;
        pattern1(n);
        pattern2(n);
        pattern3(n);
        pattern3_2(n);
        pattern4(n);
        pattern5(n);
        pattern6(n);
    }

    static void pattern1(int n){
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
    }
    static void pattern2(int n){
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
    }

    static void pattern3(int n){
        for (int i = n; i >= 1; i--) {
            for (int j = i; j >= 1; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
    }
    static void pattern3_2(int n){
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n-i+1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
    }
    static void pattern4(int n){
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
        System.out.println();
    }
    static void pattern5(int n){
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = n-1; i >= 1; i--) {
            for (int j = i; j >= 1; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
    }
    static void pattern6(int n){

        for (int i = 0; i <= 2 * n; i++) {

            int cols = i > n ? 2 * n - i: i;
            int spaces = n - cols;

            for (int s = 0; s < spaces; s++) {
                System.out.print(" ");
            }
            for (int j = 0; j < cols; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println();
    }
}
