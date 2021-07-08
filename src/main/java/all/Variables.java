package main.java.all;

import java.util.Scanner;

// a class can be public or package private (accessible to other classes within same package)
public class Variables {
    public static void main(String[] args) {
        byte userAge = 20;
        short numberOfStudents = 45;
        int numberOfEmployees = 500;
        long numberOfInhabitants = 2147483648L;
        float hourlyRate = 60.5F;
        double numberOfHours = 5120.5;
        char grade = 'A';
        boolean promote = true;
        byte level = 2, userExperience = 5;

        Scanner sc = new Scanner(System.in); // input from standard input device

        System.out.print("Enter an integer: ");
        int myInt = sc.nextInt();
        System.out.printf("You entered %d.", myInt);
    }
}
