package Basics;

public class Operators {
    public static void main(String[] args) {
        // -----Arithemetic Operators------
        int a = 10, b = 3;
        System.out.println("==Arithemetic==");
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a / b = " + (a / b));
        System.out.println("a % b = " + (a % b));
        //System.out.println(10/0 );// ArithmeticException.
        //System.out.println(10/0.0);// integral with floating-point zero result will be "infinity".
        //System.out.println(0/0);// ArithmeticException.
        // System.out.println(0.0/0);// NaN(not a number)
        //precedence and Associativity (* >> / >> % >> + >> -)

        // decimal division — use double
        double result = (double) a / b;
        System.out.println("10.88/3 = " + result);

        // ── Assignment operators ──────────────────
        System.out.println("\n=== Assignment ===");
        int x = 10;
        x += 5;
        System.out.println("x += 5  → " + x);
        x -= 3;
        System.out.println("x -= 3  → " + x);
        x *= 2;
        System.out.println("x *= 2  → " + x);
        x /= 4;
        System.out.println("x /= 4  → " + x);
        x++;
        System.out.println("x++     → " + x);
        x--;
        System.out.println("x--     → " + x);

        //------Pre & post Increment and decrement-----
        int m = 10;
        System.out.println("  ");
        //post increment
        System.out.println("-Pre & post Increment and decrement-");
        System.out.println(" Post Increment ");
        System.out.println(m++);
        System.out.println(m);
        int n = 10;
        //pre increment
        System.out.println(" pre Increment ");
        System.out.println(++n);
        System.out.println(n);
        int c = 10;
        //post decrement(after the assignment , decrement is performed)
        System.out.println(" Post decrement ");
        System.out.println(c--);
        System.out.println(c);
        int d = 10;
        //pre decrement(before the assignment , decrement is performed)
        System.out.println(" Pre decrement ");
        System.out.println(--d);
        System.out.println(d);

        //---example----
        byte z = 10;
        System.out.println("=== example ===");
        z = ++z;//z+1
        System.out.println(z);//z=11
        //-----example=-----
        int y=10;
        int res=y++ + --y + ++y - y--; // right --- left to get the result
        System.out.println(res);//res=20

        // ── Comparison operators ──────────────────
        System.out.println("\n=== Comparison ===");
        System.out.println("a == b  : " + (a == b));
        System.out.println("a != b  : " + (a != b));
        System.out.println("a >  b  : " + (a > b));
        System.out.println("a <  b  : " + (a < b));
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
        //integral data
        int p = 5; // 0101
        int q = 3; // 0011
        byte g=10;
        short s=102;
        int i=1001;
        long o=-2002;
        //character data
        char ch='a';
        char ss='A';
        
        //boolean and floating point is not allowed to define with complement(~)

        System.out.println("p & q = " + (p & q));
        System.out.println("p | q = " + (p | q));
        System.out.println("p ^ q = " + (p ^ q));
        System.out.println("~p = " + (~p));
        System.out.println("~i = " + (~i));
        System.out.println("~s = " + (~s));
        System.out.println("~g = " + (~g));
        System.out.println("~o = " + (~o));
        System.out.println("~a = " + (~ch));
        System.out.println("~A = " + (~ss));



        // ---- Shift Operators-----
        System.out.println("\n=== Shift Operator ===");
        // define with only integral data(any signed data) and character data
        int num = 8;
        char sw='a';
        char wa='A';
        System.out.println(sw << 2);//left shift sw 'a' = 388 formula-->(data*2^n)
        System.out.println(wa >> 1);//right shift wa 'A' = 32
        System.out.println(-11 >> 1);//right shift is halves the given input to get output -11 = -6
        System.out.println(-11 << 2);//left shift of negative 11 = -44
        System.out.println(num << 1);//left shift num 8 = 16
        System.out.println(num >> 1);//right shift num 8 = 4  formula-->(data/2^n)
        System.out.println(12 >> 1 );// formula-->(data/2^n) result = 6
        System.out.println(num >>> 1);//unsigned right shift (define with only positive value)num 8 = 4
        System.out.println(-12 >>> 2);//gives an error




        //----ternary operator----
        System.out.println("\n=== ternary operator ===");
        int age = 20;
        String status = (age >= 18) ? "Adult" : "Minor";
        System.out.println(status);

    }
}

