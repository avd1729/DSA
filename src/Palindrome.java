public class Palindrome {
    public static void main(String[] args) {
        String word = "malayalam";
        boolean ans = palindrome(word);
        System.out.println(ans);
    }
    static boolean palindrome(String a){
        a = a.toLowerCase();
        int start = 0;
        int end = a.length()-1;
        while (start <= end){
            if (a.charAt(start) == a.charAt(end)){
                start++;
                end--;
            }
            else{
                return false;
            }
        }
        return true;
    }
}
