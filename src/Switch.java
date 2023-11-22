import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String x = sc.next();
        // equals checks for only the value and not reference
//        if (x.equals("one")){
//            System.out.println("Heyy");
//        }
        switch (x) {
            case "one" -> System.out.println("One");
            case "two" -> System.out.println("Two");
            default -> System.out.println("Byee");
        }
    }
}
