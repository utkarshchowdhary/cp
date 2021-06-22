package main.java.com.github.basic;

public class FormatString {
    public static void main(String[] args) {
        // Conversion Characters:
        // d : decimal integer [byte, short, int, long]
        // f : floating-point number [float, double]
        // c : character Capital C will uppercase the letter
        // s : String Capital S will uppercase all the letters in the string
        // h : hashcode
        // n : newline
        System.out.printf("The answer for %.3f divided by %d is %.2f.%n", 5.45, 3, 5.45 / 3);
        System.out.print(String.format("%.3f", 5.45));
    }
}
