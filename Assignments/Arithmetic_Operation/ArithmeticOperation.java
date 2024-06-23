package Assignments.Arithmetic_Operation;



import java.util.Scanner;

/**
 * @author Kurt Lawrence
 * @since 2024-06-23
 */

public class ArithmeticOperation {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter first number: ");
        double x = in.nextDouble();
        System.out.println("Enter second number: ");
        double y = in.nextDouble();

        in.close();

        System.out.println("Results\n");

        System.out.println("Sum: " + add(x, y));
        System.out.println("Difference: " + subtract(x, y));
        System.out.println("Product: " + multiply(x, y));
        System.out.println("Qoutient: " + division(x, y));

        
    }


    static double add(double x, double y){
        return x + y;
    }

    static double subtract(double x, double y){
        return x - y;
    }

    static double multiply(double x, double y){
        return x * y;
    }

    static double division(double x, double y){
        return x / y;
    }

    
    
}
