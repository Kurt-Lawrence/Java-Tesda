package Programming_Challenges.SumAve;
import java.util.Scanner;

/**
 * <p> Accepts an array of integer and 
 * outputs its sum and average
 * 
 * @author Kurt Lawrence
 * @since 2024-07-06
 * 
 */

public class SumAve {

    public static void main(String[] args) {
        
        // String ar = "1,2,3";
        // int[] intArray = toArray(ar);

        Scanner in = new Scanner(System.in);

        System.out.println("Enter array: (ex. 1,2,3,4)");
        int[] intArray = toArray(in.nextLine());

        in.close();

        System.out.println("Sum is: " + sumOfAll(intArray));
        System.out.println("Average is: " + aveOfAll(intArray));
        

    }

    private static int[] toArray(String stringArray){
        
        String[] str = stringArray.split(",");

        int[] intArray = new int[str.length];
        for (int i = 0; i < str.length; i++) {
            intArray[i] = Integer.parseInt(str[i]);
        }
        return intArray;
    }

    private static int sumOfAll(int[] toSum){

        int sumInt = 0;

        for (int i : toSum) {
            sumInt+=i;
        }
        return sumInt;
    }

    private static double aveOfAll(int[] toAve){

        double sumInt = 0;

        for (int i : toAve) {
            sumInt+=i;
        }
        return sumInt / (double)toAve.length;
    }

    
}
