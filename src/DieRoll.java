import java.util.ArrayList;

public class DieRoll {
    public static void main(String[] args) {
        subsets1("",4);
        System.out.println(subsets2("",4));
    }
    static void subsets1 (String p , int up){

        if (up == 0){
            System.out.println(p);
            return;
        }

        for (int i = 1; i <= 6 && i <= up; i++) {
            subsets1(p+i,up-i);
        }
    }

    static ArrayList<String> subsets2 (String p , int up){

        ArrayList<String> list = new ArrayList<>();

        if (up == 0){
            list.add(p);
            return list;
        }

        for (int i = 1; i <= 6 && i <= up; i++) {
            ArrayList<String> ans = subsets2(p+i,up-i);
            list.addAll(ans);
        }
        return list;
    }
}

