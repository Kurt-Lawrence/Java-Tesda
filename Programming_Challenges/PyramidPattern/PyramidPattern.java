package Programming_Challenges.PyramidPattern;

import java.util.Scanner;

/**
 * <p> Accepts int as size and print
 * a pyramid depends on the size input
 * 
 * @author Kurt Lawrence
 * @since 2024-07-06
 * 
 */

public class PyramidPattern {
    public static void main(String[] args) {
        
        Scanner in  = new Scanner(System.in);

        System.out.println("Enter size: ");
        int size = in.nextInt();

        in.close();

        showPyramid(size);
    }

    private static void showPyramid(int size){


        for (int outer = 1; outer <= size; outer++) {

            for (int space = size; space > outer; space--) {
                System.out.print(" ");
            }
            for (int star = 1; star <= outer; star++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }
    
}