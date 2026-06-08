package Basics;

public class Loops {
    public static void main(String[] args) {

        // ── for loop ──────────────────────────────
        System.out.println("=== For Loop ===");
        for (int i = 1; i <= 5; i++) {
            System.out.println("Count: " + i);
        }

        // ── multiplication table ──────────────────
        System.out.println("\n=== Table of 5 ===");
        for (int i = 1; i <= 10; i++) {
            System.out.println("5 x " + i + " = " + (5 * i));
        }
        // ── sum using loop ────────────────────────
        System.out.println("\n=== Sum 1 to 100 ===");
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum += i;
        }
        System.out.println("Sum = " + sum);

        // ── while loop ────────────────────────────
        System.out.println("\n=== While Loop ===");
        int n = 1;
        while (n <= 5) {
            System.out.println("While: " + n);
            n++;
        }
        // ── do-while loop ─────────────────────────
        System.out.println("\n=== Do-While Loop ===");
        int x = 1;
        do {
            System.out.println("Do-While: " + x);
            x++;
        } while (x <= 3);

        // ── nested loop — star pattern ────────────
        System.out.println("\n=== Star Pattern ===");
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        // ── break and continue ────────────────────
        System.out.println("\n=== Break ===");
        for (int i = 1; i <= 10; i++) {
            if (i == 5) break;
            System.out.print(i + " ");
        }

        System.out.println("\n\n=== Continue (skip even) ===");
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) continue;
            System.out.print(i + " ");
        }

        // ── FizzBuzz — classic interview question ──
        System.out.println("\n\n=== FizzBuzz ===");
        for (int i = 1; i <= 20; i++) {
            if (i % 15 == 0) System.out.print("FizzBuzz ");
            else if (i % 3 == 0) System.out.print("Fizz ");
            else if (i % 5 == 0) System.out.print("Buzz ");
            else System.out.print(i + " ");
        }
    }

}
