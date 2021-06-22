package main.java.com.github.basic;

import java.util.HashMap;

public class HashMapDS {
    public static void main(String[] args) {
        HashMap<String, Integer> myHashMap = new HashMap<>();

        myHashMap.put("qatar", 1);
        myHashMap.put("fiji", 2);
        myHashMap.put("turkey", 3);
        myHashMap.put("syria", 4);
        myHashMap.putIfAbsent("ethiopia", 5);

        System.out.println("Map " + myHashMap);
        System.out.println("Size " + myHashMap.size());

        System.out.println("qatar " + myHashMap.get("qatar"));
        System.out.println("maldives " + myHashMap.getOrDefault("maldives", 0));

        myHashMap.replace("qatar", 0);
        myHashMap.remove("qatar");

        myHashMap.compute("fiji", (k, v) -> v);

        System.out.println("Iterate over hashmap");
        myHashMap.forEach((k, v) -> System.out.println(k + " : " + v));
    }
}
