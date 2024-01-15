public class Strings {
    public static void main(String[] args) {
//        String name1 = "Aravind";
//        String name2 = "Aravind";
//        System.out.println(name1); // Aravind
//        System.out.println(name2); // Aravind
//        name1 = "avd";
//        System.out.println(name1); // avd
//        System.out.println(name2); // Aravind

        String name1 = "avd";
        String name2 = "avd";

        System.out.println(name1 == name2); // true

        String name3 = new String("avd");
        String name4 = new String("avd");

        System.out.println(name3 == name4); // false
        System.out.println(name3.equals(name4)); // true

        // indexing
        //System.out.println(name3.charAt(0));
    }
}