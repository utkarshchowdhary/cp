package main.java.com.github.basic;

public class StringDT {
    public static void main(String[] args) {
        String message = "Hello World";

        int myLength = message.length();

        String uCase = message.toUpperCase();

        String lCase = message.toLowerCase();

        String firstSubstring = message.substring(6);

        char myChar = message.charAt(1);

        boolean equalsOrNot = "This is Jamie".equals("This is Jamie");

        String names = "Peter, John, Andy, David";
        String[] splitNames = names.split(", ");
    }
}
