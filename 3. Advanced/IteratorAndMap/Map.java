package IteratorAndMap;

import java.util.HashMap;

public class Map {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1234,"David");
        map.put(4321,"Jerry");
        map.put(9845,"John");

        System.out.println(map);

        System.out.println(map.get(1234));
        System.out.println(map.containsKey(9845));
        System.out.println(map.containsValue("David"));
        System.out.println(map.put(1234,"Henry"));
        System.out.println(map);
        map.putIfAbsent(5647,"Steve");
        System.out.println(map);
        System.out.println(map.remove(5647));

    }
}
