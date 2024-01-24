public class RemoveChar {
    public static void main(String[] args) {
        removechar("","baaccadav");
        System.out.println(removechar2("","baaccadav"));
        System.out.println(skipWord("","bacardiappleomega","apple"));
    }

    static void removechar(String processed , String unprocessed){
        if (!unprocessed.isEmpty()){
            if (unprocessed.charAt(0) != 'a'){
                processed += unprocessed.charAt(0);
            }
            removechar(processed , unprocessed.substring(1));
        }
        else{
            System.out.println(processed);
        }
    }

    static String removechar2(String processed , String unprocessed){
        if (!unprocessed.isEmpty()){
            if (unprocessed.charAt(0) != 'a'){
                processed += unprocessed.charAt(0);
            }
            return removechar2(processed , unprocessed.substring(1));
        }
        else{
            return processed;
        }
    }

    static String skipWord(String processed , String unprocessed , String word){
        if (!unprocessed.isEmpty()){
            if (!unprocessed.startsWith(word)){
                processed += unprocessed.charAt(0);
                return skipWord(processed , unprocessed.substring(1),word);
            }
            else{
                return skipWord(processed , unprocessed.substring(word.length()),word);
            }
        }
        else{
            return processed;
        }
    }


}
