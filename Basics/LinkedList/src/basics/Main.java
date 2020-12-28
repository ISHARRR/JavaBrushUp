package basics;

import org.omg.CORBA.PUBLIC_MEMBER;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<String> myLinkedList = new LinkedList<String>();
        myLinkedList.add("red");
        myLinkedList.add("blue");
        myLinkedList.add("yellow");
        myLinkedList.add("black");
        System.out.println(myLinkedList);
        printList(myLinkedList);
        printListFrom(myLinkedList, 1);
        printReversed(myLinkedList);

    }

    public static void printList (LinkedList<String> list) {
        for(String s : list){
            System.out.println(s);
        }
    }

    public static void printReversed (LinkedList<String> list) {
        Iterator<String> it = list.descendingIterator();
        System.out.println("printing list in reverse");
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
    public static void shuffle (LinkedList<String> list) {
        Collections.shuffle(list);
    }

    public static void printListFrom (LinkedList<String> list, int index) {
        Iterator<String> it = list.listIterator(index);
        System.out.println("printing list from index: " + index);
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }


}
