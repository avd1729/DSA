import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
    fn(5,6,7,8,9,12,34);
    fn2(1,2,'g','b',"string in double quotes");
    }
    static void fn(int ...x){
        System.out.println(Arrays.toString(x));
    }
    static void fn2(int a , int b , char g, char c, String ...x){

    }
}
