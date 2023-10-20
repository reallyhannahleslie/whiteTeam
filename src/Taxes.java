package taxes;

import java.util.Scanner;
public class Taxes {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter your income (rounded to the nearest whole number: ");
        int salary = sc.nextInt();
        int[] outSalary = checkBracket(salary);
        int taxTotal = 0;

        System.out.println(outSalary[0]);
        System.out.println(outSalary[1]);
        System.out.println(outSalary[2]);
        System.out.println(outSalary[3]);

        int takeHome = calcTakeHome(outSalary);

        System.out.println(takeHome);
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
//            tax= (int) ((taxBracket1*taxPercent1)+(userIncome*0.1));
//        else if (UserIncome <= 29999)
//            tax= (int) ((userIncome-29999)*0.2)+()
//
//    }

    public static int[] checkBracket (int salary){
        int[][] brackets = {{0, 14999, 0}, {15000, 19999, 500}, {20000, 29999, 1500}, {30000, 44999, 3000}};
        int[] diffAndBracket = {0,4,0, salary};

        int taxTotal = 0;
        int difference;

        if (salary >= 45000) {
            diffAndBracket[0] = salary;
        }

        for (int i = 0; i< brackets.length; i++){
            if (salary>brackets[i][0] && salary<brackets[i][1]) {
                difference = salary-brackets[i][0];
                diffAndBracket[0] = difference;
                diffAndBracket[1] = i;
                break;
            }
            else {

                taxTotal += brackets[i][2];

            }
        }

        System.out.println("hello");

        diffAndBracket[2] = taxTotal;

        return diffAndBracket;
    }

    public static int calcTakeHome (int[] diffAndBracket) {
        double[] taxPercentages = {0.0, 0.1, 0.15, 0.2, 0.25};
        int taxTotal = diffAndBracket[2];

        int taxCalc = (int)Math.round((diffAndBracket[0] * taxPercentages[diffAndBracket[1]]));

        taxTotal += taxCalc;

        int takeHome = diffAndBracket[3] - taxTotal;

        return takeHome;
    }


}