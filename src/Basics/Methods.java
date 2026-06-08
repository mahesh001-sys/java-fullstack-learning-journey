package Basics;

public class Methods {
    // void — does something, returns nothing
    static void greet(String name) {
        System.out.println("Hello, " + name + "! Welcome to Java.");
    }

    // int — returns a number
    static int add(int a, int b) {
        return a + b;
    }

    // double — returns decimal
    static double average(int a, int b, int c) {
        return (a + b + c) / 3.0;
    }

    // String — returns text
    static String getGrade(int marks) {
        if (marks >= 90) return "A+";
        if (marks >= 75) return "A";
        if (marks >= 60) return "B";
        if (marks >= 35) return "C";
        return "Fail";
    }
    // boolean — returns true/false
    static boolean isEven(int n) {
        return n % 2 == 0;
    }

    // method with loop inside
    static void printTable(int n) {
        System.out.println("Table of " + n + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println("  " + n + " x " + i + " = " + (n * i));
        }
    }
    // method overloading — same name, different params
    static int multiply(int a, int b)           { return a * b; }
    static int multiply(int a, int b, int c)    { return a * b * c; }
    static double multiply(double a, double b)  { return a * b; }

    public static void main(String[] args) {

        greet("Mahesh");
        greet("Chandan");

        System.out.println("\n=== Calculator ===");
        System.out.println("Add: "      + add(10, 20));
        System.out.println("Average: "  + average(80, 90, 70));
        System.out.println("Grade 85: " + getGrade(85));
        System.out.println("Grade 45: " + getGrade(45));
        System.out.println("Is 8 even: "+ isEven(8));
        System.out.println("Is 7 even: "+ isEven(7));

        System.out.println("\n=== Overloading ===");
        System.out.println(multiply(3, 4));
        System.out.println(multiply(2, 3, 4));
        System.out.println(multiply(2.5, 4.0));

        System.out.println();
        printTable(7);
    }
}
