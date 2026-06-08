package Basics;

public class Variables {
    public static void main(String[] args){

        // int — whole numbers
        int age = 22;
        int year = 2026;

        // double & float— decimal numbers
        double marks = 89.5;
        float height = 5.9f;

        // String — text / words
        String name = "Mahesh";
        String city = "Hyderabad";
        String course = "Java Full Stack";

        // boolean — true or false only
        boolean isStudent = true;
        boolean hasJob = false;

        // char — single character
        char grade = 'A';

        // long — very large numbers
        long phoneNumber = 9876543210L;

        // print all values
        System.out.println("Name    : " + name);
        System.out.println("Age     : " + age);
        System.out.println("City    : " + city);
        System.out.println("Course  : " + course);
        System.out.println("Marks   : " + marks);
        System.out.println("Height  : " + height);
        System.out.println("Student : " + isStudent);
        System.out.println("Has Job : " + hasJob);
        System.out.println("Grade   : " + grade);
        System.out.println("Phone   : " + phoneNumber);

        // changing a variable value
        age = 23;
        System.out.println("New Age : " + age);

        // String joining (concatenation)
        String fullInfo = name + " | Age: " + age + " | " + city;
        System.out.println(fullInfo);
    }
}
