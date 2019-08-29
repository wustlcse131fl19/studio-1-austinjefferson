package studio1;

import support.cse131.ArgsProcessor;

public class Average {
    public static void main(String[] args){
        ArgsProcessor ap = new ArgsProcessor(args);
        int n1 = ap.nextInt("Put in the first integer:");
        int n2 = ap.nextInt("Put in the second integer?");
        double avg = (double)(n1 + n2) / 2;
        System.out.println("Average of " + n1 + " and " + n2 + " is " + avg + ".");
    }
}

//Ice Cream Q1: int, Q2: boolean, Q3: int, Q4: double, Q5: String, Q6: String, Q7: double, Q8: double.
