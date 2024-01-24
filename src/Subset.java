import java.util.ArrayList;

public class Subset {
    public static void main(String[] args) {
        subsets1("","abc");
        System.out.println(subsets2("","abc"));
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
}
