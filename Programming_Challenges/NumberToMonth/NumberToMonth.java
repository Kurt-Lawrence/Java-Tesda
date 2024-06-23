package Programming_Challenges.NumberToMonth;

import java.util.Scanner;
/**
 * <p> Accepts a number from 1-12 and outputs its corresponding months
 * and the number of days in that month
 * 
 * @author Kurt Lawrence
 * @since 2024-06-24
 * 
 */
public class NumberToMonth {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Enter number: ");
        int num = in.nextInt();

        System.out.println(getMonthDays(num));

        in.close();

    }

    static String getMonthDays(int num){

        String month;
        int days;
        String message;

        if ((num >=1) && (num <=12)){   //checks if num is valid month 1-12

            switch (num) {
                case 1: month = "January"; days = 31; break;
                case 2: month = "February"; days = 28; break;
                case 3: month = "March"; days = 31; break;
                case 4: month = "April"; days = 30; break;
                case 5: month = "May"; days = 31; break;
                case 6: month = "June"; days = 30; break;
                case 7: month = "July"; days = 31; break;
                case 8: month = "August"; days = 31; break;
                case 9: month = "September"; days = 30; break;
                case 10: month = "October"; days = 31; break;
                case 11: month = "November"; days = 30; break;
                case 12: month = "December"; days = 31; break;
                default: month = "-"; days = 0; break;
            }

            message = month + " has " + days + " days.";

        }else{
            message = "Invalid input";
        }

        return message;
      
    }
    
}
