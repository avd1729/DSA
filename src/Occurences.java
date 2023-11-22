public class Occurences {
    public static void main(String[] args) {
        int n = 1234753;
        int rem;
        int count = 0;
        while (n > 0){
            rem = n % 10;
            if (rem == 3){
                count++;
            }
            n = n / 10; // n /= 10
        }
        System.out.println(count);
    }
}
