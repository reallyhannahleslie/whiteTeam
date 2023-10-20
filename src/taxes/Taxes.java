package taxes;

import java.util.Scanner;
public class Taxes {

    public static void main(int[] args){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter your income (rounded to the nearest whole number: ");
        int salary = sc.nextInt();

        //
        // Enter function to calculate tax and return tax rate here
        //
    }

//    static int incomeTax(int userIncome){
//
//        int taxBracket1 = 14999;
//        int taxBracket2 = 19999;
//        int taxBracket3 = 29999;
//        int taxBracket4 = 44999;
//
//        float taxPercent1 = 0.0F;
//        float taxPercent2 = 0.1F;
//        float taxPercent3 = 0.15F;
//        float taxPercent4 = 0.2F;
//        float taxPercent5 = 0.25F;
//
//        int tax;
//        if (userIncome <= taxBracket1)
//            tax=taxPercent1;
//        else if (userIncome <= taxBracket2)
//            tax= (int) ((taxBracket1*taxPercent1)+(userIncome*taxPercent2));
//        else if (UserIncome <= taxBracket3)
//            tax= (int) ((int j (userIncome-taxBracket3)*taxPercent3)+()
//
//    }

    public int[] checkBracket (int salary){
        int[][] brackets = {{0, 14999}, {15000, 19999}, {20000, 29999}, {30000, 44999}};
        int[]

        int taxTotal;
        int difference;

        for (int i = 0; i<= brackets.length; i++){
            if (salary>brackets[i][0] && salary<brackets[i][1]) {
                difference = salary-brackets[i][0];
                return [difference, i];
            }
            else taxTotal += brackets[i][2];
        }

        difference = salary-45000;
        return difference, i;
    }


}