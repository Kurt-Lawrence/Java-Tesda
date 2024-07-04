package Programming_Challenges.StringMethods;

import java.util.Scanner;

/**
 * <p> Accepts a word and do the following operation
 * <ul>
 * <li>Uppercase and print</li>
 * <li>Lowercase and print</li>
 * <li>Print first letter</li>
 * <li>Print last letter</li>
 * <li>Print from second character to fifth character</li>
 * </ul>
 * 
 * 
 * @author Kurt Lawrence
 * @since 2024-07-05
 * 
 */

public class StringMethods {

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        System.out.println("Enter string: ");
        String word = in.nextLine();

        in.close();

        doOperations(word);  // do the instructed operations

    }

    private static void doOperations(String word){

        System.out.println(word.toUpperCase());  
        System.out.println(word.toLowerCase());
        System.out.println(word.charAt(0));
        System.out.println(word.charAt(word.length()-1));

        try {
            System.out.println(word.substring(1, 5));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Operation cant proceed. Insufficient number of letters ");
        }
        
    }
    
}
