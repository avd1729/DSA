package Hashing;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<String , Integer> map = new HashMap<>();

        map.put("amelia",1);
        map.put("boris",2);
        map.put("cookie",3);

//      System.out.println(map.get("amelia"));

        map.put("amelia",0);

//      System.out.println(map.get("amelia"));

//      System.out.println(map);

        map.remove("boris");

//      System.out.println(map);

        for (HashMap.Entry<String, Integer> e : map.entrySet())
            System.out.println("Key: " + e.getKey()
                    + " Value: " + e.getValue());

        map.getOrDefault("John",1);

        for (HashMap.Entry<String, Integer> e : map.entrySet())
            System.out.println("Key: " + e.getKey()
                    + " Value: " + e.getValue());


    }

}
