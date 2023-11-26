import java.util.ArrayList;

public class ArrayListexample {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(10);
        list.add(12);
        list.add(13);
        System.out.println(list);
        System.out.println(list.contains(56));
        list.set(0,56);
        System.out.println(list);
        System.out.println(list.contains(56));
        list.remove(1);
        System.out.println(list);
    }
}
