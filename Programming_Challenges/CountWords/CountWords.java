package Programming_Challenges.CountWords;

import java.util.Arrays;
import java.util.Scanner;

/**
 * <p> Accepts string and return the count of words
 * 
 * @author Kurt Lawrence
 * @since 2024-07-06
 * 
 */

public class CountWords {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

     
        String word = in.nextLine();
        String[] neword = word.trim().split(" ");

        in.close();


        System.out.println(Arrays.toString(neword));
    }
}
