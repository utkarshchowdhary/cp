package main.java.all;

import java.util.Arrays;

public class ArrayDS {
    public static void main(String[] args) {
        int[] myArray = new int[] {21, 22, 23, 24, 25};
        int[] myArray2 = {21, 22, 23, 24, 25};
        int[] myArray3 = new int[5]; // {0, 0, 0, 0, 0}

        int myLength = myArray.length;

        // static methods
        boolean equalsOrNot  = Arrays.equals(myArray, myArray2); // same no of elements and arranged in same order

        int [] source = {12, 1, 5, -2, 16, 14, 18, 20, 25};
        int[] dest = Arrays.copyOfRange(source, 3, 7); //  copy the contents from one array into another

        int[] numbers =  {12, 1, 5, -2, 16, 14};
        System.out.println(Arrays.toString(numbers)); // string representing the contents of an array

        Arrays.sort(numbers); // sort in ascending order, modifying the array passed in
        System.out.println(Arrays.toString(numbers));

        int[] myInt = {21, 23, 34, 45, 56, 78, 99};
        int foundIndex = Arrays.binarySearch(myInt, 78); // search for a value in sorted array
    }
}
