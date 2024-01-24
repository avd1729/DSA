import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Subset {
    public static void main(String[] args) {
        subsets1("","abc");
        System.out.println(subsets2("","abc"));
        System.out.println(subsets3(new int[] {1,2,3}));
        System.out.println(subsets4(new int[] {1,2,2}));
    }

    static void subsets1 (String p , String up){

        if (up.isEmpty()){
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);

        // taking an element
        subsets1(p+ch, up.substring(1));

        // skipping an element
        subsets1(p, up.substring(1));
    }

    static ArrayList<String> subsets2 (String p , String up){

        if (up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        char ch = up.charAt(0);

        // taking an element
        ArrayList<String> left =  subsets2(p+ch, up.substring(1));

        // skipping an element
        ArrayList<String> right = subsets2(p, up.substring(1));

        left.addAll(right);
        return left;

    }

    // Iteration

    static List<List<Integer>> subsets3(int[] arr){

        List<List<Integer>> list = new ArrayList<>();

        list.add(new ArrayList<>());

        for (int num : arr){
            int size = list.size();
            for (int i = 0; i < size; i++) {
                List<Integer> inner = new ArrayList<>(list.get(i));
                inner.add(num);
                list.add(inner);
            }
        }

        return list;
    }

    // Duplicates

    /* when you find a duplicate , only add it in the newly created subset of previous step
    duplicates have to be together
    */

    static List<List<Integer>> subsets4(int[] arr){

        Arrays.sort(arr);

        List<List<Integer>> list = new ArrayList<>();

        list.add(new ArrayList<>());

        int s = 0;
        int e = 0;

        for (int i = 0; i < arr.length; i++) {
            // if current and previous element are same , s = e+1

            if (i > 0 && arr[i] == arr[i-1]){
                s = e + 1;
            }
            e = list.size()-1;
            int n = list.size();
            for (int j = s; j < n; j++) {
                List<Integer> inner = new ArrayList<>(list.get(j));
                inner.add(arr[i]);
                list.add(inner);
            }
        }

        return list;
    }


}
