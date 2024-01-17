import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long a = 0;
        long b = 1;
        long count = 2;
        while (count <= n){
            long temp = b;
            b = b+a;
            a = temp;
            count++;
        }
        System.out.println(b);

        System.out.println(fibformula(n));
    }

    static long fibformula(int n){
        return (long) ((Math.pow(((1+Math.sqrt(5))/2),n)-Math.pow(((1-Math.sqrt(5))/2),n))/Math.sqrt(5));
    }
}
