package Programming_Challenges.StringBuilderMethods;

import java.util.Scanner;

/**
 * <p> Accepts a word and do the following operation
 * <ul>
 * <li>Print the length of the string.</li>
 * <li>Print the first character of the string.</li>
 * <li>Print the last character of the string.</li>
 * <li>Print the index of the first occurrence of the letter 'a' in the string.</li>
 * <li>Print the substring of the string from index 3 to index 6.</li>
 * <li>Append the string "123" to the end of the string.</li>
 * <li>Insert the string "xyz" at index 4.</li>
 * <li>Delete the substring from index 2 to index 4.</li>
 * <li>Delete the character at index 8.</li>
 * <li>Reverse the string and print it.</li>
 * </ul>
 * 
 * @author Kurt Lawrence
 * @since 2024-07-06
 * 
 */

public class StringBuilderMethods {

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        System.out.print("Enter word: ");
        StringBuilder word = new StringBuilder(in.nextLine());

        in.close();

        try {

            System.out.println(word.length());
            System.out.println(word.charAt(0));
            System.out.println(word.charAt(word.length()-1));
            System.out.println(word.indexOf("a"));
            System.out.println(word.substring(3,6));
            System.out.println(word.append("123"));
            System.out.println(word.insert(4, "xyz"));
            System.out.println(word.delete(2, 4));
            System.out.println(word.deleteCharAt(8));
            System.out.println(word.reverse());

        } catch (Exception e) {
            System.out.println(e);
        }

    }
   
}
