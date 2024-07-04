package Programming_Challenges.VowelOrConsonant;

import java.util.Scanner;

/**
 * <p> Accepts a String and returns if it is Vowel or Consonant
 * . Also checks if it is a single letter or if number is inputted
 * 
 * 
 * @author Kurt Lawrence
 * @since 2024-07-05
 * 
 */

public class VowelOrConsonant {

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        System.out.println("Enter letter: ");
        String letter = in.nextLine();

        in.close();

        System.out.println(isSingle(letter) ? vowelOrConsonant(letter) : "Input single character");
    }

    private static boolean isSingle(String letter){

        boolean single;

        if(letter.length() != 1){
            single = false;
        }else{
            single = true;
        }

        return single;
        
    }

    private static String vowelOrConsonant(String letter){

        String result;
        char c = letter.charAt(0);

        if (Character.isLetter(c)){

            if(("aeiou".indexOf(c,0)) >= 0){
                result = "Vowel";
            }else{
                result = "Consonant";
            }
        }else{

            result = "Not a letter";
        }

        return result;
      
    }

    
    
}
