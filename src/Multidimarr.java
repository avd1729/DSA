import java.util.Arrays;
import java.util.Scanner;

public class Multidimarr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[3][3]; // not mandatory to add column size
        int[][] x = {
                {1,2,3},
                {4,5},
                {6,7,8,9}
        };
        for (int i=0;i<arr.length;i++){
            for (int j=0;j<arr[i].length;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        for (int[] ints : arr) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }
        for(int[] a : arr){
            System.out.println(Arrays.toString(a));
        }

    }
}
