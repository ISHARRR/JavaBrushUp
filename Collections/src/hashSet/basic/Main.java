package hashSet.basic;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        HashSet<String> myHashset = new HashSet<String>();
        myHashset.add("red");
        myHashset.add("blue");
        myHashset.add("yellow");
        myHashset.add("purple");

        System.out.println(myHashset);
        printHashSet(myHashset);
        countHashSet(myHashset);
//        emptyHashSet(myHashset);
//        System.out.println(myHashset);
        HashSetToArray(myHashset);
        RetainSame(myHashset);
        compareHashSet(myHashset);
    }

    public static void printHashSet(HashSet<String> myHashset) {
        System.out.println("Printing HashSet: ");
        for (Object s : myHashset) {
            System.out.println(s);
        }
    }

    public static void countHashSet(HashSet<String> myHashset) {
        System.out.println("HashSet element count: ");
        System.out.println(myHashset.size());
    }

    public static void emptyHashSet(HashSet<String> myHashset) {
        myHashset.removeAll(myHashset);
    }

    public static void HashSetToArray(HashSet<String> myHashset) {
        String[] myArray = new String[myHashset.size()];
        System.out.println("Array elements: ");
        myHashset.toArray(myArray);
        System.out.println(Arrays.toString(myArray));
    }

    public static void HashSetToTreeSet(HashSet<String> myHashset) {
        Set<String> tree_set = new TreeSet<String>(myHashset);
        System.out.println("TreeSet elements: ");
        for(String element : tree_set){
            System.out.println(element);
        }
    }

    public static void RetainSame(HashSet<String> myHashset) {

        HashSet<String> myHashset1 = new HashSet<String>();
        myHashset1.add("red");
        myHashset1.add("blue");
        myHashset1.add("black");
        myHashset1.add("purple");
        System.out.println("Retained HashSet: ");
        myHashset.retainAll(myHashset1);
        System.out.println(myHashset);
    }

    public static void compareHashSet(HashSet<String> myHashset) {

        HashSet<String> myHashset1 = new HashSet<String>();
        myHashset1.add("red");
        myHashset1.add("blue");
        myHashset1.add("black");
        myHashset1.add("purple");

        System.out.println("HashSet contains: ");

        HashSet<String>result_set = new HashSet<String>();
        for (String element : myHashset){
            System.out.println(myHashset1.contains(element) ? element : "");
        }
    }



}
