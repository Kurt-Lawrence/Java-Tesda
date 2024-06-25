package Programming_Challenges.CheckLargestNum;


import java.util.Arrays;
import java.util.Scanner;

/**
 * <p> Continuously accepts a number and check the largest.
 * If all numbers were equal returns message that all numbers are equal.
 * 
 * @author Kurt Lawrence
 * @since 2024-06-26
 * 
 */

public class CheckLargestNum{

    public static void main(String[] args) {

        int[] nums = initArray(3);  

        System.out.println(checkLargest(nums)); 
  
    }



    private static int[] initArray(int arrayLength){    //argument takes how many numbers you want to compare

        Scanner in = new Scanner(System.in);

        System.out.println("Continuously enter " + arrayLength + " numbers: ");

        int[] nums = new int[arrayLength];
        for(int x = 0;x < nums.length;x++){   //loops x number of times and put numbers in an array
            nums[x] = in.nextInt();
        }

        in.close();

        return nums;   
    }

    private static String checkLargest(int[] arrayToCheck){    //argument takes the array to compare
        String largest; 
        boolean checkIfEquals = checkIfEquals(arrayToCheck);

        if(checkIfEquals == false){    //check if numbers in array are the same or equal
            Arrays.sort(arrayToCheck);    // sort the array

            System.out.println(Arrays.toString(arrayToCheck));

            largest = String.valueOf(arrayToCheck[arrayToCheck.length-1]);    //get the largest by taking the last element of sorted array
        }else{
            largest = "All numbers are equal";
        }

        return largest;

    }

    private static boolean checkIfEquals(int[] arrayToCheck){    //check if all numbers are equal

        boolean equalValues = true;

        for(int num:arrayToCheck){
            if (arrayToCheck[0] != num){
                equalValues = false;
                break;
            }
        }

        return equalValues;

    }
}