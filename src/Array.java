import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        //int a = 10;
        // datatype[] var = new datatype[size]
        int[] b = new int[10];
        int[] c = {1,2,3,4,5};
        int[] d;
//        System.out.println(c[0]);
//        c[0] = 9;
//        System.out.println(c[0]);
        for (int i = 0; i < b.length; i++){
            b[i] = i;
        }
        for (int j : b) {
            System.out.print(j + " "); //enhanced for loop
        }
        System.out.print(Arrays.toString(b));
    }
}
