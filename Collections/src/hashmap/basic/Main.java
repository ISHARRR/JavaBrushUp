package hashmap.basic;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        HashMap<Integer,String> myHashMap= new HashMap<Integer,String>();
        myHashMap.put(1, "Red");
        myHashMap.put(2, "Green");
        myHashMap.put(3, "Black");
        myHashMap.put(4, "White");
        myHashMap.put(5, "Blue");
        for(Map.Entry x:myHashMap.entrySet()){
            System.out.println(x.getKey()+" "+x.getValue());
        }

        copyMapOver(myHashMap);
        containsKey(myHashMap, 4);
        containsKey(myHashMap, 10);
        containsValue(myHashMap, "Red");
        containsValue(myHashMap, "Fake Colour");
        createSetFromHashmap(myHashMap);
        createKeySetFromHashmap(myHashMap);
        valuesContained(myHashMap);

    }

    public static void keysCount(HashMap<Integer,String> myHashMap){
        System.out.println("Keys in hashmap: ");
        System.out.println(myHashMap.size());
    }

    public static void clearMap(HashMap<Integer,String> myHashMap){
        myHashMap.clear();
    }

    public static void copyMapOver(HashMap<Integer,String> myHashMap){
        HashMap <Integer,String> myHashMap1 = new HashMap <Integer,String> ();
        myHashMap1.put(6, "White");
        myHashMap1.put(7, "Blue");
        myHashMap1.put(8, "Orange");

        myHashMap1.putAll(myHashMap);
        System.out.println("\nNow values in second map: " + myHashMap1);

    }

    public static void containsKey(HashMap<Integer,String> myHashMap, int key){
        if (myHashMap.containsKey(key)) {
            System.out.println("yes! - " + myHashMap.get(key));
        } else {
            System.out.println("nope");
        }

    }

    public static void containsValue(HashMap<Integer,String> myHashMap, String Value){
        if (myHashMap.containsValue(Value)) {
            System.out.println("yeeee");
        } else {
            System.out.println("nopeee");
        }

    }

    public static void createSetFromHashmap(HashMap<Integer,String> myHashMap){
        Set<Map.Entry<Integer, String>> set = myHashMap.entrySet();
        System.out.println("Set values: " + set);
    }

    public static void createKeySetFromHashmap(HashMap<Integer,String> myHashMap){
        Set<Integer> set = myHashMap.keySet();
        System.out.println("Key set values: " + set);
    }

    public static void valuesContained(HashMap<Integer,String> myHashMap){
        System.out.println("Collection view is: "+ myHashMap.values());
    }


}

