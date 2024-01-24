import java.util.ArrayList;

public class PhoneNumber {
    public static void main(String[] args) {
        combinations1("","12");
        System.out.println(combinations2("","12"));
    }

    static void combinations1 (String p , String up){

        if (up.isEmpty()){
            System.out.println(p);
            return;
        }

        int digit = up.charAt(0) - '0';

        for (int i = (digit-1)*3 ; i < digit*3; i++) {

            char ch = (char)('a'+i);
            combinations1(p+ch, up.substring(1));

        }
    }

    static ArrayList<String> combinations2 (String p , String up){

        ArrayList<String> list = new ArrayList<>();

        if (up.isEmpty()){
            list.add(p);
            return list;
        }

        int digit = up.charAt(0) - '0';

        for (int i = (digit-1)*3 ; i < digit*3; i++) {

            char ch = (char)('a'+i);
            ArrayList<String> ans = combinations2(p+ch, up.substring(1));
            list.addAll(ans);

        }

        return list;
    }
}
