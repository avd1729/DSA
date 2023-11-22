import java.util.Scanner;

public class LargestNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int max = a;

        if (max > b){
            if (max > c){
                System.out.println("Maximum value is A , " + max);
            }
            else{
                max = c;
                System.out.println("Maximum value is C , " + max);
            }
        } else {
            if (b > c){
                max = b;
                System.out.println("Maximum value is B , " + max);
            }
            else{
                max = c;
                System.out.println("Maximum value is C , " + max);
            }
        }
    }
}
