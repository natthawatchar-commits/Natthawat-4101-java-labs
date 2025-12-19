package charoensuk.natthawat.lab3;

import java.util.Scanner;

public class GeometryCalculator {
    private static final int max_shape = 3;
    private static int[] shapechoice = new int[Shape.values().length];
    private static Scanner sc = new Scanner(System.in);
    enum Shape{
        Circle,Rectangle,Trapezoid
    }
    public static void main(String[]args){
        boolean run = true;
        while (run) {
            System.out.print("Choose shape (0. Circle, 1. Rectangle, 2. Trapezoid, -1. Exit): ");
            int choice = sc.nextInt();
            if(choice == -1){
                handleExit();
                run = false;
            } else if(choice == 0){
                handleCircleArea();
                if(checkMaxReched(0)) run = false;
            } else if(choice == 1){
                handleRectangleArea();
                if(checkMaxReched(1)) run = false;
            } else if (choice == 2){
                handleTrapezoidArea();
                if(checkMaxReched(2)) run = false;
            } else {
                System.out.println("Invalid choice.");
            }
        }
    }
    public static double calculateArea(double radius){
        return Math.PI * radius * radius;
    }
    public static double calculateArea(double length , double width){
        return length * width;
    }
    public static double calculateArea(double base1 , double base2 , double height){
        return (base1 + base2) * height / 2.0;
    }
    public static void handleCircleArea(){
        System.out.print("Enter radius: ");
        double r = sc.nextDouble();
        System.out.printf("The area of the circle is: %.2f\n", calculateArea(r));
        shapechoice[0]++;
    }
    public static void handleRectangleArea(){
        System.out.print("Enter length: ");
        double l = sc.nextDouble();
        System.out.print("Enter width: ");
        double w = sc.nextDouble();
        System.out.printf("The area of the rectangle is: %.2f\n" , calculateArea(l,w));
        shapechoice[1]++;
    }
    public static void handleTrapezoidArea(){
        System.out.print("Enter base 1: ");
        double b1 = sc.nextDouble();
        System.out.print("Enter base 2: ");
        double b2 = sc.nextDouble();
        System.out.print("Enter height: ");
        double h =sc.nextDouble();
        System.out.printf("The area of the trapezoid is: %.2f\n" , calculateArea(b1, b2, h));
        shapechoice[2]++;
    }
    public static void handleExit(){
        System.out.println("Exiting the program.");
        System.out.println("Thank you for using Geometry Calculator. Bye!");
    }
    private static boolean checkMaxReched(int index){
        if(shapechoice[index] >= max_shape){
            System.out.println("You have reached the maximum number of calculations for one of the shapes.");
            System.out.println("Thank you for using Geometry Calculator. Bye!");
            return true;
        }
        return false;
    }
}
