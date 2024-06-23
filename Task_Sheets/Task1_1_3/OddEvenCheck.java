package Task_Sheets.Task1_1_3;

/**
 * @author Kurt Lawrence
 * @since 2024-06-23
 */

 public class OddEvenCheck{

    public static void main(String[] args) {
        
        int check_number = 10;
        String message;

        for(int i = 1;i < check_number + 1;i++){
            message = (i%2==0) ? i + " is even number" : i + " is odd number";

            System.out.println(message);
        }
    }
 }