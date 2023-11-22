import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ans = 0;
        while (true) {
            char op = sc.next().trim().charAt(0);
            if (op == '+' || op == '-' || op == '*' || op == '/') {
                int a = sc.nextInt();
                int b = sc.nextInt();
                if (op == '+') {
                    ans = a + b;
                } else if (op == '-') {
                    ans = a - b;
                } else if (op == '*') {
                    ans = a * b;
                } else {
                    ans = a / b;
                }
            } else if (op == 'x') {
                break;
            }System.out.println(ans);
        }

    }
}

