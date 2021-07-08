package main.java.all;

import java.util.LinkedList;

public class LinkedListDS {
    public static void main(String[] args) {
        LinkedList<Integer> myLinkedList = new LinkedList<>();

        myLinkedList.add(1);
        myLinkedList.add(2);
        myLinkedList.add(3);
        myLinkedList.add(4);
        myLinkedList.add(2);

        myLinkedList.set(0, 0);

        myLinkedList.remove(0);

        System.out.println("List " + myLinkedList);

        boolean containsOrNot = myLinkedList.contains(2);

        System.out.println("Contains 2? " + containsOrNot);

        int indexOfFirst = myLinkedList.indexOf(2);

        System.out.println("Index of first occurrence of 2? " + indexOfFirst);

        int indexOfLast = myLinkedList.lastIndexOf(2);

        System.out.println("Index of last occurrence of 2? " + indexOfLast);

        System.out.println("Size " + myLinkedList.size());
        System.out.println("First " + myLinkedList.get(0));

        System.out.println("Previous head " + myLinkedList.poll()); // returns and removes head of the linked list
        System.out.println("Current head " + myLinkedList.peek()); // returns head of linked list
        System.out.println("List after " + myLinkedList);
    }
}
