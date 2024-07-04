package Programming_Challenges.MultiplicationTable;

import java.util.Scanner;

public class MultiplcationTable {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Enter number for multiplication table: ");
        multiplcationTable(in.nextInt());

        in.close();

    }

    static void multiplcationTable(int num){

        for (int x = 1; x <= 10; x++){

            System.out.println(x + " x " + num + " = " + x*num);

        }

    }
    
}
