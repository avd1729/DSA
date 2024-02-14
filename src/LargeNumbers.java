import java.math.BigDecimal;
import java.math.BigInteger;

public class LargeNumbers {
    public static void main(String[] args) {
        int a = 30;
        int b = 99;

        BigInteger A = BigInteger.valueOf(a);
        BigInteger B = BigInteger.valueOf(b);
        BigInteger C = BigInteger.valueOf(Long.parseLong("1234567890"));
        BigInteger D = BigInteger.ONE;
        BigInteger E = new BigInteger("213456789709876543");

        System.out.println(B.add(C));
        System.out.println(A.add(D));
        System.out.println(E.add(E));

        System.out.println(fact.fact(99));

        double f = 0.3;
        double g = 0.4;
        BigDecimal F = new BigDecimal("0.3");
        BigDecimal G = new BigDecimal("0.4");
        System.out.println(g-f);
        System.out.println(G.subtract(F));

    }
    static class fact {
        static BigInteger fact(int num){
            BigInteger ans = new BigInteger("1");
            for (int i = 2; i <= num ; i++) {
                ans = ans.multiply(BigInteger.valueOf(i));
            }
            return ans;
        }

        public fact() {
        }
    }
}
