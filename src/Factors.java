import java.util.ArrayList;
import java.util.Collections;

public class Factors {
    public static void main(String[] args) {
        int n = 40;
        ArrayList<Integer> arr = factors1(n);
        System.out.println(arr);
        ArrayList<Integer> arr2 = factors2(n);
        System.out.println(arr2);
    }
    // O(n)
    static ArrayList<Integer> factors1 (int n){
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 1; i <= n/2; i++) {
            if (n%i==0){
                arr.add(i);
            }
        }
        arr.add(n);
        return arr;
    }

    // O(sqrt(n))
    static ArrayList<Integer> factors2 (int n){
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n%i==0){
                if (n%i==i){
                    arr.add(i);
                }
                else{
                    arr.add(i);
                    arr.add(n/i);
                }
            }
        }
        Collections.sort(arr);
        return arr;
    }

}
