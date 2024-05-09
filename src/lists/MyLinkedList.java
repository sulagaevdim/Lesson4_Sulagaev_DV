package lists;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class MyLinkedList <E> {

    private Node<E> main;
    private int size;



    public MyLinkedList() {
        main = main;
        size = 0;
    }

    public String size() {
        return "Количество элементов в списке: " + size;
    }
    public void getElement(int index) {
        if (index >= size & index < 0) System.out.println("Индекс вне диапазона");
        else {
            Node<E> res = main;
            for (int i = 0; i < index; i++) {
                res = res.next;
            }
            System.out.println("В списке под индексом " + index + " расположен элемент: " + res.item);
        }
    }
    public void addFirst(E data) {
        Node<E> newNode = new Node<>(data);
        Node<E> currentNode = main;
        if (main == null) main = newNode;
        else {
            newNode.next = main;
            main = newNode;
        }
        size++;
    }
    public void addLast(E data) {

        Node<E> newNode = new Node<>(data);
        Node<E> currentNode = main;
        if (main == null) main = newNode;
        else {
            while (currentNode.next != null) {
                currentNode = currentNode.next;
            }
            currentNode.next = newNode;
        }
        size++;
    }
    private static class Node<E> {
        E item;
        Node<E> next;


        Node(E element) {
            this.item = element;
            this.next = null;

        }
        @Override
        public String toString() {
            return item.toString();
        }
    }
    public String toString() {
        StringBuilder stb = new StringBuilder();
        Node<E> currentNode = main;
        if (main == null) {
            return "[]";
        }
        stb.append("[");
        stb.append(currentNode.item);
        while (currentNode.next != null) {
            currentNode = currentNode.next;
            stb.append(", " + currentNode.item);
        }
        stb.append("]");
        return stb.toString();
    }

}
