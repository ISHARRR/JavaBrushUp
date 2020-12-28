package basics;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> myArray = new ArrayList<>();
        myArray.add("red");
        myArray.add("blue");
        myArray.add("yellow");
        myArray.add("orange");

        printElements(myArray);
        insertElementAtIndex(myArray, "white", 0);
        updateElementByElement(myArray, "white", "black");
        printElements(myArray);
        getElementAtIndex(myArray, 0);

    }

    public static void printElements(ArrayList<String> arrayList){
        for (String s : arrayList) {
            System.out.println(s);
        }
    }

    public static void insertElementAtIndex(ArrayList<String> arrayList, String colour, int index){
        arrayList.add(index,colour);
    }

    public static void getElementAtIndex(ArrayList<String> arrayList, int index){
        System.out.println("Element at index " + index + " = " + arrayList.get(index));
    }

    public static void updateElementByElement(ArrayList<String> arrayList, String element, String colour){
        if (arrayList.contains(element)) {
            int index = arrayList.indexOf(element);
            arrayList.set(index, colour);
        }
    }
}
