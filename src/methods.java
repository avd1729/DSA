import java.util.Scanner;

public class methods {
    public static void main(String[] args) {
        sum();
    }
    static void sum(){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = a+b;
        System.out.println(sum);
    }
}
