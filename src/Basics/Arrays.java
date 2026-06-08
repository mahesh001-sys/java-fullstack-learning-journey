package Basics;

public class Arrays {
    public static void main(String[] args) {

        // ── declare and fill array ────────────────
        System.out.println("=== int Array ===");
        int[] marks = {85, 92, 78, 90, 65};

        System.out.println("Length : " + marks.length);
        System.out.println("First  : " + marks[0]);
        System.out.println("Last   : " + marks[marks.length - 1]);

        // ── print all using for loop ──────────────
        System.out.println("\n=== Print All ===");
        for (int i = 0; i < marks.length; i++) {
            System.out.println("marks[" + i + "] = " + marks[i]);
        }
        // ── for-each loop (cleaner) ───────────────
        System.out.println("\n=== For-Each ===");
        for (int m : marks) {
            System.out.print(m + " ");
        }

        // ── find max, min, sum, average ───────────
        System.out.println("\n\n=== Statistics ===");
        int max = marks[0], min = marks[0], total = 0;

        for (int m : marks) {
            if (m > max) max = m;
            if (m < min) min = m;
            total += m;
        }
        double avg = (double) total / marks.length;
        System.out.println("Max     : " + max);
        System.out.println("Min     : " + min);
        System.out.println("Total   : " + total);
        System.out.println("Average : " + avg);

        // ── String array ──────────────────────────
        System.out.println("\n=== String Array ===");
        String[] students = {"Mahesh", "Ravi", "Priya", "Arjun", "Sunita"};

        for (String s : students) {
            System.out.println("Student: " + s);
        }
        // ── update an array value ─────────────────
        System.out.println("\n=== Update Array ===");
        marks[2] = 95;   // change index 2 from 78 → 95
        System.out.println("Updated marks[2] = " + marks[2]);

        // ── 2D array — like a table ───────────────
        System.out.println("\n=== 2D Array ===");
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        for (int[] row : matrix) {
            for (int val : row) {
                System.out.printf("%3d", val);
            }
            System.out.println();
        }
        
        // ── search in array ───────────────────────
        System.out.println("\n=== Search ===");
        int search = 90;
        boolean found = false;
        for (int m : marks) {
            if (m == search) {
                found = true;
                break;
            }
        }
        System.out.println(search + (found ? " found!" : " not found."));
    }
}
