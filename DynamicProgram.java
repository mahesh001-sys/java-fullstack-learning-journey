import java.util.Scanner;
public class DynamicProgram {
    public static void main(String[] args){
        final double PI  = 3.1417;
        Scanner SC=new Scanner(System.in);
        System.out.println("enter the value of radius:");
        double radius=SC.nextDouble();
        double areaOfCircle=PI*radius*radius;
        double circumference=2*PI*radius;
        System.out.println("area of circle :"+ areaOfCircle);
        System.out.println("circumference:"+ circumference);
        SC.close();
    }
}
