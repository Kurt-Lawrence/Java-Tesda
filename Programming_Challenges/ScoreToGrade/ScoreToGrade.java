package Programming_Challenges.ScoreToGrade;

import java.util.Scanner;

/**
 * <p> Accepts number <code>score</code> and outputs its
 * grade
 * 
 * @author Kurt Lawrence
 * @since 2024-06-23
 * 
 */


public class ScoreToGrade {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        System.out.print("Enter score: ");
        int score = in.nextInt();
        
        System.out.println(toGrade(score));

        in.close();


    }

    static char toGrade(int score){

        char grade  = '-';

        if (score >= 90) grade = 'A';
        else if (score >= 80) grade = 'B';
        else if (score >= 70) grade = 'C';
        else if (score >= 60) grade = 'D';
        else if ((score >= 0) && (score < 60)) grade = 'F';
        else System.out.println("Invalid score");;

        return grade;
    }
    
}
