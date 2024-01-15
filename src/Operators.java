import java.util.ArrayList;

public class Operators {
    public static void main(String[] args) {
        System.out.println('a'+'b'); // char
        System.out.println("a"+"b"); // string
        System.out.println('a'+3); // ascii value
        System.out.println((char)('a'+3)); // char
        System.out.println("a"+1); // a1
        // int will be converted to Integer , that will call toString() , it will become "a"+"1"
        System.out.println("a" + new ArrayList<>());

    }
}
