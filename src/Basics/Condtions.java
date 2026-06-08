package Basics;

public class Condtions {
    public static void main(String[] args) {

        // ── if / else if / else ───────────────────
        System.out.println("=== Grade Calculator ===");
        int marks = 82;

        if (marks >= 90) {
            System.out.println("Grade: A+ — Excellent!");
        }
        else if (marks >= 75) {
            System.out.println("Grade: A  — Very Good!");
        }
        else if (marks >= 60) {
            System.out.println("Grade: B  — Good");
        }
        else if (marks >= 35) {
            System.out.println("Grade: C  — Pass");
        }
        else {
            System.out.println("Grade: F  — Fail");
        }

        // ── if with logical operators ─────────────
        System.out.println("\n=== Eligibility Check ===");
        int age = 20;
        boolean hasId = true;

        if (age >= 18 && hasId) {
            System.out.println("Eligible to vote!");
        } else {
            System.out.println("Not eligible.");
        }
        // ── nested if ─────────────────────────────
        System.out.println("\n=== Login Check ===");
        String user = "mahesh";
        String pass = "java123";

        if (user.equals("mahesh")) {
            if (pass.equals("java123")) {
                System.out.println("Login successful!");
            } else {
                System.out.println("Wrong password!");
            }
        } else {
            System.out.println("User not found!");
        }
        // ── switch statement ──────────────────────
        System.out.println("\n=== Day of Week ===");
        int day = 3;

        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid day");
        }
    }
}
