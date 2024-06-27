
import java.util.Scanner;

/**
 * <p> Accepts a number and returns corresponding day
 * 
 * @author Kurt Lawrence
 * @since 2024-06-27
 * 
 */

public class NumberToDay{
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Enter number of day: ");
        int day = in.nextInt();
       
        System.out.println(numberToDay(day));
        
    }

    private static String numberToDay(int num){

        if ((num >= 1) && (num <= 7)){
            String[] daysOfWeek = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

            return daysOfWeek[num-1];
        }else{

            return "Invalid number";
        }

    }
}