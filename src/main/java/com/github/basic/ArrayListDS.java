package main.java.com.github.basic;

import java.util.ArrayList;

public class ArrayListDS {
    public static void main(String[] args) {
        ArrayList<Integer> myArrayList = new ArrayList<>();

        myArrayList.add(1);
        myArrayList.add(2);
        myArrayList.add(3);
        myArrayList.add(4);
        myArrayList.add(2);

        myArrayList.set(0, 0);

        myArrayList.remove(0);

        System.out.println("List " + myArrayList);

        boolean containsOrNot = myArrayList.contains(2);

        System.out.println("Contains 2? " + containsOrNot);

        int indexOfFirst = myArrayList.indexOf(2);

        System.out.println("Index of first occurrence of 2? " + indexOfFirst);

        int indexOfLast = myArrayList.lastIndexOf(2);

        System.out.println("Index of last occurrence of 2? " + indexOfLast);


        System.out.println("Size " + myArrayList.size());
        System.out.println("First " + myArrayList.get(0));
    }
}
