import java.util.ArrayList;

public class Permutations {
    public static void main(String[] args) {
        sub1("","abc");
        System.out.println(sub2("","abc"));
        System.out.println(sub3("","abc"));
    }

    static void sub1 (String p , String up){

        if(up.isEmpty()){
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);

        for (int i = 0; i <= p.length(); i++) {

            String f = p.substring(0,i);
            String s = p.substring(i,p.length());
            sub1(f+ch+s,up.substring(1));

        }
    }
    static ArrayList<String> sub2 (String p , String up){

        ArrayList<String> list = new ArrayList<>();

        if(up.isEmpty()){
            list.add(p);
            return list;
        }

        char ch = up.charAt(0);

        for (int i = 0; i <= p.length(); i++) {

            String f = p.substring(0,i);
            String s = p.substring(i,p.length());

            ArrayList<String> ans = sub2(f+ch+s,up.substring(1));

            list.addAll(ans);

        }
        return list;
    }
    static int sub3 (String p , String up){

        if(up.isEmpty()){
            return 1;
        }
        int count = 0;
        char ch = up.charAt(0);

        for (int i = 0; i <= p.length(); i++) {

            String f = p.substring(0,i);
            String s = p.substring(i,p.length());
            count += sub3(f+ch+s,up.substring(1));

        }
        return count;
    }
}
