import lists.MyArrayList;
import lists.MyLinkedList;
import lists.MyList;
import org.w3c.dom.Node;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        MyList<Integer> list = new MyArrayList<>();
//        list.add(1);
//        list.add(2);
//        list.add(5);
//        list.add(3);
//        System.out.println(list.size());
//        list.delete(0);
//        System.out.println(list.size());

        MyLinkedList<Integer> myLinkedList = new MyLinkedList<>();
        myLinkedList.addLast(12);
        myLinkedList.addLast(56);
        myLinkedList.addLast(83);
        myLinkedList.addFirst(5);
        myLinkedList.addFirst(3);
        myLinkedList.addFirst(1);
        System.out.println(myLinkedList.toString());
        System.out.println(myLinkedList.size());
        myLinkedList.getElement(3);
    }
}