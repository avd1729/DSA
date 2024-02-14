public class LargeStrings {
    public static void main(String[] args) {

        StringBuffer buffer = new StringBuffer();
        buffer.append("Hey");

        String str = buffer.toString();
        System.out.println(str);
        System.out.println(buffer.capacity());

        StringBuffer buffer2 = new StringBuffer("string");
        buffer2.append(" new");
        //buffer2.insert(2 , " dev ");
        buffer2.replace(0,5,"abcd");
        System.out.println(buffer2.toString());
        StringBuffer buffer3 = new StringBuffer(30);
        System.out.println(buffer3.capacity());
    }
}
