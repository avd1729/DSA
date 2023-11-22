public class Reverse {
    public static void main(String[] args) {
        int n = 123456;
//        while (n > 0){
//            int x = n%10;
//            System.out.println(x);
//            n /= 10;
//        }
        int res = 0;
        while (n > 0){
            int x = n%10;
            res = res * 10 + x;
            n /= 10;
        }
        System.out.println(res);

    }
}
