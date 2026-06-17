import java.util.Scanner;

public class InputOutput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*
        int num = sc.nextInt();        // Integer
        double d = sc.nextDouble();    // Decimal number
        char ch = sc.next().charAt(0); // Character
        String str = sc.next();        // Single word
        String line = sc.nextLine();   // Full sentence */

        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        System.out.println("\n--- Output ---");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);

        sc.close();
    }
}
