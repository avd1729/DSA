public class SearchinString {
    public static void main(String[] args) {
        String s = "Avd";
        char c = 'v';
        boolean b = search(s,c);
        System.out.println(b);
    }
    static boolean search(String str , char letter){
        if(str.length()==0){
            return false;
        }
//        for (int i=0 ; i < str.length() ; i++){
//            if(letter == str.charAt(i)){
//                return true;
//            }
//        }
        for(char ch : str.toCharArray()){
            if(ch == letter){
                return true;
            }
        }
        return false;
    }
}
