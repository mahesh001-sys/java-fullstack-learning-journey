package Basics;

public class Operators {
    public static void main(String[] args){
        // -----Arithemetic Operators------
        int a=10,b=3;
        System.out.println("==Arithemetic==");
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a / b = " + (a / b));
        System.out.println("a % b = " + (a % b));

        // decimal division — use double
        double result = (double) a / b;
        System.out.println("10.0/3 = " + result);

        // ── Assignment operators ──────────────────
        System.out.println("\n=== Assignment ===");
        int x = 10;
        x += 5;   System.out.println("x += 5  → " + x);
        x -= 3;   System.out.println("x -= 3  → " + x);
        x *= 2;   System.out.println("x *= 2  → " + x);
        x /= 4;   System.out.println("x /= 4  → " + x);
        x++;       System.out.println("x++     → " + x);
        x--;       System.out.println("x--     → " + x);

        // ── Comparison operators ──────────────────
        System.out.println("\n=== Comparison ===");
        System.out.println("a == b  : " + (a == b));
        System.out.println("a != b  : " + (a != b));
        System.out.println("a >  b  : " + (a >  b));
        System.out.println("a <  b  : " + (a <  b));
        System.out.println("a >= b  : " + (a >= b));
        System.out.println("a <= b  : " + (a <= b));

        // ── Logical operators ─────────────────────
        System.out.println("\n=== Logical ===");
        boolean hasMarks = true;
        boolean hasAttendance = false;

        System.out.println("AND: " + (hasMarks && hasAttendance));
        System.out.println("OR : " + (hasMarks || hasAttendance));
        System.out.println("NOT: " + (!hasMarks));

        // ── Real world example ────────────────────
        System.out.println("\n=== Real example ===");
        int score = 78;
        boolean passed = score >= 35;
        boolean distinction = score >= 75;
        System.out.println("Passed      : " + passed);
        System.out.println("Distinction : " + distinction);

        // -----Bitwise operator-------
        System.out.println("\n=== Bitwise operator ===");
        int p = 5; // 0101
        int q = 3; // 0011

        System.out.println("p & q = " + (p & q));
        System.out.println("p | q = " + (p | q));
        System.out.println("p ^ q = " + (p ^ q));
        System.out.println("~p = " + (~p));

        // ---- Shift Operators-----
        System.out.println("\n=== Shift Operator ===");
        int num = 8;

        System.out.println(num << 1);
        System.out.println(num >> 1);
        System.out.println(num >>> 1);

        //----ternary operator----
        System.out.println("\n=== ternary operator ===");
        int age = 20;
        String status = (age >= 18) ? "Adult" : "Minor";
        System.out.println(status);

    }
}
