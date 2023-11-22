public class OverLoading {
    public static void main(String[] args) {
        fn(7);
        fn("Hey");
    }
    static void fn(int a){
        System.out.println(a);
    }
    static void fn(String b){
        System.out.println(b);
    }
}
