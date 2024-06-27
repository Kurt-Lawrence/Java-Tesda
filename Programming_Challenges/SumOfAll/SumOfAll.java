package Programming_Challenges.SumOfAll;


import java.util.ArrayList;
import java.util.Scanner;

public class SumOfAll{
    public static void main(String[] args) {

        ArrayList<Integer> toSum = getInts();
        int sumInt = sumOfAll(toSum);

        System.out.println(sumInt);

    }

    private static ArrayList<Integer> getInts(){

        ArrayList<Integer> toSum = new ArrayList<>();

        Scanner in = new Scanner(System.in);
        String x;
        
        while(true){
            System.out.println("Enter num: ");
            x = in.nextLine();

            if (x.isEmpty()){
                break;
            }else{
                toSum.add(Integer.parseInt(x));
            }
        }          
        in.close();
        System.out.println(toSum);

        return toSum;
    }

    private static int sumOfAll(ArrayList<Integer> toSum){

        int sumInt = 0;
        for (int i : toSum) {
            sumInt+=i;
        }
        return sumInt;

    }
}